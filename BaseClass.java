package base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public  ChromeDriver driver;
	@BeforeMethod
	public void preCondition() {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		 driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	@AfterMethod
	public void postCondition() {
		driver.quit();
	}

}
