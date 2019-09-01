package com.sachin.cr.api.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Achievement {

	private Integer stars;
	private Integer value;
	private String name;
	private Integer target;
	private String info;
	private String completionInfo;

	public String getCompletionInfo() {
		return completionInfo;
	}

	public String getInfo() {
		return info;
	}

	public String getName() {
		return name;
	}

	public Integer getStars() {
		return stars;
	}

	public Integer getTarget() {
		return target;
	}

	public Integer getValue() {
		return value;
	}

	public void setCompletionInfo(String completionInfo) {
		this.completionInfo = completionInfo;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStars(Integer stars) {
		this.stars = stars;
	}

	public void setTarget(Integer target) {
		this.target = target;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

}
