package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class CreateLeadPage extends BaseClass {
	
	public CreateLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public CreateLeadPage companyName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
		return this;
	}
	
	public CreateLeadPage firstName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("mukesh");

		return this;
}
	public CreateLeadPage lastName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("kannan");
		return this;
	}
	public ViewLeadPage clickCreateLed(){
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		return new ViewLeadPage(driver);
		
	}
}
