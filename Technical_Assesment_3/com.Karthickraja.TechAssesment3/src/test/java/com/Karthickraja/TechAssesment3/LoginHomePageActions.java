package com.Karthickraja.TechAssesment3;

import org.openqa.selenium.support.PageFactory;

public class LoginHomePageActions {
LoginHomePageLocators loginHomePageLocators = null;
	
	public  LoginHomePageActions() {  
		this.loginHomePageLocators = new LoginHomePageLocators();
		PageFactory.initElements(Baseclass.getDriver(),loginHomePageLocators);
	}
	public String getVerifyText() {
		return loginHomePageLocators.assertContains.getText();
	}
	public String VerifyErrorMessage() {
		return loginHomePageLocators.VerifyErrorMessage.getText();
	}
}
