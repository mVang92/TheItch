package theItch;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TheItch {
	
	@BeforeClass
	private void setup() {
		System.out.println("Setup");
	}
	
	@Test(priority = 1)
	private void loginApplication() {
		assertEquals(5, 5);
		System.out.println("I have to test, all the time!");
	}

}
