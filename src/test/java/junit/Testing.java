package junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testing {

	@BeforeClass
	public static void tc01() {
		System.out.println("test1");
	}
	//using assert
	@Test
	public void tc03() {
		String s = "Gilli";
		Assert.assertTrue(true);
		System.out.println(s);


	}
	@Before
	public  void tc05() {
		String s = "ganesh";
		Assert.assertEquals("ganesh", "ganesh");
		System.out.println(s);
	}
	@After 
	
	public void tc07() {
		String s = "abi";
		Assert.assertNotEquals("ganesh", s);
	}



}
