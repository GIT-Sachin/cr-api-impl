package com.sachin.cr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sachin.cr.api.domain.Battle;
import com.sachin.cr.api.domain.Player;
import com.sachin.cr.api.domain.UpcomingChest;
import com.sachin.cr.service.PlayerServiceImpl;

@RestController
@RequestMapping("/players")
public class PlayersRestController {

	@Autowired
	private PlayerServiceImpl playerService;

	@GetMapping("/playerByTag")
	public Player getPlayerByTag(@RequestParam("playerTag") String playerTag) {
		return playerService.getPlayerByTag(playerTag);
	}

	@GetMapping("/upcomingChests")
	public List<UpcomingChest> getPlayerUpcomingChests(@RequestParam("playerTag") String playerTag) {
		return playerService.getPlayersUpcomingChests(playerTag);
	}

	@GetMapping("/warlog")
	public List<Battle> getPlayerBattleLog(@RequestParam("playerTag") String playerTag) {
		return playerService.getPlayerBattleWarLog(playerTag);
	}
}
