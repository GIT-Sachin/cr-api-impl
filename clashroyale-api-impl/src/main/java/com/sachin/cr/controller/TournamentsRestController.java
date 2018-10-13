package com.sachin.cr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.sachin.cr.service.TournamentsServiceImpl;

@RestController("/tournaments")
public class TournamentsRestController {

	@Autowired
	private TournamentsServiceImpl tournamentService;
}
