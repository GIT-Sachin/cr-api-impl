package com.sachin.cr.controller;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

import com.sachin.cr.api.domain.Card;
import com.sachin.cr.service.CardsServiceImpl;

@RestController("/cards")
public class CardsRestController {

	@Autowired
	private CardsServiceImpl cardService;

	@GetMapping("/getCardsList")
	public List<Card> getCards() throws RestClientException, URISyntaxException, IOException {
		return cardService.getAllCards().getItems();
	}
}
