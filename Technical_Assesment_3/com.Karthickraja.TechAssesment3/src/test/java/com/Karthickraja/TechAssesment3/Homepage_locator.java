package com.Karthickraja.TechAssesment3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage_locator {
	@FindBy(xpath="//a[text()='kill@gmail.com']")
	WebElement Text1;
	
	@FindBy(xpath="//span[text()='Login was unsuccessful. Please correct the errors and try again.']")
	WebElement ErrorMessage;
}