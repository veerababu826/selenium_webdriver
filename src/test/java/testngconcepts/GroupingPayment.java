package testngconcepts;

import org.testng.annotations.Test;

public class GroupingPayment {
	
@Test(priority = 1,groups = {"sanity","regression","functional"})
	
	void paymentinruppes() {
		
		System.out.println("paymentinruppes");
		
	}
	@Test(priority = 2,groups = {"sanity","regression","functional"})
	
	void paymentindollars() {
		
		System.out.println("paymentindollars");
		
	}


}
