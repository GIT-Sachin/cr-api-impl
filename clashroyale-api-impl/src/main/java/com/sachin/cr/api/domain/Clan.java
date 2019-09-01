package com.sachin.cr.api.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
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
	private Integer rank;
	private Integer previousRank;
	private Integer clanWarTrophies;
	private List<IconUrls> badgeUrls;
	private Integer crowns;
	private Integer participants;
	private Integer battlesPlayed;
	private Integer wins;

	public Integer getBadgeId() {
		return badgeId;
	}

	public List<IconUrls> getBadgeUrls() {
		return badgeUrls;
	}

	public Integer getBattlesPlayed() {
		return battlesPlayed;
	}

	public Integer getClanChestLevel() {
		return clanChestLevel;
	}

	public Integer getClanChestMaxLevel() {
		return clanChestMaxLevel;
	}

	public String getClanChestPoints() {
		return clanChestPoints;
	}

	public String getClanChestStatus() {
		return clanChestStatus;
	}

	public Integer getClanScore() {
		return clanScore;
	}

	public Integer getClanWarTrophies() {
		return clanWarTrophies;
	}

	public Integer getCrowns() {
		return crowns;
	}

	public String getDescription() {
		return description;
	}

	public Integer getDonationsPerWeek() {
		return donationsPerWeek;
	}

	public Location getLocation() {
		return location;
	}

	public Integer getMembers() {
		return members;
	}

	public String getName() {
		return name;
	}

	public Integer getParticipants() {
		return participants;
	}

	public Integer getPreviousRank() {
		return previousRank;
	}

	public Integer getRank() {
		return rank;
	}

	public Integer getRequiredTrophies() {
		return requiredTrophies;
	}

	public String getTag() {
		return tag;
	}

	public String getType() {
		return type;
	}

	public Integer getWins() {
		return wins;
	}

	public void setBadgeId(Integer badgeId) {
		this.badgeId = badgeId;
	}

	public void setBadgeUrls(List<IconUrls> badgeUrls) {
		this.badgeUrls = badgeUrls;
	}

	public void setBattlesPlayed(Integer battlesPlayed) {
		this.battlesPlayed = battlesPlayed;
	}

	public void setClanChestLevel(Integer clanChestLevel) {
		this.clanChestLevel = clanChestLevel;
	}

	public void setClanChestMaxLevel(Integer clanChestMaxLevel) {
		this.clanChestMaxLevel = clanChestMaxLevel;
	}

	public void setClanChestPoints(String clanChestPoints) {
		this.clanChestPoints = clanChestPoints;
	}

	public void setClanChestStatus(String clanChestStatus) {
		this.clanChestStatus = clanChestStatus;
	}

	public void setClanScore(Integer clanScore) {
		this.clanScore = clanScore;
	}

	public void setClanWarTrophies(Integer clanWarTrophies) {
		this.clanWarTrophies = clanWarTrophies;
	}

	public void setCrowns(Integer crowns) {
		this.crowns = crowns;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setDonationsPerWeek(Integer donationsPerWeek) {
		this.donationsPerWeek = donationsPerWeek;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public void setMembers(Integer members) {
		this.members = members;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setParticipants(Integer participants) {
		this.participants = participants;
	}

	public void setPreviousRank(Integer previousRank) {
		this.previousRank = previousRank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public void setRequiredTrophies(Integer requiredTrophies) {
		this.requiredTrophies = requiredTrophies;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setWins(Integer wins) {
		this.wins = wins;
	}

}
