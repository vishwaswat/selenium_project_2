package seleniumProject2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;

public class TestCaseVerifyCalling {

	public static void main(String[] args) {
		// Verifying Test case page
		System.setProperty("webdriver.edge.driver", "C:/selenium/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		TestCaseVerify T = PageFactory.initElements(driver, TestCaseVerify.class);
		T.testcase.click();

	}

}
