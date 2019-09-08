package com.sachin.cr.test.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.sachin.cr.main.ClashroyaleApiImplApplication;

@SpringBootTest(webEnvironment = WebEnvironment.MOCK, classes = ClashroyaleApiImplApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
@AutoConfigureMockMvc
public class LocationRestControllerTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testGetAllLocations() throws Exception {
		mockMvc.perform(get("/locations/getAllLocations").contentType(MediaType.APPLICATION_JSON_UTF8))
				.andExpect(status().isOk());
	}

	@Test
	public void testGetClanRankingsByLocation() throws Exception {
		mockMvc.perform(get("/locations/57000013/rankings/clans").contentType(MediaType.APPLICATION_JSON_UTF8))
				.andExpect(status().isOk());
	}

	@Test
	public void testGetClanWarRankingsByLocation() throws Exception {
		mockMvc.perform(get("/locations/57000013/rankings/clanwars").contentType(MediaType.APPLICATION_JSON_UTF8))
				.andExpect(status().isOk());
	}

	@Test
	public void testGetLocationByLocationId() throws Exception {
		mockMvc.perform(get("/locations/57000013").contentType(MediaType.APPLICATION_JSON_UTF8))
				.andExpect(status().isOk());
	}

	@Test
	public void testGetPlayerRankingsByLocationId() throws Exception {
		mockMvc.perform(get("/locations/57000013/rankings/players").contentType(MediaType.APPLICATION_JSON_UTF8))
				.andExpect(status().isOk());
	}
}
