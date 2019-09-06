package com.sachin.cr.api.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ListOfClans {

	private List<Clan> items;

	public List<Clan> getItems() {
		return items;
	}

	public void setItems(List<Clan> items) {
		this.items = items;
	}
	
	
}
