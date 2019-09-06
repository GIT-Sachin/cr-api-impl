package com.sachin.cr.api.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

public class ClashRoyaleClient {

	@Autowired
	protected RestTemplate restTemplate;

	@Value("${cr.base.url}")
	protected String crApiBaseUrl;

	@Value("${cr.key}")
	protected String crKey;

	@Autowired
	protected HttpHeaders headers;
}
