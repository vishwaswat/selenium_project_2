package seleniumProject2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountInfo {

	// Signup page details
	@FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")
	WebElement signup;
	@FindBy(name = "name")
	WebElement signupname;
	@FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")
	WebElement emailid;
	@FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/button")
	WebElement signupbutton;

	// ENTER ACCOUNT INFORMATION Details
	@FindBy(id = "id_gender2")
	WebElement Mrsradiobutton;
	@FindBy(id = "password")
	WebElement password;
	@FindBy(name = "days")
	WebElement day;
	@FindBy(name = "months")
	WebElement month;
	@FindBy(name = "years")
	WebElement year;
	@FindBy(name = "newsletter")
	WebElement newsletter;
	@FindBy(name = "optin")
	WebElement sploffer;

	// ADDRESS INFORMATION
	@FindBy(name = "first_name")
	WebElement firstname;
	@FindBy(name = "last_name")
	WebElement lastname;
	@FindBy(name = "company")
	WebElement company;
	@FindBy(id = "address1")
	WebElement address1;
	@FindBy(id = "address2")
	WebElement address2;
	@FindBy(name = "country")
	WebElement country;
	@FindBy(id = "state")
	WebElement state;
	@FindBy(id = "city")
	WebElement city;
	@FindBy(id = "zipcode")
	WebElement zipcode;
	@FindBy(id = "mobile_number")
	WebElement mbnumber;
	@FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div[1]/form/button")
	WebElement createaccount;
	@FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div/a")
	WebElement conti;

	// Logout
	@FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")
	WebElement logout;

	// Login with correct username & password
	@FindBy(name = "email")
	WebElement emailLogin;
	@FindBy(name = "password")
	WebElement passLogin;
	@FindBy(xpath = "//*[@id=\"form\"]/div/div/div[1]/div/form/button")
	WebElement login;

	// Verify Logged in as name
	@FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a")
	WebElement logedinasusername;

	// Deleting Account and verify
	@FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")
	WebElement deleteacc;
	@FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div/a")
	WebElement deleteconti;

	// Login with incorrect username & password
	@FindBy(name = "email")
	WebElement incorrectemailLogin;
	@FindBy(name = "password")
	WebElement incorrectpassLogin;
	@FindBy(xpath = "//*[@id=\"form\"]/div/div/div[1]/div/form/button")
	WebElement incorrectlogin;

}
