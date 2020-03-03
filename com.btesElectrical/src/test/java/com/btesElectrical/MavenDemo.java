package com.btesElectrical;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class MavenDemo {
	 public static String path;
	public static WebDriver driver;
	//@BeforeSuite(groups="Smoke")
//@Test(groups="Smoke")
@BeforeSuite//(groups="Smoke",enabled=true)

	public void driverInfo1() throws InterruptedException{
		
		    path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", path);
			
			 driver= new ChromeDriver();
			
			driver.get("https://opensource-demo.orangehrmlive.com/");
		//	driver.manage().window().maximize();
			//Thread.sleep(5000);
			

		}
		@AfterSuite//(groups="Sanity",dependsOnMethods="driverInfo1")
		public void Close_Browser() {
			driver.close();
		}
		
	}
	



