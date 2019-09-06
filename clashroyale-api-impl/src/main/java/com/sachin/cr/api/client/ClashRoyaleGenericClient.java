package com.sachin.cr.api.client;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

import com.sachin.cr.api.domain.ListOfCards;

@Component
public class ClashRoyaleGenericClient extends ClashRoyaleClient {

	public ListOfCards getListOfCards() {
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(crApiBaseUrl + "/cards");
		return restTemplate.exchange(builder.buildAndExpand().encode().toUri(), HttpMethod.GET,
				new HttpEntity<>(headers), ListOfCards.class).getBody();
	}
}
