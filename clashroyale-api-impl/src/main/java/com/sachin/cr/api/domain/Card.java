package com.sachin.cr.api.domain;

public class Card {

	private String name;
	private String id;
	private String maxLevel;
	private IconUrls iconUrls;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMaxLevel() {
		return maxLevel;
	}

	public void setMaxLevel(String maxLevel) {
		this.maxLevel = maxLevel;
	}

	public IconUrls getIconUrls() {
		return iconUrls;
	}

	public void setIconUrls(IconUrls iconUrls) {
		this.iconUrls = iconUrls;
	}
}

class IconUrls {
	private String medium;

	public String getMedium() {
		return medium;
	}

	public void setMedium(String medium) {
		this.medium = medium;
	}
	
	
}