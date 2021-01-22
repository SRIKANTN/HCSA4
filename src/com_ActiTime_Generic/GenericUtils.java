package com_ActiTime_Generic;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.google.common.io.Files;


public class GenericUtils 
{
	/***
	 * @author srikanth
	 * @category to take screen shot
	 */
	public static void getScreenShot(WebDriver driver, String name)
	{
		SimpleDateFormat s1 = new SimpleDateFormat("DD-MM-YYYY");
		String date = s1.format(new Date());
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try
		{
			Files.copy(src, new File("./ScreenShot/"+date+"_"+name+".png"));
		}
		catch (Exception e)
		{
		}
	}
	
	public static void selectByIndex(WebElement element, int index)
	{
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	
	public static void selectByValue(WebElement element, String value)
	{
		Select sel = new Select(element);
		sel.selectByValue(value);
	}
	
	public static void selectByVisibleText(WebElement element, String text)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	
	
	public static void deselectByIndex(WebElement element, int index)
	{
		Select sel = new Select(element);
		sel.deselectByIndex(index);
	}
	
	public static void deselectByValue(WebElement element, String value)
	{
		Select sel = new Select(element);
		sel.deselectByValue(value);
	}
	
	public static void deselectByVisibleText(WebElement element, String text)
	{
		Select sel = new Select(element);
		sel.deselectByVisibleText(text);
	}
	
	public static void deselectAll(WebElement element)
	{
		Select sel = new Select(element);
		sel.deselectAll();
	}
	
	public static void getAllSelectedOptions(WebElement element)
	{
		Select sel = new Select(element);
		List<WebElement> allopt = sel.getAllSelectedOptions();
		int count = allopt.size();
		Reporter.log("Count of selected options = "+count,true);
		Reporter.log("All selected options ",true);
		for(WebElement opt : allopt)
		{
			String text = opt.getText();
			Reporter.log(text, true);
		}
	}
	
}
