package com.sachin.cr.handlers.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.ResponseErrorHandler;

import com.google.gson.Gson;
import com.sachin.cr.api.domain.ExceptionResponse;

@Component
public class CRAPIRestTemplateExceptionHandler implements ResponseErrorHandler {
	
	Logger LOG = LoggerFactory.getLogger(getClass());

	@Override
	public void handleError(ClientHttpResponse response) throws IOException,CRAPIException {
		Gson gson = new Gson();
		String s = new BufferedReader(new InputStreamReader(response.getBody())).lines().collect(Collectors.joining("\n"));
		LOG.debug(s);
		ExceptionResponse exception=gson.fromJson(s, ExceptionResponse.class);
		switch (response.getStatusCode().value()) {
		case 400:
			throw new CRAPIException("Bad Request :"+exception.getMessage());
		case 403:
			throw new CRAPIException("Access Denied :"+exception.getMessage());
		case 404:
			throw new CRAPIException("Resource Not Found :"+exception.getMessage());
		case 429:
			throw new CRAPIException("Request Throttled :"+exception.getMessage());
		case 500:
			throw new CRAPIException("Internal server error :"+exception.getMessage());
		case 503:
			throw new CRAPIException("Service unavailable :"+exception.getMessage());
		default:
			break;
		}
	}

	@Override
	public boolean hasError(ClientHttpResponse response) throws IOException {
		return (response.getStatusCode().is4xxClientError() || response.getStatusCode().is5xxServerError());
	}

}
