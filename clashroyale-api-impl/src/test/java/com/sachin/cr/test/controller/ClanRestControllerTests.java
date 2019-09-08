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
public class ClanRestControllerTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testGetClansByClanName() throws Exception {
		mockMvc.perform(get("/clans/getClansByClanName/telugu warriors").contentType(MediaType.APPLICATION_JSON_UTF8))
				.andExpect(status().isOk());
	}

	@Test
	public void testGetClansByLocationId() throws Exception {
		mockMvc.perform(get("/clans/getClansByLocationId/57000013").contentType(MediaType.APPLICATION_JSON_UTF8))
				.andExpect(status().isOk());
	}

	@Test
	public void testGetClansByMaxMem() throws Exception {
		mockMvc.perform(get("/clans/getClansByMaxMembers/45").contentType(MediaType.APPLICATION_JSON_UTF8))
				.andExpect(status().isOk());
	}

	@Test
	public void testGetClansByMinMem() throws Exception {
		mockMvc.perform(get("/clans/getClansByMinMembers/34").contentType(MediaType.APPLICATION_JSON_UTF8))
				.andExpect(status().isOk());
	}

	@Test
	public void testGetClansByClanScore() throws Exception {
		mockMvc.perform(get("/clans/getClansByMinScore/2000").contentType(MediaType.APPLICATION_JSON_UTF8))
				.andExpect(status().isOk());
	}

	@Test
	public void testGetClansByFilter() throws Exception {
		mockMvc.perform(
				get("/clans/getClansByFilters?name=telugu warriors").contentType(MediaType.APPLICATION_JSON_UTF8))
				.andExpect(status().isOk());
	}
}
