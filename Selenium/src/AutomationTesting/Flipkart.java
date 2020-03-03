package AutomationTesting;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	String path;WebElement login;
	public void demo() {
		path= System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("mobiles");
		driver.findElement(By.name("q")).clear();
		
	//	driver.findElement(By.name("q")).sendKeys("apple");
		driver.findElement(By.className("vh79eN")).click();
		ArrayList<WebElement> al= new ArrayList<WebElement>(driver.findElements(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[2]/div[1]/div/div[1]")));
		//ArrayList<WebElement> al= new ArrayList<WebElement>(driver.findElements(By.className("_1vC4OE _2rQ-NK")));
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i).getText());
		}driver.close();
	}

public static void main(String[] args) {
	// TODO Auto-generated method stub
Flipkart oo= new Flipkart();
oo.demo();
}}
