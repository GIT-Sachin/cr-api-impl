package com.sachin.cr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sachin.cr.api.domain.Battle;
import com.sachin.cr.api.domain.Player;
import com.sachin.cr.api.domain.UpcomingChest;
import com.sachin.cr.service.PlayerServiceImpl;

@RestController("/players")
public class PlayersRestController {

	@Autowired
	private PlayerServiceImpl playerService;

	@GetMapping("/playerByTag/{playerTag}")
	public Player getPlayerByTag(@PathVariable("playerTag") String playerTag) {
		return playerService.getPlayerByTag(playerTag);
	}

	@GetMapping("/upcomingChests/{playerTag}")
	public List<UpcomingChest> getPlayerUpcomingChests(@PathVariable("playerTag") String playerTag) {
		return playerService.getPlayersUpcomingChests(playerTag);
	}

	@GetMapping("/warlog/{playerTag}")
	public List<Battle> getPlayerBattleLog(@PathVariable("playerTag") String playerTag) {
		return playerService.getPlayerBattleWarLog(playerTag);
	}
}
