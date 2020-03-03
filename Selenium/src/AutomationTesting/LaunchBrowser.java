package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	String title="www.google.com";
	WebDriver driver;
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.gmail.com//");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.name("identifier")).sendKeys("a3kmahajan@gmail.com");
		driver.findElement(By.xpath("//*[@id='identifierNext']")).click();
		
		driver.findElement(By.name("password")).sendKeys("9592771446");
		driver.findElement(By.xpath("//*[@id='passwordNext']/span/span")).click();
		//driver.quit();
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LaunchBrowser oo= new LaunchBrowser();
		oo.launch();


	}

}
