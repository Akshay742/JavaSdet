package Testng;

import org.testng.annotations.Test;

public class testDemo {
	@Test(priority=0)
	public void driverinfor() {
		System.out.println("driver");
	}
	@Test(priority=1)
	public void launch() {
		System.out.println("launch browser");
	}

}
