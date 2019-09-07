package com.sachin.cr.service;

import java.util.List;
import java.util.Map;

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
		ListOfClans listOfClans = clansClient.getClansByFilter(filters);
		Assert.notNull(listOfClans, "No response received from API");
		Assert.notEmpty(listOfClans.getItems(), "Received empty response from API");
		return listOfClans.getItems();
	}

	public List<Clan> getClansByClanName(String clanName) {
		ListOfClans listOfClans = clansClient.getClansByFilter(CRUtils.getClansFilter("clanName", clanName));
		Assert.notNull(listOfClans, "No response received from API");
		Assert.notEmpty(listOfClans.getItems(), "Received empty response from API");
		return listOfClans.getItems();
	}

	public List<Clan> getClansByLocationId(String locationId) {
		ListOfClans listOfClans = clansClient.getClansByFilter(CRUtils.getClansFilter("locationId", locationId));
		Assert.notNull(listOfClans, "No response received from API");
		Assert.notEmpty(listOfClans.getItems(), "Received empty response from API");
		return listOfClans.getItems();
	}

	public List<Clan> getClansByMaxMembers(Integer maxMem) {
		ListOfClans listOfClans = clansClient
				.getClansByFilter(CRUtils.getClansFilter("maxMembers", String.valueOf(maxMem)));
		Assert.notNull(listOfClans, "No response received from API");
		Assert.notEmpty(listOfClans.getItems(), "Received empty response from API");
		return listOfClans.getItems();
	}

	public List<Clan> getClansByMinMembers(Integer minMem) {
		ListOfClans listOfClans = clansClient
				.getClansByFilter(CRUtils.getClansFilter("minMembers", String.valueOf(minMem)));
		Assert.notNull(listOfClans, "No response received from API");
		Assert.notEmpty(listOfClans.getItems(), "Received empty response from API");
		return listOfClans.getItems();
	}

	public List<Clan> getClansByMinScore(Integer minScore) {
		ListOfClans listOfClans = clansClient
				.getClansByFilter(CRUtils.getClansFilter("minScore", String.valueOf(minScore)));
		Assert.notNull(listOfClans, "No response received from API");
		Assert.notEmpty(listOfClans.getItems(), "Received empty response from API");
		return listOfClans.getItems();
	}
}
