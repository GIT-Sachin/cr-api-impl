package com.sachin.cr.api.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Arena {

	private String localizedShortName;

	private String locallizedName;

	private String name;

	private Integer id;

	private List<IconUrls> iconUrls;

	public List<IconUrls> getIconUrls() {
		return iconUrls;
	}

	public Integer getId() {
		return id;
	}

	public String getLocalizedShortName() {
		return localizedShortName;
	}

	public String getLocallizedName() {
		return locallizedName;
	}

	public String getName() {
		return name;
	}

	public void setIconUrls(List<IconUrls> iconUrls) {
		this.iconUrls = iconUrls;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setLocalizedShortName(String localizedShortName) {
		this.localizedShortName = localizedShortName;
	}

	public void setLocallizedName(String locallizedName) {
		this.locallizedName = locallizedName;
	}

	public void setName(String name) {
		this.name = name;
	}

}
