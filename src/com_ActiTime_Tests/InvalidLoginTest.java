package com_ActiTime_Tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com_ActiTime_Generic.BaseTest;
import com_ActiTime_Generic.ExcelData;
import com_ActiTime_Pages.actiTIMELoginPage;

@Ignore
public class InvalidLoginTest extends BaseTest
{
	@Test(priority = 2)
	public void invalidLogin() throws InterruptedException
	{
		String title = ExcelData.getData(file_path, "TC01", 1, 2);
		actiTIMELoginPage lp = new actiTIMELoginPage(driver);
		// to verify login page title
		lp.verifyTitle(title);
		int rc = ExcelData.getRowCount(file_path, "TC02");
		for(int i = 1; i<=rc; i++)
		{
			String un = ExcelData.getData(file_path, "TC02", i, 0);
			String pw = ExcelData.getData(file_path, "TC02", i, 1);
			Reporter.log("User name = "+un,true);
			// enter invalid user name
			lp.enterUserName(un);
			Reporter.log("Password = "+pw,true);
			//enter invalid password
			lp.enterPassword(pw);
			//click on login button
			lp.clickOnLoginButton();
			String aErrorMessage = lp.getErrorMessage();
			String eErrorMessage = ExcelData.getData(file_path, "TC02", 1, 2);
			//verify error message
			Assert.assertEquals(aErrorMessage, eErrorMessage);
			Reporter.log("-----------------------------",true);
			Thread.sleep(1000);
		}
	}
}
