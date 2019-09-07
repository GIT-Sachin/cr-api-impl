package com.sachin.cr.controller;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	@GetMapping("/getClansByClanName/{clanName}")
	public List<Clan> getClansByClanName(@PathVariable("clanName") String clanName)
			throws RestClientException, URISyntaxException, IOException {
		return clanService.getClansByClanName(clanName);
	}

	@GetMapping("/getClansByLocationId/{locationId}")
	public List<Clan> getClansByLocationId(@PathVariable("locationId") String locationId)
			throws RestClientException, URISyntaxException, IOException {
		return clanService.getClansByLocationId(locationId);
	}

	@GetMapping("/getClansByMaxMembers/{maxMembers}")
	public List<Clan> getClansByMaxMembers(@PathVariable("maxMembers") Integer maxMem)
			throws RestClientException, URISyntaxException, IOException {
		return clanService.getClansByMaxMembers(maxMem);
	}

	@GetMapping("/getClansByMinMembers/{minMembers}")
	public List<Clan> getClansByMinMembers(@PathVariable("minMembers") Integer minMem)
			throws RestClientException, URISyntaxException, IOException {
		return clanService.getClansByMinMembers(minMem);
	}

	@GetMapping("/getClansByMinScore")
	public List<Clan> getClansByMinScore(@PathVariable("minScore") Integer minScore)
			throws RestClientException, URISyntaxException, IOException {
		return clanService.getClansByMinScore(minScore);
	}

	@GetMapping("/getClansByFilters")
	public List<Clan> getClansByFilters(@RequestParam("requestParams") Map<String, String> filters) {
		return clanService.getClansByFilter(filters);
	}

}
