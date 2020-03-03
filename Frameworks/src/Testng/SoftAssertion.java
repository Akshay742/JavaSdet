package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	String path;
	@Test
	public void checkTitle() {
		path=System.getProperty("user.dir")+"//Drivers1//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		System.out.println(path);
		WebDriver driver= new ChromeDriver();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		SoftAssert ast= new SoftAssert();
		ast.assertEquals(driver.getTitle(),"Orange Hrm");//soft assertion
		System.out.println("akshay");

}
	@Test
	public void login() {
	System.out.println("akshay");
}
}
