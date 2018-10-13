package com.sachin.cr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.sachin.cr.service.LocationServiceImpl;

@RestController("/locations")
public class LocationRestController {

	@Autowired
	private LocationServiceImpl locationService;
}
