package com.sachin.cr.controller;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

import com.sachin.cr.api.domain.Clan;
import com.sachin.cr.service.ClanServiceImpl;

@RestController("/clans")
public class ClansRestController {

	@Autowired
	private ClanServiceImpl clanService;

	@GetMapping("/getClansByFilter")
	public List<Clan> getClansByFilter(@RequestParam("clanName") String clanName,
			@RequestParam("locationId") String locationId, @RequestParam("minMembers") Integer minMem,
			@RequestParam("maxMembers") Integer maxMem, @RequestParam("minScore") Integer minScore,
			@RequestParam("minMembers") Integer limit) throws RestClientException, URISyntaxException, IOException {
		return clanService.getClansByFilter(null);
	}
	
}
