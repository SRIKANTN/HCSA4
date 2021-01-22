package com_ActiTime_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com_ActiTime_Generic.BasePage;

public class FacebooklogInOrSignUPage extends BasePage
{
	@FindBy(id = "email")
	private WebElement unTB;
	
	@FindBy(id = "pass")
	private WebElement pwTB;	
	
	@FindBy(name = "login")
	private WebElement lgBT;

	public FacebooklogInOrSignUPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void enterEmailId(String un)
	{
		unTB.sendKeys(un);
	}
	public void enterPassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	public void clickOnLogin()
	{
		lgBT.click();
	}
}
