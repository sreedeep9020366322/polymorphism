package com.training.tests;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

import com.training.domains.LuxuryCar;
import com.training.domains.NewShowRoom;
import com.training.domains.PassengerCar;
import com.training.domains.SportsBike;
import com.training.domains.SportsCar;
import com.training.ifaces.Automobile;

public class NewShowRoomTest {

//	private int key;
//	
//	public NewShowRoomTest(int key) {
//		// TODO Auto-generated constructor stub
//	
//		this.key = key;
//	}
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetItem1() {
	//	fail("Not yet implemented");
	
		NewShowRoom showRoom = new NewShowRoom();
		Object obj = showRoom.getItem(1);
	
		assertEquals(PassengerCar.class, obj.getClass());
	}

	@Test
	public void testGetItem2() {
	//	fail("Not yet implemented");
	
		NewShowRoom showRoom = new NewShowRoom();
		Object obj = showRoom.getItem(2);
	
		assertEquals(LuxuryCar.class, obj.getClass());
	}
	
	@Test
	public void testGetItem3() {
	//	fail("Not yet implemented");
	
		NewShowRoom showRoom = new NewShowRoom();
		Object obj = showRoom.getItem(3);
	
		assertEquals(SportsCar.class, obj.getClass());
	}
	
	@Test
	public void testGetItem4() {
	//	fail("Not yet implemented");
	
		NewShowRoom showRoom = new NewShowRoom();
		Object obj = showRoom.getItem(4);
	
		assertEquals(SportsBike.class, obj.getClass());
	}
	
	@Test
	public void testGetItemDefault() {
	//	fail("Not yet implemented");
	
		NewShowRoom showRoom = new NewShowRoom();
		Object obj = showRoom.getItem(5);
	
		assertNull(obj);
	}
	
	@Test
	public void testGetItemReturn() {
	//	fail("Not yet implemented");
	
		NewShowRoom showRoom = new NewShowRoom();
		Object obj = showRoom.getItem(2);
	
		assertEquals(Automobile.class , obj.getClass());
	}
	
	@Test
	public void testPrintQuote() {
//		fail("Not yet implemented");
	}

//	@Parameters
//	public static Collection<Object[]> data() {
//		Object[][] data = new Object[][] {{1} , {2}, {3}, {4}};
//		return Arrays.asList(data);
//	}
}
