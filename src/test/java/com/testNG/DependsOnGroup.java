package com.testNG;

import org.testng.annotations.Test;

public class DependsOnGroup {

	@Test(groups = { "SmokeTest", "RegressionTest" })
	public void login() {
		System.out.println("Login Method");
	}
	

//
//	@Test(groups = { "FunctionalTest" })
//	public void search() {
//		System.out.println("Search Method");
//	}
//
//	@Test(groups = { "SanityTest" })
//	public void logout() {
//		System.out.println("Logout Method");
//	}
//
//	@Test(groups = { "RegressionTest" })
//	public void regression() {
//		System.out.println("Regression Method");
//	}
//
//	@Test(groups = { "SecurityTest" })
//	public void security() {
//		System.out.println("Security Method");
//	}
}
