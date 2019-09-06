package com.sachin.cr.api.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ListOfPlayers {

	private List<Player> items;

	public List<Player> getItems() {
		return items;
	}

	public void setItems(List<Player> items) {
		this.items = items;
	}
}
