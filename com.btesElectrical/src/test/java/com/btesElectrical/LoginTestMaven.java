package com.btesElectrical;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTestMaven extends MavenDemo{
	String title,exptitle="Orange HRM";
	//@Parameters({"ChromeBrowser"})
	@Test//(groups="Sanity")
	
	public void CheckTitle() {
		title=driver.getTitle();
		if(title.contentEquals(exptitle)) {
			System.out.println("correct page");
		}
		else {
			System.out.println("incorrect page");
		}
	}
	
	//@BeforeMethod
	@Test
	public void forgot() {
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.navigate().back();}
	
	//@AfterMethod
	//@Test(groups="Smoke")
	@Test
	public void login() throws InterruptedException {
		 driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	     driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		 driver.findElement(By.name("Submit")).submit();
		 Thread.sleep(4000);
	}

}
