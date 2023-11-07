package com.Karthickraja.TechAssesment3;

import org.openqa.selenium.support.PageFactory;

public class Register_Actions {
	Register_Locator register_Locator = null;
	String strFirstName, strLastName, strEmail, strPassWord, strConfirmPassword;
	
	public  Register_Actions() {  
		this.register_Locator = new Register_Locator();
		PageFactory.initElements(Baseclass.getDriver(),register_Locator);
	}
	public void clickRegisterForm() {
		register_Locator.register.click();
	}
	public void clickGender() {
		register_Locator.gendermale.click();
	}
	public void setFirstName(String strFirstName) {
		register_Locator.firstName.sendKeys(strFirstName);
	}
	
	public void setLastName(String strLastName) {
		register_Locator.lastName.sendKeys(strLastName);
	}
	public void setEmail(String strEmail) {
		register_Locator.eMail.sendKeys(strEmail);
	}
	public void setPassWord(String strPassWord) {
		register_Locator.passWord.sendKeys(strPassWord);
	}
	public void setConfirmPassword(String strConfirmPassword) {
		register_Locator.confirmPassWord.sendKeys(strConfirmPassword);
	}
		
	public void clickRegister() {
		register_Locator.registerClick.click();
	}
	
	public void register(String strFirstName, String strLastName, String strEmail, String strPassWord, String strConfirmPassword) {
		this.setFirstName(strFirstName);
		this.setLastName(strLastName);
		this.setEmail(strEmail);
		this.setPassWord(strPassWord);
		this.setConfirmPassword(strConfirmPassword);
 
	}
 
		
		
}
