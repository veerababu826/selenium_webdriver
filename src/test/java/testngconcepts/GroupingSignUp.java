package testngconcepts;

import org.testng.annotations.Test;

public class GroupingSignUp {
	
@Test(priority = 1,groups = {"regression"})
	
	void signupByEmail() {
		
		System.out.println("signup by email");
		
	}
	@Test(priority = 2,groups = {"regression"})
	
	void signupByFacebook() {
		
		System.out.println("signup by facebook");
		
	}
	@Test(priority = 3,groups = {"regression"})
	
	void signupBytwitter() {
		
		System.out.println("signup by twitter");
		
		
	}

	

}
