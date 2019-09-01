package com.sachin.cr.controller;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

import com.sachin.cr.api.domain.Clan;
import com.sachin.cr.service.ClanServiceImpl;

@RestController
@RequestMapping("/clans")
public class ClansRestController {

	@Autowired
	private ClanServiceImpl clanService;

	@GetMapping("/getClansByClanName")
	public List<Clan> getClansByClanName(@RequestParam("clanName") String clanName)
			throws RestClientException, URISyntaxException, IOException {
		Map<String, Object> filterParms = new HashMap<>();
		filterParms.put("clanName", clanName);
		return clanService.getClansByFilter(filterParms);
	}

	@GetMapping("/getClansByLocationId")
	public List<Clan> getClansByLocationId(@RequestParam("locationId") String locationId)
			throws RestClientException, URISyntaxException, IOException {
		Map<String, Object> filterParms = new HashMap<>();
		filterParms.put("locationId", locationId);
		return clanService.getClansByFilter(filterParms);
	}

	@GetMapping("/getClansByMaxMembers")
	public List<Clan> getClansByMaxMembers(@RequestParam("maxMembers") Integer maxMem)
			throws RestClientException, URISyntaxException, IOException {
		Map<String, Object> filterParms = new HashMap<>();
		filterParms.put("maxMembers", maxMem);
		return clanService.getClansByFilter(filterParms);
	}

	@GetMapping("/getClansByMinMembers")
	public List<Clan> getClansByMinMembers(@RequestParam("minMembers") Integer minMem)
			throws RestClientException, URISyntaxException, IOException {
		Map<String, Object> filterParms = new HashMap<>();
		filterParms.put("minMembers", minMem);
		return clanService.getClansByFilter(filterParms);
	}

	@GetMapping("/getClansByMinScore")
	public List<Clan> getClansByMinScore(@RequestParam("minScore") Integer minScore)
			throws RestClientException, URISyntaxException, IOException {
		Map<String, Object> filterParms = new HashMap<>();
		filterParms.put("minScore", minScore);
		return clanService.getClansByFilter(filterParms);
	}

}
