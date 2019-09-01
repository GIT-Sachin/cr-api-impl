package com.sachin.cr.api.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Location {

	private String id;
	private String name;
	private Boolean isCountry;
	private String countryCode;
	private String localizedName;

	public String getCountryCode() {
		return countryCode;
	}

	public String getId() {
		return id;
	}

	public Boolean getIsCountry() {
		return isCountry;
	}

	public String getLocalizedName() {
		return localizedName;
	}

	public String getName() {
		return name;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setIsCountry(Boolean isCountry) {
		this.isCountry = isCountry;
	}

	public void setLocalizedName(String localizedName) {
		this.localizedName = localizedName;
	}

	public void setName(String name) {
		this.name = name;
	}

}
