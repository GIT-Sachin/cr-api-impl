package com.sachin.cr.api.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ListOfCards {

	private List<Card> items;

	public List<Card> getItems() {
		return items;
	}

	public void setItems(List<Card> items) {
		this.items = items;
	}
}
