package com.sachin.cr.api.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Season {

	private Integer rank;
	private Integer trophies;
	private Integer bestTrophies;
	private String id;

	public Integer getBestTrophies() {
		return bestTrophies;
	}

	public String getId() {
		return id;
	}

	public Integer getRank() {
		return rank;
	}

	public Integer getTrophies() {
		return trophies;
	}

	public void setBestTrophies(Integer bestTrophies) {
		this.bestTrophies = bestTrophies;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public void setTrophies(Integer trophies) {
		this.trophies = trophies;
	}

}
