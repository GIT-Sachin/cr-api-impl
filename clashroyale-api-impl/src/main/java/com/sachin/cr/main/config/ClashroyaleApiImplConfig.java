package com.sachin.cr.main.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

import com.sachin.cr.handlers.exception.CRAPIRestTemplateExceptionHandler;
import com.ulisesbocchio.jasyptspringboot.annotation.EncryptablePropertySource;

@EncryptablePropertySource("classpath:${spring.application.name}-${spring.profiles.active}.properties")
@Configuration
public class ClashroyaleApiImplConfig {

	@Value("${cr.key}")
	private String crKey;
	
	@Autowired
	private CRAPIRestTemplateExceptionHandler errorHandler;
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.errorHandler(errorHandler).build();
	}
	
	@Bean
	public HttpHeaders httpHeaders() {
		HttpHeaders headers = new HttpHeaders();
		headers.set("Authorization", crKey);
		return headers;
	}
}
