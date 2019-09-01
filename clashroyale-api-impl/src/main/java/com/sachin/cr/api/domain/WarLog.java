package com.sachin.cr.api.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WarLog {

	private List<Standing> standings;
	private Integer seasonId;
	private List<Player> participants;
	private String createdDate;

	public String getCreatedDate() {
		return createdDate;
	}

	public List<Player> getParticipants() {
		return participants;
	}

	public Integer getSeasonId() {
		return seasonId;
	}

	public List<Standing> getStandings() {
		return standings;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public void setParticipants(List<Player> participants) {
		this.participants = participants;
	}

	public void setSeasonId(Integer seasonId) {
		this.seasonId = seasonId;
	}

	public void setStandings(List<Standing> standings) {
		this.standings = standings;
	}
}
