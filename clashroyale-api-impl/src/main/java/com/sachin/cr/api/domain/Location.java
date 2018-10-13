package com.sachin.cr.api.domain;

public class Location {

	private String id;
	private String name;
	private Boolean isCountry;
	private String countryCode;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getIsCountry() {
		return isCountry;
	}

	public void setIsCountry(Boolean isCountry) {
		this.isCountry = isCountry;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

}
