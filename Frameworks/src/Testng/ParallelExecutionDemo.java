package Testng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecutionDemo {
String path;
WebDriver driver;
@Parameters("browser")
@Test
public void launch(String browser_name) {
	if(browser_name.contentEquals("chrome")) {
		//System.getProperty()
	}
}



}
