package com.sachin.cr.api.domain;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Player {

	private String tag;
	private String name;
	private Integer crowns;
	private Integer kingTowerHitPoints;
	private List<Integer> princessTowerHitPoints;
	private Integer expLevel;
	private Integer trophies;
	private Arena arena;
	private String role;
	private Integer clanRank;
	private Integer previousClanRank;
	private Integer donations;
	private Integer donationsReceived;
	private Integer clanChestPoints;
	private Integer cardsEarned;
	private Integer battlesPlayed;
	private Integer wins;
	private Integer collectionDayBattlesPlayed;
	private Integer numberOfBattles;
	private Clan clan;
	private List<Card> cards;
	private Integer losses;
	private Integer totalDonations;
	private LeagueStatistics leagueStatistics;
	private Card currentFavouriteCard;
	private List<Badge> badges;
	private Integer bestTrophies;
	private List<Achievement> achievements;
	private Integer battleCount;
	private Integer threeCrownWins;
	private Integer challengeCardsWon;
	private Integer challengeMaxWins;
	private Integer tournamentCardsWon;
	private Integer tournamentBattleCount;
	private Integer warDayWins;
	private Integer clanCardsCollected;
	private Integer starPoints;
	private List<Card> currentDeck;
	private Integer startingTrophies;
	private Integer previousRank;
	private Integer rank;
	private Date lastSeen;

	public Integer getPreviousRank() {
		return previousRank;
	}

	public void setPreviousRank(Integer previousRank) {
		this.previousRank = previousRank;
	}

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public Date getLastSeen() {
		return lastSeen;
	}

	public void setLastSeen(Date lastSeen) {
		this.lastSeen = lastSeen;
	}

	public Integer getStartingTrophies() {
		return startingTrophies;
	}

	public void setStartingTrophies(Integer startingTrophies) {
		this.startingTrophies = startingTrophies;
	}

	public Integer getCrowns() {
		return crowns;
	}

	public void setCrowns(Integer crowns) {
		this.crowns = crowns;
	}

	public Integer getKingTowerHitPoints() {
		return kingTowerHitPoints;
	}

	public void setKingTowerHitPoints(Integer kingTowerHitPoints) {
		this.kingTowerHitPoints = kingTowerHitPoints;
	}

	public List<Integer> getPrincessTowerHitPoints() {
		return princessTowerHitPoints;
	}

	public void setPrincessTowerHitPoints(List<Integer> princessTowerHitPoints) {
		this.princessTowerHitPoints = princessTowerHitPoints;
	}

	public List<Achievement> getAchievements() {
		return achievements;
	}

	public Arena getArena() {
		return arena;
	}

	public List<Badge> getBadges() {
		return badges;
	}

	public Integer getBattleCount() {
		return battleCount;
	}

	public Integer getBattlesPlayed() {
		return battlesPlayed;
	}

	public Integer getBestTrophies() {
		return bestTrophies;
	}

	public List<Card> getCards() {
		return cards;
	}

	public Integer getCardsEarned() {
		return cardsEarned;
	}

	public Integer getChallengeCardsWon() {
		return challengeCardsWon;
	}

	public Integer getChallengeMaxWins() {
		return challengeMaxWins;
	}

	public Clan getClan() {
		return clan;
	}

	public Integer getClanCardsCollected() {
		return clanCardsCollected;
	}

	public Integer getClanChestPoints() {
		return clanChestPoints;
	}

	public Integer getClanRank() {
		return clanRank;
	}

	public Integer getCollectionDayBattlesPlayed() {
		return collectionDayBattlesPlayed;
	}

	public List<Card> getCurrentDeck() {
		return currentDeck;
	}

	public Card getCurrentFavouriteCard() {
		return currentFavouriteCard;
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

	public LeagueStatistics getLeagueStatistics() {
		return leagueStatistics;
	}

	public Integer getLosses() {
		return losses;
	}

	public String getName() {
		return name;
	}

	public Integer getNumberOfBattles() {
		return numberOfBattles;
	}

	public Integer getPreviousClanRank() {
		return previousClanRank;
	}

	public String getRole() {
		return role;
	}

	public Integer getStarPoints() {
		return starPoints;
	}

	public String getTag() {
		return tag;
	}

	public Integer getThreeCrownWins() {
		return threeCrownWins;
	}

	public Integer getTotalDonations() {
		return totalDonations;
	}

	public Integer getTournamentBattleCount() {
		return tournamentBattleCount;
	}

	public Integer getTournamentCardsWon() {
		return tournamentCardsWon;
	}

	public Integer getTrophies() {
		return trophies;
	}

	public Integer getWarDayWins() {
		return warDayWins;
	}

	public Integer getWins() {
		return wins;
	}

	public void setAchievements(List<Achievement> achievements) {
		this.achievements = achievements;
	}

	public void setArena(Arena arena) {
		this.arena = arena;
	}

	public void setBadges(List<Badge> badges) {
		this.badges = badges;
	}

	public void setBattleCount(Integer battleCount) {
		this.battleCount = battleCount;
	}

	public void setBattlesPlayed(Integer battlesPlayed) {
		this.battlesPlayed = battlesPlayed;
	}

	public void setBestTrophies(Integer bestTrophies) {
		this.bestTrophies = bestTrophies;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	public void setCardsEarned(Integer cardsEarned) {
		this.cardsEarned = cardsEarned;
	}

	public void setChallengeCardsWon(Integer challengeCardsWon) {
		this.challengeCardsWon = challengeCardsWon;
	}

	public void setChallengeMaxWins(Integer challengeMaxWins) {
		this.challengeMaxWins = challengeMaxWins;
	}

	public void setClan(Clan clan) {
		this.clan = clan;
	}

	public void setClanCardsCollected(Integer clanCardsCollected) {
		this.clanCardsCollected = clanCardsCollected;
	}

	public void setClanChestPoints(Integer clanChestPoints) {
		this.clanChestPoints = clanChestPoints;
	}

	public void setClanRank(Integer clanRank) {
		this.clanRank = clanRank;
	}

	public void setCollectionDayBattlesPlayed(Integer collectionDayBattlesPlayed) {
		this.collectionDayBattlesPlayed = collectionDayBattlesPlayed;
	}

	public void setCurrentDeck(List<Card> currentDeck) {
		this.currentDeck = currentDeck;
	}

	public void setCurrentFavouriteCard(Card currentFavouriteCard) {
		this.currentFavouriteCard = currentFavouriteCard;
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

	public void setLeagueStatistics(LeagueStatistics leagueStatistics) {
		this.leagueStatistics = leagueStatistics;
	}

	public void setLosses(Integer losses) {
		this.losses = losses;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNumberOfBattles(Integer numberOfBattles) {
		this.numberOfBattles = numberOfBattles;
	}

	public void setPreviousClanRank(Integer previousClanRank) {
		this.previousClanRank = previousClanRank;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setStarPoints(Integer starPoints) {
		this.starPoints = starPoints;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public void setThreeCrownWins(Integer threeCrownWins) {
		this.threeCrownWins = threeCrownWins;
	}

	public void setTotalDonations(Integer totalDonations) {
		this.totalDonations = totalDonations;
	}

	public void setTournamentBattleCount(Integer tournamentBattleCount) {
		this.tournamentBattleCount = tournamentBattleCount;
	}

	public void setTournamentCardsWon(Integer tournamentCardsWon) {
		this.tournamentCardsWon = tournamentCardsWon;
	}

	public void setTrophies(Integer trophies) {
		this.trophies = trophies;
	}

	public void setWarDayWins(Integer warDayWins) {
		this.warDayWins = warDayWins;
	}

	public void setWins(Integer wins) {
		this.wins = wins;
	}

}
