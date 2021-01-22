package com_ActiTime_Tests;

import org.testng.annotations.Test;
import com_ActiTime_Generic.BaseTest;
import com_ActiTime_Generic.ExcelData;
import com_ActiTime_Pages.actiTIMEEnterTimeTrackPage;
import com_ActiTime_Pages.actiTIMELoginPage;

public class ValidLoginLogoutTest extends BaseTest
{
	@Test(priority = 1)
	public void validLoginLogout()
	{
		String un = ExcelData.getData(file_path, "TC01", 1, 0);
		String pw = ExcelData.getData(file_path, "TC01", 1, 1);
		String lgTitle = ExcelData.getData(file_path, "TC01", 1, 2);
		String hpTitle = ExcelData.getData(file_path, "TC01", 1, 3);
		actiTIMELoginPage lp = new actiTIMELoginPage(driver);
		actiTIMEEnterTimeTrackPage hp = new actiTIMEEnterTimeTrackPage(driver);
		//to verify title of login page
		lp.verifyTitle(lgTitle);
		//Enter valid user name
		lp.enterUserName(un);
		//Enter valid password
		lp.enterPassword(pw);
		//click on login button
		lp.clickOnLoginButton();
		//to verify enter time track page  
		lp.verifyTitle(hpTitle);
		//to click on logout button
		hp.clickOnLogoutButton();
		//to verify title of login page
		hp.verifyTitle(lgTitle);
	}
}
