package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class HomePage extends BaseClass{
	
	public HomePage(ChromeDriver driver) {
		this.driver=driver;
	}
	public MyHomePage clickCrmsfa() {
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		return new MyHomePage(driver);
	}

}
