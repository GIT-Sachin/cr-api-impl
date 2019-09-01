package com.sachin.cr.api.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Card {

	private String name;
	private String id;
	private String maxLevel;
	private IconUrls iconUrls;

	public IconUrls getIconUrls() {
		return iconUrls;
	}

	public String getId() {
		return id;
	}

	public String getMaxLevel() {
		return maxLevel;
	}

	public String getName() {
		return name;
	}

	public void setIconUrls(IconUrls iconUrls) {
		this.iconUrls = iconUrls;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setMaxLevel(String maxLevel) {
		this.maxLevel = maxLevel;
	}

	public void setName(String name) {
		this.name = name;
	}
}
