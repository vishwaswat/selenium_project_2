package seleniumProject2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;

public class ContactUSFormCalling {

	public static void main(String[] args) throws Exception {
		// Contact Us Form
		System.setProperty("webdriver.edge.driver", "C:/selenium/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		ContactUsForm C = PageFactory.initElements(driver, ContactUsForm.class);

		C.contactus.click();
		C.name.sendKeys("Swati");
		C.email.sendKeys("vishwaswat@gmail.com");
		C.subject.sendKeys("Contactme");
		C.yourmsg.sendKeys("Call m if Needed");
		// C.uploadfile.click();
		C.submit.click();
		// importing alert
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		// to close alert msg
		a.accept();
		Thread.sleep(2000);
		C.home.click();

	}

}
