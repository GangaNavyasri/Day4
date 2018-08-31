package com.day4tests;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.day4.Television;

class TelevisionTest {
	
	Television tel;
	@BeforeEach
	void setup() {
		tel=new Television();
	}

	@Test
	void testchangeVolume() {
		assertEquals(35, tel.changeVolume(35));
		assertEquals(20, tel.changeVolume(20));
		
	}
	@Test
	void testchangeChannel() {
		assertEquals(254,tel.changeChannel(254));
		
	}
	@AfterEach
	void disp()
	{
		tel.display();
	}
	
}
