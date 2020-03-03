package Data_driven.TestData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class fetch_data {
	String var,uname,pass,path;
	public void launch() throws IOException {
		FileInputStream fs= new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\Selenium\\Test_data\\workbook.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(fs);
		XSSFSheet sheet= wb.getSheet("login");
		int count=sheet.getLastRowNum();
		System.out.println(count);
		XSSFRow row=sheet.getRow(0);
		int col=row.getLastCellNum()-1;
		path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver= new ChromeDriver();

		for(int i=1;i<=count;i++) {
			//XSSFRow row=sheet.getRow(i);
			for(int j=0;j<col;j++) {
				driver.navigate().to("https://www.facebook.com");
				uname=sheet.getRow(i).getCell(j).toString();
				pass=sheet.getRow(i).getCell(j+1).toString();
				
				driver.findElement(By.name("email")).clear();
				driver.findElement(By.name("email")).sendKeys(uname);
				driver.findElement(By.name("pass")).clear();
				driver.findElement(By.name("pass")).sendKeys(pass);
				driver.findElement(By.id("u_0_b")).click();
				driver.navigate().back();
				//XSSFCell cell= row.getCell(j);
				//System.out.println(cell);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		fetch_data oo= new fetch_data();
		oo.launch();

	}

}
