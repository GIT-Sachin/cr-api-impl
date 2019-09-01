package com.sachin.cr.controller;

import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

import com.sachin.cr.api.domain.Clan;
import com.sachin.cr.api.domain.Location;
import com.sachin.cr.api.domain.Player;
import com.sachin.cr.service.LocationServiceImpl;

@RestController
@RequestMapping(path = { "/locations" }, method = RequestMethod.GET)
public class LocationRestController {

	@Autowired
	private LocationServiceImpl locationService;

	/**
	 * 
	 * @return List of all locations by calling Clash Royale API
	 * @throws RestClientException
	 * @throws URISyntaxException
	 */
	@GetMapping("getAllLocations")
	public List<Location> getAllLocations() throws RestClientException, URISyntaxException {
		return locationService.getAllLocations();
	}

	/**
	 * 
	 * @param locationId
	 * @return Clans ordered by rankings based on locationId
	 */
	@GetMapping("{locationId}/rankings/clans")
	public List<Clan> getClanRankingsByLocationId(@PathVariable("locationId") String locationId) {
		return locationService.getClanRankingsByLocationId(locationId);
	}

	@GetMapping("{locationId}/rankings/clanwars")
	public List<Clan> getClanWarRankingsByLocationId(@PathVariable("locationId") String locationId) {
		return locationService.getClanWarRankingsByLocationId(locationId);
	}
	
	/**
	 * 
	 * @param locationId
	 * @return Location object for corresponding locationId
	 * @throws RestClientException
	 * @throws URISyntaxException
	 */
	@GetMapping("{locationId}")
	public Location getLocationByLocationId(@PathVariable("locationId") String locationId)
			throws RestClientException, URISyntaxException {
		return locationService.getLocationByLocationId(locationId);
	}
	
	
	@GetMapping("{locationId}/rankings/players")
	public List<Player> getPlayerRankingsByLocationId(@PathVariable("locationId") String locationId) {
		return locationService.getPlayerRankingsByLocationId(locationId);
	}
	
}
