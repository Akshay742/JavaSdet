package Testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HomeTest extends OrangeHrm {
	@Test(groups= {"Smoke","regression"})
	public void checkadmin() {
		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b"));
	}

}
