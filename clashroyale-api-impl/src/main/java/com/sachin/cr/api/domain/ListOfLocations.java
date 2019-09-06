package com.sachin.cr.api.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ListOfLocations {

	private List<Location> items;

	public List<Location> getItems() {
		return items;
	}

	public void setItems(List<Location> items) {
		this.items = items;
	}
}
