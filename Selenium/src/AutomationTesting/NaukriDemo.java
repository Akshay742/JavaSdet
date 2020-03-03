package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriDemo {
	String path;
	public void launching() {
		path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver= new ChromeDriver();
		//driver.get("https://www.naukri.com/hr-recruiters-consultants");
		driver.get("https://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys("akshay262712@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Shivangi");
		driver.findElement(By.id("loginbutton")).click();
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
NaukriDemo oo= new NaukriDemo();
oo.launching();
	}

}
