package com_ActiTime_Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com_ActiTime_Generic.BasePage;

public class FacebookPage extends BasePage
{

	@FindBy(xpath = "//div[@class='j83agx80 l9j0dhe7']")
	private WebElement accountBT;
	
	@FindBy(xpath = "//div[@class='b20td4e0 muag1w35']//span")
	private List<WebElement> allopt;
	
	public FacebookPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnAccountBT()
	{
		accountBT.click();
	}
	
	public void dispalyedAllOptions()
	{
		int count = allopt.size();
		Reporter.log("Total Optins "+count,true);
		
		for(WebElement opt : allopt)
		{
			
			String text = opt.getText();
			Reporter.log("Text "+text,true);
		}
	}
	
	
	
	
	

}
