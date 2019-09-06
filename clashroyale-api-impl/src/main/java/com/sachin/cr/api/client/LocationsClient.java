package com.sachin.cr.api.client;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

import com.sachin.cr.api.domain.ListOfClans;
import com.sachin.cr.api.domain.ListOfLocations;
import com.sachin.cr.api.domain.ListOfPlayers;
import com.sachin.cr.api.domain.Location;

@Component
public class LocationsClient extends ClashRoyaleClient {

	private String RELATIVE_PATH = "/locations";

	/**
	 * List Locations
	 * 
	 * @return
	 */
	public ListOfLocations getListOfAllLocations() {
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(crApiBaseUrl + RELATIVE_PATH);
		return restTemplate.exchange(builder.buildAndExpand().encode().toUri(), HttpMethod.GET,
				new HttpEntity<>(headers), ListOfLocations.class).getBody();
	}

	/**
	 * Get information about specific location
	 * 
	 * @param locationId
	 */
	public Location getLocationByLocationId(Long locationId) {
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(crApiBaseUrl + RELATIVE_PATH + "/{locationId}");
		return restTemplate.exchange(builder.buildAndExpand(locationId).encode().toUri(), HttpMethod.GET,
				new HttpEntity<>(headers), Location.class).getBody();
	}

	/**
	 * Get clan rankings for a specific location
	 * 
	 * @param locationId
	 * @return
	 */
	public ListOfClans getClanRankingsByLocationId(Long locationId) {
		UriComponentsBuilder builder = UriComponentsBuilder
				.fromHttpUrl(crApiBaseUrl + RELATIVE_PATH + "/{locationId}/rankings/clans");
		return restTemplate.exchange(builder.buildAndExpand(locationId).encode().toUri(), HttpMethod.GET,
				new HttpEntity<>(headers), ListOfClans.class).getBody();

	}

	/**
	 * Get clan rankings for a specific location 57000113 india
	 * 
	 * @param locationId
	 * @return
	 */
	public ListOfPlayers getPlayerRankingsByLocationId(Long locationId) {
		UriComponentsBuilder builder = UriComponentsBuilder
				.fromHttpUrl(crApiBaseUrl + RELATIVE_PATH + "/{locationId}/rankings/players");
		return restTemplate.exchange(builder.buildAndExpand(locationId).encode().toUri(), HttpMethod.GET,
				new HttpEntity<>(headers), ListOfPlayers.class).getBody();
	}

	/**
	 * Get clan war rankings for a specific location
	 * 
	 * @param locationId
	 * @return
	 */
	public ListOfClans getClanWarRankingsByLocationId(Long locationId) {
		UriComponentsBuilder builder = UriComponentsBuilder
				.fromHttpUrl(crApiBaseUrl + RELATIVE_PATH + "/{locationId}/rankings/clanwars");
		return restTemplate.exchange(builder.buildAndExpand(locationId).encode().toUri(), HttpMethod.GET,
				new HttpEntity<>(headers), ListOfClans.class).getBody();
	}
}
