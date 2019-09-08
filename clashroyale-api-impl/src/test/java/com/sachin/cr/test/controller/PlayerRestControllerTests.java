package com.sachin.cr.test.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.nio.charset.StandardCharsets;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.util.UriUtils;

import com.sachin.cr.main.ClashroyaleApiImplApplication;

@SpringBootTest(webEnvironment = WebEnvironment.MOCK, classes = ClashroyaleApiImplApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
@AutoConfigureMockMvc
public class PlayerRestControllerTests {

	@Autowired
	private MockMvc mockMvc;

	private String playerTag = "#PRVRJURQ";

	@Test
	public void testGetPlayerByPlayerTag() throws Exception {
		mockMvc.perform(get("/players/playerByTag?playerTag={playerTag}", playerTag)
				.contentType(MediaType.APPLICATION_JSON_UTF8)).andExpect(status().isOk());
	}

	@Test
	public void testGetPlayerUpcomingChests() throws Exception {
		mockMvc.perform(get("/players/upcomingChests?playerTag={playerTag}", playerTag)
				.contentType(MediaType.APPLICATION_JSON_UTF8)).andExpect(status().isOk());
	}

	@Test
	public void testGetPlayerWarLog() throws Exception {
		mockMvc.perform(
				get("/players/warlog?playerTag={playerTag}", playerTag).contentType(MediaType.APPLICATION_JSON_UTF8))
				.andExpect(status().isOk());
	}

}
