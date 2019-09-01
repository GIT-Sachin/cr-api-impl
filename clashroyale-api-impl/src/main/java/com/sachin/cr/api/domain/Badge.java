package com.sachin.cr.api.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Badge {

	private Integer maxLevel;
	private Integer progress;
	private Integer level;
	private Integer target;
	private String name;

	public Integer getLevel() {
		return level;
	}

	public Integer getMaxLevel() {
		return maxLevel;
	}

	public String getName() {
		return name;
	}

	public Integer getProgress() {
		return progress;
	}

	public Integer getTarget() {
		return target;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public void setMaxLevel(Integer maxLevel) {
		this.maxLevel = maxLevel;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setProgress(Integer progress) {
		this.progress = progress;
	}

	public void setTarget(Integer target) {
		this.target = target;
	}

}
