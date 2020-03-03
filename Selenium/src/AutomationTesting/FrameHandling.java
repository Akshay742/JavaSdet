package AutomationTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {
	String path;//WebElement login;
	public void demo() {
		path= System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
	//	driver.findElement(By.)
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrameHandling oo = new FrameHandling();
		oo.demo();
	}

}

