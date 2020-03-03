package Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	@BeforeMethod
	public void befMethod() {
		System.out.println("before method");
	}
	@AfterMethod
	public void aftMethod() {
		System.out.println("after method");
	}
	@BeforeClass
	public void befClass() {
		System.out.println("before class");
	}
	@AfterClass
	public void aftClass() {
		System.out.println("after class");
	}
	@BeforeSuite
	public void befSuite() {
		System.out.println("before suite");
	}
	@AfterSuite
	public void aftSuite() {
		System.out.println("after suite");
	}					
	@BeforeTest
	public void befTest() {
		System.out.println("before test");
	}
	@AfterTest
	public void aftTest() {
		System.out.println("after test");
	}
	@Test(priority=0)
	public void driver() {
		System.out.println("driver info");
	}
	
	
	

}
