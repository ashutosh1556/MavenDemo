package com.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {

	@Test(description = "Facebook Login")
	public void login() {
		System.out.println("Login Method");
	}

	@Test(dependsOnMethods = "login")
	public void search() {
		System.out.println("Search Method");
		Assert.assertEquals("xyz", "abc");
	}

	@Test(dependsOnMethods = "search", alwaysRun = true)
	public void logout() {
		System.out.println("Logout Method");
	}

}
