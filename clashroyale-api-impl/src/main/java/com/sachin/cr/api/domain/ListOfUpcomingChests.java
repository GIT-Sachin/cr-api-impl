package com.sachin.cr.api.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ListOfUpcomingChests {

	private List<UpcomingChest> items;

	public List<UpcomingChest> getItems() {
		return items;
	}

	public void setItems(List<UpcomingChest> items) {
		this.items = items;
	}

}
