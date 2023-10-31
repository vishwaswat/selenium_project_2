package com.excelr.selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	// Signup page details
	@FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")
	WebElement signup;
	@FindBy(name = "name")
	WebElement signupname;
	@FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")
	WebElement emailid;
	@FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/button")
	WebElement signupbutton;

}
