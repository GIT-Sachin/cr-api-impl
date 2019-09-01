package com.sachin.cr.api.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrentWar {

	private String state;
	private Clan clan;
	private List<Player> participants;
	private List<Clan> clans;
	private String collectionEndTime;
	private String warEndTime;

	public Clan getClan() {
		return clan;
	}

	public List<Clan> getClans() {
		return clans;
	}

	public String getCollectionEndTime() {
		return collectionEndTime;
	}

	public List<Player> getParticipants() {
		return participants;
	}

	public String getState() {
		return state;
	}

	public String getWarEndTime() {
		return warEndTime;
	}

	public void setClan(Clan clan) {
		this.clan = clan;
	}

	public void setClans(List<Clan> clans) {
		this.clans = clans;
	}

	public void setCollectionEndTime(String collectionEndTime) {
		this.collectionEndTime = collectionEndTime;
	}

	public void setParticipants(List<Player> participants) {
		this.participants = participants;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setWarEndTime(String warEndTime) {
		this.warEndTime = warEndTime;
	}

}
