package com.Karthickraja.TechAssesment3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register_Locator {
		
	@FindBy(xpath="//a[contains(text(),'Register')]")
	public WebElement register;
	
	@FindBy(xpath="//input[@id='gender-male']")
	public WebElement gendermale;
	
	@FindBy(id="FirstName")
	public WebElement firstName;
	
	@FindBy(id="LastName")
	public WebElement lastName;
	
	@FindBy(id="Email")
	public WebElement eMail;
	
	@FindBy(id="Password")
	public WebElement passWord;
	
	@FindBy(id="ConfirmPassword")
	public WebElement confirmPassWord;
	
	@FindBy(id="register-button")
	public WebElement registerClick;
	
	
}
