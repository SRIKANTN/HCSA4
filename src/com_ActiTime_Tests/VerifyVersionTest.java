package com_ActiTime_Tests;

import org.testng.Reporter;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com_ActiTime_Generic.BaseTest;
import com_ActiTime_Generic.ExcelData;
import com_ActiTime_Pages.actiTIMELoginPage;

@Ignore
public class VerifyVersionTest extends BaseTest
{
	@Test(priority = 3)
	public void verifyVersion()
	{
		String title = ExcelData.getData(file_path, "TC01", 1, 2);
		actiTIMELoginPage lp = new actiTIMELoginPage(driver);
		// to verify login page title
		lp.verifyTitle(title);
		String aVersion = lp.getVersion();
		String eVersion = ExcelData.getData(file_path, "TC03", 1, 0);
		Reporter.log("Application version = "+aVersion,true);
		SoftAssert sa =new SoftAssert();
		//to verify application version
		sa.assertEquals(aVersion, eVersion);
		sa.assertAll();
	}
}
