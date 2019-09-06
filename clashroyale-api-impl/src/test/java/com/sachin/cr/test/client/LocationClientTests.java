package com.sachin.cr.test.client;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sachin.cr.api.client.LocationsClient;
import com.sachin.cr.main.ClashroyaleApiImplApplication;

@SpringBootTest(classes = { ClashroyaleApiImplApplication.class })
@RunWith(SpringJUnit4ClassRunner.class)
public class LocationClientTests {

	@Autowired
	private LocationsClient locationClient;

	@Test
	public void testGetAllLocations() {
		Assert.assertNotNull("Response is null", locationClient.getListOfAllLocations());
	}

	@Test
	public void testGetLocationByLocationId() {
		Assert.assertNotNull("Response is null", locationClient.getLocationByLocationId(57000013L));
	}

	@Test
	public void testGetClanRankingsByLocationId() {
		Assert.assertNotNull("Response is null", locationClient.getClanRankingsByLocationId(57000013L));
	}

	@Test
	public void testGetPlayerRankingsByLocationId() {
		Assert.assertNotNull("Response is null", locationClient.getPlayerRankingsByLocationId(57000013L));
	}

	@Test
	public void testGetClanWarRankingsByLocationId() {
		Assert.assertNotNull("Response is null", locationClient.getClanWarRankingsByLocationId(57000013L));
	}

}