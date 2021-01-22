package com_ActiTime_Tests;

import org.testng.annotations.Test;

import com_ActiTime_Generic.BaseTest;
import com_ActiTime_Pages.FacebookPage;
import com_ActiTime_Pages.FacebooklogInOrSignUPage;

public class FBTest extends BaseTest
{
	@Test
	public void fBLogin()
	{
		FacebooklogInOrSignUPage lp = new FacebooklogInOrSignUPage(driver);
		FacebookPage hp = new FacebookPage(driver);
		lp.enterEmailId("Shivasg4385@gmail.com");
		lp.enterPassword("Test1234$");
		lp.clickOnLogin();
		hp.clickOnAccountBT();
		hp.dispalyedAllOptions();
		
	}

}
