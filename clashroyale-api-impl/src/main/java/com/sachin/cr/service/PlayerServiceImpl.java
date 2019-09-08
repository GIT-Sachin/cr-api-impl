package com.sachin.cr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import com.sachin.cr.api.client.PlayersClient;
import com.sachin.cr.api.domain.Battle;
import com.sachin.cr.api.domain.Player;
import com.sachin.cr.api.domain.UpcomingChest;

@Component
public class PlayerServiceImpl {

	@Autowired
	private PlayersClient playerClient;

	public Player getPlayerByTag(String playerTag) {
		Assert.notNull(playerTag, "Player tag cannot be null");
		return playerClient.getPlayerByPlayerTag(playerTag);
	}

	public List<UpcomingChest> getPlayersUpcomingChests(String playerTag) {
		Assert.notNull(playerTag, "Player tag cannot be null");
		return playerClient.getUpcomingChestsForPlayer(playerTag).getItems();
	}

	public List<Battle> getPlayerBattleWarLog(String playerTag) {
		Assert.notNull(playerTag, "Player tag cannot be null");
		return playerClient.getPlayerBattleLog(playerTag);
	}

}
