package com.sachin.cr.test.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sachin.cr.main.ClashroyaleApiImplApplication;
import com.sachin.cr.service.CardsServiceImpl;

@SpringBootTest(classes = { ClashroyaleApiImplApplication.class })
@RunWith(SpringJUnit4ClassRunner.class)
public class CardServiceImplTests {

	@Autowired
	private CardsServiceImpl cardService;

	@Test
	public void testGetAllCards() {
		Assert.assertNotNull("List of cards is null", cardService.getAllCards());
	}
}
