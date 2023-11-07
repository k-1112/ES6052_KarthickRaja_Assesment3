package com.Karthickraja.TechAssesment3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginHomePageLocators {
	@FindBy(xpath="//a[contains(text(),'karthickrajamuralidharan@gmail.com')]")
	public WebElement assertContains;
	
	@FindBy(xpath="//span[text()=\"Login was unsuccessful. Please correct the errors and try again.\"]")
	WebElement VerifyErrorMessage;
}
