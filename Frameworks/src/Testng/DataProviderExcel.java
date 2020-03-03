package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExcel {
	String path;
	@Test(dataProvider="authenticate")
	public void Checklogin(String email,String pass) {
		path=System.getProperty("user.dir")+"//Drivers1//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver= new ChromeDriver();
	}
	public Object[][] readdata(){
		Object[][] login=new Object[3][2];
		login[0][0]="admin";
		login[0][1]="adm";
		
		login[1][0]="ads";
	    login[1][1]="ad";
	    		
		login[2][0]="123";
		login[2][1]="sd";
		
		return login;

}
	@Test(dataProvider="authenticate")
	
public void CheckloginDemo(Object uname,Object pass) {
		System.out.println("username"+uname);
		System.out.println("password"+pass);
	}
}
