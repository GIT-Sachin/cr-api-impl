package com.sachin.cr.api.domain;

public class Player {

	private String tag;
	private String name;
	private Integer expLevel;
	private Integer trophies;
	private Arena arena;
	private String role;
	private Integer clanRank;
	private Integer previousClanRank;
	private Integer donations;
	private Integer donationsReceived;
	private Integer clanChestPoints;
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
	public Integer getExpLevel() {
		return expLevel;
	}
	public void setExpLevel(Integer expLevel) {
		this.expLevel = expLevel;
	}
	public Integer getTrophies() {
		return trophies;
	}
	public void setTrophies(Integer trophies) {
		this.trophies = trophies;
	}
	public Arena getArena() {
		return arena;
	}
	public void setArena(Arena arena) {
		this.arena = arena;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Integer getClanRank() {
		return clanRank;
	}
	public void setClanRank(Integer clanRank) {
		this.clanRank = clanRank;
	}
	public Integer getPreviousClanRank() {
		return previousClanRank;
	}
	public void setPreviousClanRank(Integer previousClanRank) {
		this.previousClanRank = previousClanRank;
	}
	public Integer getDonations() {
		return donations;
	}
	public void setDonations(Integer donations) {
		this.donations = donations;
	}
	public Integer getDonationsReceived() {
		return donationsReceived;
	}
	public void setDonationsReceived(Integer donationsReceived) {
		this.donationsReceived = donationsReceived;
	}
	public Integer getClanChestPoints() {
		return clanChestPoints;
	}
	public void setClanChestPoints(Integer clanChestPoints) {
		this.clanChestPoints = clanChestPoints;
	}
	
}

class Arena{
	private Integer id;
	private String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
