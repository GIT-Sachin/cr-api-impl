package com.sachin.cr.api.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Standing {

	private Integer trophyChange;
	private Clan clan;

	public Clan getClan() {
		return clan;
	}

	public Integer getTrophyChange() {
		return trophyChange;
	}

	public void setClan(Clan clan) {
		this.clan = clan;
	}

	public void setTrophyChange(Integer trophyChange) {
		this.trophyChange = trophyChange;
	}

}
