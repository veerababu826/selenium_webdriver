package testngconcepts;

import org.testng.Assert;

import org.testng.annotations.Test;

public class TestngListener_demo1 {
	
@Test
public void testmethod1() {
		
System.out.println("i m inside testmethod1");
	
}
   @Test
	
	public void testmethod2() {
	   
	System.out.println("i m inside testmethod2");
	
	Assert.assertTrue(false);
		
	}
  @Test(timeOut = 1000)

  public void testmethod3() throws Exception {
	
	Thread.sleep(2000);
	
	System.out.println("im in test method 3");
	
	
}
@Test(dependsOnMethods = {"testmethod3"})

public void testmethod4() {
	
	System.out.println("im in testmethod4");
	
}
}
