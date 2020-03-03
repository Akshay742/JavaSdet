package AutomationTesting;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zoopla {
	String path;
	public void launch() {
		path= System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.zoopla.co.uk/");
		driver.findElement(By.id("search-input-location")).sendKeys("london");
		driver.findElement(By.id("search-submit")).click();
		ArrayList <WebElement> ag = new ArrayList<WebElement> (driver.findElements(By.className("listing-results-price text-price")));
		for(int i=0;i<ag.size();i++) {
			System.out.println(ag.get(i).getText());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Zoopla obj= new Zoopla();
obj.launch();
	
	}

}
