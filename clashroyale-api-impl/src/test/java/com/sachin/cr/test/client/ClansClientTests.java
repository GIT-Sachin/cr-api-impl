package com.sachin.cr.test.client;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sachin.cr.api.client.ClansClient;
import com.sachin.cr.api.domain.Clan;
import com.sachin.cr.api.domain.ListOfClans;
import com.sachin.cr.main.ClashroyaleApiImplApplication;

@SpringBootTest(classes = { ClashroyaleApiImplApplication.class })
@RunWith(SpringJUnit4ClassRunner.class)
public class ClansClientTests {

	@Autowired
	private ClansClient clansClient;

	@Test
	public void testGetClansByFilterName() {
		Map<String, String> filters = new HashMap<>();
		filters.put("name", "telugu warriors");
		ListOfClans listOfClans = clansClient.getClansByFilter(filters);
		Assert.assertNotNull("Response is null", listOfClans);
		Assert.assertNotNull("Response list is null", listOfClans.getItems());
		Assert.assertFalse("Response is empty list", listOfClans.getItems().isEmpty());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGetClansByFilterNameWithEmptyFilters() {
		Map<String, String> filters = new HashMap<>();
		clansClient.getClansByFilter(filters);
	}

	@Test
	public void testGetClansByFilterLocationId() {
		Map<String, String> filters = new HashMap<>();
		filters.put("locationId", "57000113");
		ListOfClans listOfClans = clansClient.getClansByFilter(filters);
		Assert.assertNotNull("Response is null", listOfClans);
		Assert.assertNotNull("Response is null", listOfClans);
		Assert.assertNotNull("Response list is null", listOfClans.getItems());
	}

	@Test
	public void testGetClansByFilterMinMembers() {
		Map<String, String> filters = new HashMap<>();
		filters.put("minMembers", "25");
		ListOfClans listOfClans = clansClient.getClansByFilter(filters);
		Assert.assertNotNull("Response is null", listOfClans);
		Assert.assertNotNull("Response is null", listOfClans);
		Assert.assertNotNull("Response list is null", listOfClans.getItems());
	}

	@Test
	public void testGetClansByFilterMaxMembers() {
		Map<String, String> filters = new HashMap<>();
		filters.put("maxMembers", "47");
		ListOfClans listOfClans = clansClient.getClansByFilter(filters);
		Assert.assertNotNull("Response is null", listOfClans);
		Assert.assertNotNull("Response is null", listOfClans);
		Assert.assertNotNull("Response list is null", listOfClans.getItems());
	}

	@Test
	public void testGetClansByFilterMinScore() {
		Map<String, String> filters = new HashMap<>();
		filters.put("minScore", "40000");
		ListOfClans listOfClans = clansClient.getClansByFilter(filters);
		Assert.assertNotNull("Response is null", listOfClans);
		Assert.assertNotNull("Response is null", listOfClans);
		Assert.assertNotNull("Response list is null", listOfClans.getItems());
	}

	@Test
	public void testGetClanByClanTag() {
		Clan clan = clansClient.getClanByClanTag("#9VPRQ09V");
		Assert.assertNotNull("Response is null", clan);
		Assert.assertTrue("Not same clan", StringUtils.equals(clan.getTag(), "#9VPRQ09V"));
	}

	@Test
	public void testGetMembersOfClan() {
		Assert.assertNotNull("Response is null", clansClient.getMembersOfClan("#9VPRQ09V"));
	}

	@Test
	public void testGetClanWarlog() {
		Assert.assertNotNull("Response is null", clansClient.getClanWarLog("#9VPRQ09V"));
	}

	@Test
	public void testGetClanCurrentWar() {
		Assert.assertNotNull("Response is null", clansClient.getClanCurrentWar("#9VPRQ09V"));
	}

}
