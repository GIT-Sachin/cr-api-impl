package com.sachin.cr.api.domain;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Battle {

	private String type;
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyyMMdd'T'hhmmss.SSS'Z'")
	private Date battleTime;
	private Boolean isLadderTournment;
	private Arena arena;
	private GameMode gameMode;
	private String deckSelection;
	private Long challengeId;
	private Integer challangeWinCountBefore;
	private List<Player> team;
	private List<Player> opponent;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getBattleTime() {
		return battleTime;
	}
	public void setBattleTime(Date battleTime) {
		this.battleTime = battleTime;
	}
	public Boolean getIsLadderTournment() {
		return isLadderTournment;
	}
	public void setIsLadderTournment(Boolean isLadderTournment) {
		this.isLadderTournment = isLadderTournment;
	}
	public Arena getArena() {
		return arena;
	}
	public void setArena(Arena arena) {
		this.arena = arena;
	}
	public GameMode getGameMode() {
		return gameMode;
	}
	public void setGameMode(GameMode gameMode) {
		this.gameMode = gameMode;
	}
	public String getDeckSelection() {
		return deckSelection;
	}
	public void setDeckSelection(String deckSelection) {
		this.deckSelection = deckSelection;
	}
	public Long getChallengeId() {
		return challengeId;
	}
	public void setChallengeId(Long challengeId) {
		this.challengeId = challengeId;
	}
	public Integer getChallangeWinCountBefore() {
		return challangeWinCountBefore;
	}
	public void setChallangeWinCountBefore(Integer challangeWinCountBefore) {
		this.challangeWinCountBefore = challangeWinCountBefore;
	}
	public List<Player> getTeam() {
		return team;
	}
	public void setTeam(List<Player> team) {
		this.team = team;
	}
	public List<Player> getOpponent() {
		return opponent;
	}
	public void setOpponent(List<Player> opponent) {
		this.opponent = opponent;
	}
}
