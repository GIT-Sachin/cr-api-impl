package com.sachin.cr.api.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ListOfStandings {

	private List<Standing> items;

	public List<Standing> getItems() {
		return items;
	}

	public void setItems(List<Standing> items) {
		this.items = items;
	}
	
	
}
