package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class OrangeHrm {
	 String path;
	WebDriver driver;
	//@BeforeSuite(groups="Smoke")
 //@Test(groups="Smoke")
@Test(groups="Smoke",enabled=true)

	public void driverInfo1() throws InterruptedException{
		
		    path=System.getProperty("user.dir")+"//Drivers1//chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", path);
			
			 driver= new ChromeDriver();
			
			driver.get("https://opensource-demo.orangehrmlive.com/");
		//	driver.manage().window().maximize();
			//Thread.sleep(5000);
			

		}
		@Test(groups="Sanity",dependsOnMethods="driverInfo1")
		public void Close_Browser() {
			driver.close();
		}
		
	}


