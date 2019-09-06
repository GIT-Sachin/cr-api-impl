package com.sachin.cr.test.client;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sachin.cr.api.client.PlayersClient;
import com.sachin.cr.main.ClashroyaleApiImplApplication;

@SpringBootTest(classes = { ClashroyaleApiImplApplication.class })
@RunWith(SpringJUnit4ClassRunner.class)
public class PlayersClientTests {

	@Autowired
	private PlayersClient playerClient;

	@Test
	public void testGetPlayerByTag() {
		Assert.assertNotNull("Response is null", playerClient.getPlayerByPlayerTag("#PRVRJURQ"));
	}

	@Test
	public void testGetUpcomingChestsForPlayer() {
		Assert.assertNotNull("Response is null", playerClient.getUpcomingChestsForPlayer("#PRVRJURQ"));
	}

	@Test
	public void testGetPlayerBattleLog() {
		Assert.assertNotNull("Response is null", playerClient.getPlayerBattleLog("#PRVRJURQ"));
	}
}
