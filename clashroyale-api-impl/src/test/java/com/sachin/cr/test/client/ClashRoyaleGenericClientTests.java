package com.sachin.cr.test.client;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sachin.cr.api.client.ClashRoyaleGenericClient;
import com.sachin.cr.main.ClashroyaleApiImplApplication;

@SpringBootTest(classes = { ClashroyaleApiImplApplication.class })
@RunWith(SpringJUnit4ClassRunner.class)
public class ClashRoyaleGenericClientTests {

	@Autowired
	private ClashRoyaleGenericClient genericClient;

	@Test
	public void testGetListOfCards() {
		Assert.assertNotNull("Response is null", genericClient.getListOfCards());
	}
}
