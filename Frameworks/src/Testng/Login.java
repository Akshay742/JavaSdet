package Testng;


import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class Login extends OrangeHrm{
	String title,
	exptitle="Orange HRM";
	//@Parameters({"ChromeBrowser"})
	@Test(groups="Sanity")
	
	public void CheckTitle() {
		title=driver.getTitle();
		if(title.contentEquals(exptitle)) {
			System.out.println("correct page");
		}
		else {
			System.out.println("incorrect page");
		}
	}
	
	@BeforeMethod
	public void forgot() {
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.navigate().back();}
	
	@AfterMethod
	@Test(groups="Smoke")
	public void login() {
		 driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	     driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		 driver.findElement(By.name("Submit")).submit();
	}
	

}
