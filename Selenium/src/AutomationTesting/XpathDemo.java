package AutomationTesting;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
	String path;
	public void table() {
		path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("file:///C:/Users/hp/Desktop/table.html");
		ArrayList<WebElement> al= new ArrayList<WebElement> (driver.findElements(By.xpath("//table//tr//th")));
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i).getText());
		}
		ArrayList<WebElement> ak= new ArrayList<WebElement> (driver.findElements(By.xpath("//table//tr//td")));
		for(int i=0;i<ak.size();i++) {
			System.out.println(ak.get(i).getText());
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XpathDemo oo= new XpathDemo();
		oo.table();

	}

}
