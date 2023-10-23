package seleniumProject2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPageCalling {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:/selenium/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		LoginPage L = PageFactory.initElements(driver, LoginPage.class);
		// Signup page details
		L.signup.click();
		L.signupname.isEnabled();
		L.signupname.sendKeys("swati");
		L.emailid.isEnabled();
		L.emailid.sendKeys("vishwaswat@gmail.com");
		L.signupbutton.click();

	}

}
