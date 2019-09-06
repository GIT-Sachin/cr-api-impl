package com.sachin.cr.api.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UpcomingChest {

	private String name;
	private Integer index;
	private IconUrls iconUrls;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getIndex() {
		return index;
	}
	public void setIndex(Integer index) {
		this.index = index;
	}
	public IconUrls getIconUrls() {
		return iconUrls;
	}
	public void setIconUrls(IconUrls iconUrls) {
		this.iconUrls = iconUrls;
	}
	
	
}
