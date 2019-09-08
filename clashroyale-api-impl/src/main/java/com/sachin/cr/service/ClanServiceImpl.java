package com.sachin.cr.service;

import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import com.sachin.cr.api.client.ClansClient;
import com.sachin.cr.api.domain.Clan;
import com.sachin.cr.api.domain.ListOfClans;
import com.sachin.cr.api.util.CRUtils;

@Component
public class ClanServiceImpl {

	@Autowired
	private ClansClient clansClient;

	public List<Clan> getClansByFilter(Map<String, String> filters) {
		Assert.notEmpty(filters, "At least one filter has to be specified");
		ListOfClans listOfClans = clansClient.getClansByFilter(filters);
		Assert.notNull(listOfClans, "No response received from API");
		Assert.notEmpty(listOfClans.getItems(), "Received empty response from API");
		return listOfClans.getItems();
	}

	public List<Clan> getClansByClanName(String clanName) {
		Assert.notNull("Clan name cannot be blank", clanName);
		ListOfClans listOfClans = clansClient.getClansByFilter(CRUtils.getClansFilter("name", clanName));
		Assert.notNull(listOfClans, "No response received from API");
		Assert.notEmpty(listOfClans.getItems(), "Received empty response from API");
		return listOfClans.getItems();
	}

	public List<Clan> getClansByLocationId(String locationId) {
		Assert.notNull("Location Id cannot be blank", locationId);
		ListOfClans listOfClans = clansClient.getClansByFilter(CRUtils.getClansFilter("locationId", locationId));
		Assert.notNull(listOfClans, "No response received from API");
		Assert.notEmpty(listOfClans.getItems(), "Received empty response from API");
		return listOfClans.getItems();
	}

	public List<Clan> getClansByMaxMembers(@NotNull Integer maxMem) {
		ListOfClans listOfClans = clansClient
				.getClansByFilter(CRUtils.getClansFilter("maxMembers", String.valueOf(maxMem)));
		Assert.notNull(listOfClans, "No response received from API");
		Assert.notEmpty(listOfClans.getItems(), "Received empty response from API");
		return listOfClans.getItems();
	}

	public List<Clan> getClansByMinMembers(@NotNull(message = "Minimum members should not be null") Integer minMem) {
		ListOfClans listOfClans = clansClient
				.getClansByFilter(CRUtils.getClansFilter("minMembers", String.valueOf(minMem)));
		Assert.notNull(listOfClans, "No response received from API");
		Assert.notEmpty(listOfClans.getItems(), "Received empty response from API");
		return listOfClans.getItems();
	}

	public List<Clan> getClansByMinScore(@NotNull Integer minScore) {
		ListOfClans listOfClans = clansClient
				.getClansByFilter(CRUtils.getClansFilter("minScore", String.valueOf(minScore)));
		Assert.notNull(listOfClans, "No response received from API");
		Assert.notEmpty(listOfClans.getItems(), "Received empty response from API");
		return listOfClans.getItems();
	}
}
