package com.sachin.cr.api.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

public class ClashRoyaleClient {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${cr.base.url}")
	private String crApiBaseUrl;

	@Value("${cr.key}")
	private String crKey;

	@Autowired
	private HttpHeaders headers;
}
