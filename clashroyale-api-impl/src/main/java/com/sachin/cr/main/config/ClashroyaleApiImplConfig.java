package com.sachin.cr.main.config;

import java.nio.charset.Charset;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

import com.ulisesbocchio.jasyptspringboot.annotation.EncryptablePropertySource;

@EncryptablePropertySource("classpath:${spring.application.name}-${spring.profiles.active}.properties")
@Configuration
public class ClashroyaleApiImplConfig {

	@Value("${cr.key}")
	private String crKey;
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	@Bean
	public HttpHeaders httpHeaders() {
		HttpHeaders headers = new HttpHeaders();
		headers.set("Authorization", crKey);
		return headers;
		/*return new HttpHeaders() {{
	         String authHeader = "Bearer " + new String( crKey );
	         set( "Authorization", authHeader );
	      }};*/
	}
}
