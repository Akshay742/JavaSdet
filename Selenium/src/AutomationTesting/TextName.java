package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextName {
	String path;
	WebElement uname;
	WebElement pass;
	
	public void launch() {
		path= System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		System.out.println(path);
		WebDriver driver= new ChromeDriver();
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
		
		uname =driver.findElement(By.name("email"));
		System.out.println(uname.getSize());
		
		if(uname.isDisplayed()) {
			uname.sendKeys("admin");
		}
		
	pass =driver.findElement(By.name("pass"));
	if(pass.isDisplayed()) {
		pass.sendKeys("admin");
	}
	driver.findElement(By.id("u_0_b")).click();
	}
	//driver.close();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextName obj= new TextName();
		obj.launch();

	}

}
