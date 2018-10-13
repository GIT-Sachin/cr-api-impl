package com.sachin.cr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.sachin.cr.service.PlayerServiceImpl;

@RestController("/players")
public class PlayersRestController {

	@Autowired
	private PlayerServiceImpl playerService;
}
