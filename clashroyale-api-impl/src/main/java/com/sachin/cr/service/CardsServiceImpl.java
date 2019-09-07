package com.sachin.cr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import com.sachin.cr.api.client.ClashRoyaleGenericClient;
import com.sachin.cr.api.domain.ListOfCards;

@Component
public class CardsServiceImpl {

	@Autowired
	private ClashRoyaleGenericClient clashRoyaleGenClient;

	public ListOfCards getAllCards() {
		ListOfCards listOfCards = clashRoyaleGenClient.getListOfCards();
		Assert.notNull(listOfCards, "Failed to get list of cards");
		Assert.notEmpty(listOfCards.getItems(), "No cards received from API");
		return listOfCards;
	}
}
