package com.sachin.cr.controller;

import java.io.IOException;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

import com.sachin.cr.service.CardsServiceImpl;

@RestController
public class CardsRestController {

	@Autowired
	private CardsServiceImpl cardService;
	
	@GetMapping("/cards")
	public String getCards() throws RestClientException, URISyntaxException, IOException {
		return cardService.getCards();
	}
}
