package AutomationTesting;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByTagname {
	String path;
	public void demo() {
		path= System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.bbc.com//");
		ArrayList<WebElement> al= new ArrayList<WebElement>(driver.findElements(By.className("media__link")));
		System.out.println(al.size());
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i).getText());
		//System.out.println(al.getText());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ByTagname oo= new ByTagname();
oo.demo();
	}

}
