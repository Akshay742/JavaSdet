package AutomationTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PathDemo {
	String path;
	public void ByTag() {
		path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver= new ChromeDriver();
		driver.get("https://mail.rediff.com");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PathDemo oo= new PathDemo();
		oo.ByTag();
	}

}
