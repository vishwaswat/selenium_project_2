package seleniumProject2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;

public class AccountInfoCalling {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:/selenium/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		LoginPage L = PageFactory.initElements(driver, LoginPage.class);
		AccountInfo L1 = PageFactory.initElements(driver, AccountInfo.class);
		L.signup.click();
		// Login with correct username & password
		L1.emailLogin.sendKeys("vishwaswat@gmail.com");
		L1.passLogin.sendKeys("Swati@1234");
		L1.login.click();

		// Verify Logged in as name
		L1.logedinasusername.isDisplayed();

		// Deleting Account and verify
		L1.deleteacc.click();
		L1.deleteconti.click();

		// Signup page details
		L.signup.click();
		L.signupname.isEnabled();
		L.signupname.sendKeys("swati");
		L.emailid.isEnabled();
		L.emailid.sendKeys("vishwaswat@gmail.com");
		L.signupbutton.click();

		// ENTER ACCOUNT INFORMATION Details
		L1.Mrsradiobutton.click();
		L1.password.sendKeys("Swati@1234");
		L1.day.sendKeys("13");
		L1.month.sendKeys("October");
		L1.year.sendKeys("1987");
		L1.newsletter.click();
		L1.sploffer.click();

		// ADDRESS INFORMATION
		L1.firstname.sendKeys("swati");
		L1.lastname.sendKeys("khot");
		L1.company.sendKeys("ExcelR Solutions");
		L1.address1.sendKeys("ExcelR office");
		L1.address2.sendKeys("Baner");
		L1.country.sendKeys("India");
		L1.state.sendKeys("Maharastra");
		L1.city.sendKeys("Pune");
		L1.zipcode.sendKeys("411061");
		L1.mbnumber.sendKeys("1234567891");
		L1.createaccount.click();
		L1.conti.click();

		// Logout
		L1.logout.click();

		// Login with incorrect username & password
		L1.incorrectemailLogin.sendKeys("vishwaswat@gmail.com");
		L1.incorrectpassLogin.sendKeys("avaneesh@1234");
		L1.incorrectlogin.click();

		L.signup.click();
		// Login with correct username & password
		L1.emailLogin.sendKeys("vishwaswat@gmail.com");
		L1.passLogin.sendKeys("Swati@1234");
		L1.login.click();

		// Verify Logged in as name
		L1.logedinasusername.isDisplayed();

		// Deleting Account and verify
		L1.deleteacc.click();
		L1.deleteconti.click();

	}

}
