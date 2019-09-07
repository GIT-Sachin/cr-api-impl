package com.sachin.cr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import com.sachin.cr.api.client.LocationsClient;
import com.sachin.cr.api.domain.Clan;
import com.sachin.cr.api.domain.ListOfClans;
import com.sachin.cr.api.domain.ListOfLocations;
import com.sachin.cr.api.domain.ListOfPlayers;
import com.sachin.cr.api.domain.Location;
import com.sachin.cr.api.domain.Player;

@Component
public class LocationServiceImpl {

	@Autowired
	private LocationsClient locationsClient;

	public List<Location> getAllLocations() {
		ListOfLocations locations = locationsClient.getListOfAllLocations();
		Assert.notNull(locations, "No response received from API");
		Assert.notEmpty(locations.getItems(), "No locations received from API");
		return locations.getItems();
	}

	public List<Clan> getClanRankingsByLocationId(String locationId) {
		Assert.notNull(locationId, "Location Id cannot be null");
		ListOfClans listOfClans = locationsClient.getClanRankingsByLocationId(Long.valueOf(locationId));
		Assert.notNull(listOfClans, "No response received from API");
		Assert.notEmpty(listOfClans.getItems(), "No locations received from API");
		return listOfClans.getItems();
	}

	public List<Clan> getClanWarRankingsByLocationId(String locationId) {
		Assert.notNull(locationId, "Location Id cannot be null");
		ListOfClans listOfClans = locationsClient.getClanWarRankingsByLocationId(Long.valueOf(locationId));
		Assert.notNull(listOfClans, "No response received from API");
		Assert.notEmpty(listOfClans.getItems(), "No locations received from API");
		return listOfClans.getItems();
	}

	public Location getLocationByLocationId(String locationId) {
		Assert.notNull(locationId, "Location Id cannot be null");
		Location location = locationsClient.getLocationByLocationId(Long.valueOf(locationId));
		Assert.notNull(location, "Location does not exist");
		return location;
	}

	public List<Player> getPlayerRankingsByLocationId(String locationId) {
		Assert.notNull(locationId, "Location Id cannot be null");
		ListOfPlayers listOfPlayers = locationsClient.getPlayerRankingsByLocationId(Long.valueOf(locationId));
		Assert.notNull(listOfPlayers, "No response received from API");
		Assert.notEmpty(listOfPlayers.getItems(), "No locations received from API");
		return listOfPlayers.getItems();
	}

}
