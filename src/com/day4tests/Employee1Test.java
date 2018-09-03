package com.day4tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.day4.Employee1;
import com.day4.President;
import com.day4.SalesManager;

class Employee1Test {
	Employee1 employee;
	SalesManager manager;
	President president;
@BeforeEach
void setup() {
employee =new Employee1(1224, "navya", 10000,1200);

}


	@Test
	void testcalculateNetSal() {
		assertEquals(14800.0, employee.calculateNetSal(),0.02);
	}
	@Test
	void testcalSalesManager() {
	      manager=new SalesManager(1324," surya",10000,1200);
		assertEquals(27100, manager.calculateNetSal(),0.02);
		
	}
	@Test
	void testCalPresident() {
		president= new President(1423,"mouni",10000,1200);
		assertEquals(16800.0, president.calculateNetSal(),0.02);
	}
	
	
	}


