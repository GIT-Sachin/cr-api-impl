package com.sachin.cr.service;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.sachin.cr.api.domain.Clan;

@Component
public class ClanServiceImpl {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${cr.base.url}")
	private String crApiBaseUrl;

	@Value("${cr.key}")
	private String crKey;

	@Autowired
	private HttpHeaders headers;

	public List<Clan> getClansByFilter(Map<String,String> filterParams) throws RestClientException, URISyntaxException {
		Gson gson = new Gson();
		String cardsResponse = restTemplate
				.exchange(new URI(crApiBaseUrl + "/clans"), HttpMethod.GET, new HttpEntity<>(headers), String.class)
				.getBody();
		JsonObject obj = new JsonParser().parse(cardsResponse).getAsJsonObject();
		List<Clan> cards = gson.fromJson((obj.get("items")).getAsJsonArray(), new TypeToken<List<Clan>>() {
			private static final long serialVersionUID = 1L;
		}.getType());
		return cards;

	}
}
