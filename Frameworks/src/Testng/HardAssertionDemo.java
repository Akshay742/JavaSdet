package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionDemo {
	String path;
	@Test
	public void checkTitle() {
		path=System.getProperty("user.dir")+"//Drivers1//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		System.out.println(path);
		WebDriver driver= new ChromeDriver();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		Assert.assertEquals("Orange Live Hrm", driver.getTitle());//hard assertion
		System.out.println("akshay");
		System.out.println("hi");

}
	@Test
	public void login() {
		System.out.println("logintest case");
	}
}
