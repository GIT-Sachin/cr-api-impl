package com.sachin.cr.api.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LeagueStatistics {

	private Season currentSeason;
	private Season previousSeason;
	private Season bestSeason;

	public Season getBestSeason() {
		return bestSeason;
	}

	public Season getCurrentSeason() {
		return currentSeason;
	}

	public Season getPreviousSeason() {
		return previousSeason;
	}

	public void setBestSeason(Season bestSeason) {
		this.bestSeason = bestSeason;
	}

	public void setCurrentSeason(Season currentSeason) {
		this.currentSeason = currentSeason;
	}

	public void setPreviousSeason(Season previousSeason) {
		this.previousSeason = previousSeason;
	}

}
