package com.sachin.cr.service;

import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.sachin.cr.api.domain.Clan;
import com.sachin.cr.api.domain.Location;
import com.sachin.cr.api.domain.Player;

@Component
public class LocationServiceImpl {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${cr.base.url}")
	private String crApiBaseUrl;

	@Value("${cr.key}")
	private String crKey;

	@Autowired
	private HttpHeaders headers;

	public List<Location> getAllLocations() throws RestClientException, URISyntaxException {
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(crApiBaseUrl + "/locations");
		Gson gson = new Gson();
		String locationResponse = restTemplate
				.exchange(builder.build(true).toUri(), HttpMethod.GET, new HttpEntity<>(headers), String.class)
				.getBody();
		JsonObject obj = new JsonParser().parse(locationResponse).getAsJsonObject();
		List<Location> locations = gson.fromJson((obj.get("items")).getAsJsonArray(), new TypeToken<List<Location>>() {
			private static final long serialVersionUID = 1L;
		}.getType());
		return locations;

	}

	public List<Clan> getClanRankingsByLocationId(String locationId) {
		UriComponentsBuilder builder = UriComponentsBuilder
				.fromHttpUrl(crApiBaseUrl + "/locations/{locationId}/rankings/clans");
		Gson gson = new Gson();
		String locationsResponse = restTemplate.exchange(builder.buildAndExpand(locationId).toUri(), HttpMethod.GET,
				new HttpEntity<>(headers), String.class).getBody();
		JsonObject obj = new JsonParser().parse(locationsResponse).getAsJsonObject();
		List<Clan> clans = gson.fromJson((obj.get("items")).getAsJsonArray(), new TypeToken<List<Clan>>() {
			private static final long serialVersionUID = 1L;
		}.getType());
		return clans;
	}

	public List<Clan> getClanWarRankingsByLocationId(String locationId) {
		UriComponentsBuilder builder = UriComponentsBuilder
				.fromHttpUrl(crApiBaseUrl + "/locations/{locationId}/rankings/clanwars");
		Gson gson = new Gson();
		String locationsResponse = restTemplate.exchange(builder.buildAndExpand(locationId).toUri(), HttpMethod.GET,
				new HttpEntity<>(headers), String.class).getBody();
		JsonObject obj = new JsonParser().parse(locationsResponse).getAsJsonObject();
		List<Clan> clans = gson.fromJson((obj.get("items")).getAsJsonArray(), new TypeToken<List<Clan>>() {
			private static final long serialVersionUID = 1L;
		}.getType());
		return clans;
	}

	public Location getLocationByLocationId(String locationId) throws RestClientException, URISyntaxException {
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(crApiBaseUrl + "/locations/{locationId}");
		Gson gson = new Gson();
		String locationResponse = restTemplate.exchange(builder.buildAndExpand(locationId).toUri(), HttpMethod.GET,
				new HttpEntity<>(headers), String.class).getBody();
		Location location = gson.fromJson(locationResponse, Location.class);
		return location;
	}

	public List<Player> getPlayerRankingsByLocationId(String locationId) {
		UriComponentsBuilder builder = UriComponentsBuilder
				.fromHttpUrl(crApiBaseUrl + "/locations/{locationId}/rankings/players");
		Gson gson = new Gson();
		String locationsResponse = restTemplate.exchange(builder.buildAndExpand(locationId).toUri(), HttpMethod.GET,
				new HttpEntity<>(headers), String.class).getBody();
		JsonObject obj = new JsonParser().parse(locationsResponse).getAsJsonObject();
		List<Player> players = gson.fromJson((obj.get("items")).getAsJsonArray(), new TypeToken<List<Player>>() {
			private static final long serialVersionUID = 1L;
		}.getType());
		return players;
	}
}
