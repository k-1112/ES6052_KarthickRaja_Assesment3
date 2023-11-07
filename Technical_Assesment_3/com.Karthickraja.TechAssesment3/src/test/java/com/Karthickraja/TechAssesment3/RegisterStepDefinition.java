package com.Karthickraja.TechAssesment3;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDefinition {
	RegisterUtility data = new RegisterUtility();
	Register_Actions objLogin = new Register_Actions();
//	HomePageActions objHome = new HomePageActions();
 
	@Given("User is on register page")
	public void user_is_on_register_page() {
		Baseclass.openPage(data.url);
	    System.out.println("Register page");
	}
	
	@When("User clicks register")
	public void user_clicks_register() {
	    objLogin.clickRegisterForm();
	    System.out.println("User clicks register");
	}
	
	@When("User clicks gender")
	public void user_clicks_gender() {
	    objLogin.clickGender();
	    System.out.println("Gender is selected");
	}
	
	@When("User provides the credentials")
	public void user_provides_the_credentials() {
		objLogin.register(data.firstname, data.lastname, data.Email, data.Password, data.confirmpassword);
		System.out.println("User logged in");
	}
	
	@When("User clicks register button")
	public void user_clicks_register_button() {
	    objLogin.clickRegister();
	}
	
	@Then("User successfully registered")
	public void user_successfully_registered() {
//		Assert.assertTrue(objHome.getVerifyText().contains("Register"));
		System.out.println("User registered successfully");
	}
}
