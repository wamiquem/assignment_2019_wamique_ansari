package restaurant;

import static org.junit.Assert.*;
import org.junit.Test;

public class MyTests {
	
	//Test that N/A is returned when order contains no Vegetable option
	@Test
	public void test1() {
		Vegetable veg = new Vegetable("Vegetable Option");
		veg.setOption("");
		assertEquals("N/A", veg.getDetails());
	}

	//Test that N/A is not returned and Mixed Vegetables when order contains Mixed Vegetables option
	@Test
	public void test2() {
		Vegetable veg = new Vegetable("Vegetable Option");
		veg.setOption("Mixed Vegetables");
		assertFalse(veg.getDetails().equals("N/A"));
		assertEquals("Mixed Vegetables", veg.getDetails());
	}
	
	// Test that order string is properly set for composite object
	@Test
	public void test3() {
		Composite order = new Composite( "Order # 1" );	
		assertEquals("Order # 1", order.desc);
		
	}
	
	// Test that desc string is properly set for leaf object
		@Test
		public void test4() {
			Meat meat = new Meat("Meat Option");
			assertTrue(meat.getDesc().equals("Meat Option"));
			
		}
	
	// Test that composite order object contains the proper leaf object
	@Test
	public void test5() {
		Composite order = new Composite( "Order # 1" );
		RiceBowl riceBowl = new RiceBowl("Rice Bowl") ;
		order.addChild(riceBowl);
		assertEquals(riceBowl, order.components.get(0));
		
	}
	
	//Test that composite riceBowl object preserves the order of child leaf objects
	@Test
	public void test6() {
		RiceBowl riceBowl = new RiceBowl("Rice Bowl") ;
		Vegetable veg = new Vegetable("Vegetable Option");
		veg.setOption("Mixed Vegetables");
		riceBowl.addChild(veg);
		Meat meat = new Meat("Meat Option");
		meat.setOption("Beef");
		riceBowl.addChild(meat);
		assertEquals(veg, riceBowl.components.get(0));
		assertEquals(meat, riceBowl.components.get(1));
	}
	
	// Test that composite order object contains the proper leaf object in case of Empty string passed as an option
	@Test
	public void test7() {
		RiceBowl riceBowl = new RiceBowl("Rice Bowl") ;
		Vegetable veg = new Vegetable("Vegetable Option");
		veg.setOption("");
		riceBowl.addChild(veg);
		assertEquals(veg, riceBowl.components.get(0));
		
	}
	
}
