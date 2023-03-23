package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class RunCreateLead extends BaseClass{
	
	@Test
	public void runProgram() {
		new LoginPage(driver).enterUserName()
		.enterPassWord()
		.clickLogin()
		.clickCrmsfa().clickLead().clickCreateLead().companyName()
		.firstName().lastName().clickCreateLed().verifyLead();
	}

}
