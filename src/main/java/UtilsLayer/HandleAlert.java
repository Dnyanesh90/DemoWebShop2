package UtilsLayer;

import BaseLayer.BaseClass;

public class HandleAlert extends BaseClass {

	public static void clickOnOkButton() {
		driver.switchTo().alert().accept();
	}

	public static void clickOnCancelButton() {
		driver.switchTo().alert().dismiss();
	}
	
	public static String captureAlertPopText()
	{
//		 Alert alt = driver.switchTo().alert();
//		 String a = alt.getText();
//		 return a;
		
		return driver.switchTo().alert().getText();
	}
	
	public static void enterData(String value)
	{
		driver.switchTo().alert().sendKeys(value);
	}
	
	
	

}
