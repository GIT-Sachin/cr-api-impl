package com.sachin.cr.api.client;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import org.springframework.web.util.UriComponentsBuilder;

import com.sachin.cr.api.domain.Battle;
import com.sachin.cr.api.domain.ListOfUpcomingChests;
import com.sachin.cr.api.domain.Player;

@Component
public class PlayersClient extends ClashRoyaleClient {

	private String RELATIVE_PATH = "/players";

	/**
	 * Get information about a single player by player tag. Player tags can be found
	 * either in game or by from clan member lists. Note that player tags start with
	 * hash character '#' and that needs to be URL-encoded properly to work in URL,
	 * so for example player tag '#2ABC' would become '%232ABC' in the URL.
	 * 
	 * @param playerTag
	 * @return
	 */
	public Player getPlayerByPlayerTag(String playerTag) {
		Assert.notNull(playerTag, "Playertag is mandatory");
		Assert.isTrue(StringUtils.isNotBlank(playerTag), "Clantag cannot be blank");
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(crApiBaseUrl + RELATIVE_PATH + "/{playerTag}");
		return restTemplate.exchange(builder.buildAndExpand(playerTag).encode().toUri(), HttpMethod.GET,
				new HttpEntity<>(headers), Player.class).getBody();
	}

	/**
	 * Get list of reward chests that the player will receive next in the game.
	 * 
	 * @param playerTag
	 * @return
	 */
	public ListOfUpcomingChests getUpcomingChestsForPlayer(String playerTag) {
		Assert.notNull(playerTag, "Playertag is mandatory");
		Assert.isTrue(StringUtils.isNotBlank(playerTag), "Clantag cannot be blank");
		UriComponentsBuilder builder = UriComponentsBuilder
				.fromHttpUrl(crApiBaseUrl + RELATIVE_PATH + "/{playerTag}/upcomingchests");
		return restTemplate.exchange(builder.buildAndExpand(playerTag).encode().toUri(), HttpMethod.GET,
				new HttpEntity<>(headers), ListOfUpcomingChests.class).getBody();
	}

	/**
	 * Get list of recent battles for a player
	 * 
	 * @param playerTag
	 * @return
	 */
	public List<Battle> getPlayerBattleLog(String playerTag) {
		Assert.notNull(playerTag, "Playertag is mandatory");
		Assert.isTrue(StringUtils.isNotBlank(playerTag), "Clantag cannot be blank");
		UriComponentsBuilder builder = UriComponentsBuilder
				.fromHttpUrl(crApiBaseUrl + RELATIVE_PATH + "/{playerTag}/battlelog");
		return restTemplate.exchange(builder.buildAndExpand(playerTag).encode().toUri(), HttpMethod.GET,
				new HttpEntity<>(headers), new ParameterizedTypeReference<List<Battle>>() {
				}).getBody();
	}

}
