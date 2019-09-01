package com.sachin.cr.api.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Member {

	private Arena arena;
	
	private String lastSeen;
	
	private Integer clanChestPoints;
	
	private String tag;
	
	private String name;
	
	private String role;
	
	private Integer expLevel;
	
	private Integer trophies;
	
	private Integer clanRank;
	
	private Integer previousClanRank;
	
	private Integer donations;
	
	private Integer donationsReceived;

	public Arena getArena() {
		return arena;
	}

	public Integer getClanChestPoints() {
		return clanChestPoints;
	}

	public Integer getClanRank() {
		return clanRank;
	}

	public Integer getDonations() {
		return donations;
	}

	public Integer getDonationsReceived() {
		return donationsReceived;
	}

	public Integer getExpLevel() {
		return expLevel;
	}

	public String getLastSeen() {
		return lastSeen;
	}

	public String getName() {
		return name;
	}

	public Integer getPreviousClanRank() {
		return previousClanRank;
	}

	public String getRole() {
		return role;
	}

	public String getTag() {
		return tag;
	}

	public Integer getTrophies() {
		return trophies;
	}

	public void setArena(Arena arena) {
		this.arena = arena;
	}

	public void setClanChestPoints(Integer clanChestPoints) {
		this.clanChestPoints = clanChestPoints;
	}

	public void setClanRank(Integer clanRank) {
		this.clanRank = clanRank;
	}

	public void setDonations(Integer donations) {
		this.donations = donations;
	}

	public void setDonationsReceived(Integer donationsReceived) {
		this.donationsReceived = donationsReceived;
	}

	public void setExpLevel(Integer expLevel) {
		this.expLevel = expLevel;
	}

	public void setLastSeen(String lastSeen) {
		this.lastSeen = lastSeen;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPreviousClanRank(Integer previousClanRank) {
		this.previousClanRank = previousClanRank;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public void setTrophies(Integer trophies) {
		this.trophies = trophies;
	}
	
	
}
