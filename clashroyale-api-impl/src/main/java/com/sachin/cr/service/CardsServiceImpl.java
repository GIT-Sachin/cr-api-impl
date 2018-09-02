package com.sachin.cr.service;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.client.ClientHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Component
public class CardsServiceImpl {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${cr.base.url}")
	private String crApiBaseUrl;

	@Value("${cr.key}")
	private String crKey;

	@Autowired
	private HttpHeaders headers;

	public String getCards() throws RestClientException, URISyntaxException {
		
		return restTemplate.exchange(new URI(crApiBaseUrl + "/cards"), HttpMethod.GET, new HttpEntity<>(headers),
				String.class).getBody();

	}
}
