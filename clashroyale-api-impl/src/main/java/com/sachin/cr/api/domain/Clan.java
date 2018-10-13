package com.sachin.cr.api.domain;

public class Clan {

	private String tag;
	private String name;
	private Integer badgeId;
	private String type;
	private Integer clanScore;
	private Integer requiredTrophies;
	private Integer donationsPerWeek;
	private Integer clanChestLevel;
	private Integer clanChestMaxLevel;
	private Integer members;
	private Location location;
	private String description;
	private String clanChestStatus;
	private String clanChestPoints;
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getClanChestStatus() {
		return clanChestStatus;
	}

	public void setClanChestStatus(String clanChestStatus) {
		this.clanChestStatus = clanChestStatus;
	}

	public String getClanChestPoints() {
		return clanChestPoints;
	}

	public void setClanChestPoints(String clanChestPoints) {
		this.clanChestPoints = clanChestPoints;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getBadgeId() {
		return badgeId;
	}

	public void setBadgeId(Integer badgeId) {
		this.badgeId = badgeId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getClanScore() {
		return clanScore;
	}

	public void setClanScore(Integer clanScore) {
		this.clanScore = clanScore;
	}

	public Integer getRequiredTrophies() {
		return requiredTrophies;
	}

	public void setRequiredTrophies(Integer requiredTrophies) {
		this.requiredTrophies = requiredTrophies;
	}

	public Integer getDonationsPerWeek() {
		return donationsPerWeek;
	}

	public void setDonationsPerWeek(Integer donationsPerWeek) {
		this.donationsPerWeek = donationsPerWeek;
	}

	public Integer getClanChestLevel() {
		return clanChestLevel;
	}

	public void setClanChestLevel(Integer clanChestLevel) {
		this.clanChestLevel = clanChestLevel;
	}

	public Integer getClanChestMaxLevel() {
		return clanChestMaxLevel;
	}

	public void setClanChestMaxLevel(Integer clanChestMaxLevel) {
		this.clanChestMaxLevel = clanChestMaxLevel;
	}

	public Integer getMembers() {
		return members;
	}

	public void setMembers(Integer members) {
		this.members = members;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

}
