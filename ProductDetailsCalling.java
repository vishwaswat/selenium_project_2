package seleniumProject2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsCalling {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:/selenium/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		ProductDetails P = PageFactory.initElements(driver, ProductDetails.class);
		LoginPage L = PageFactory.initElements(driver, LoginPage.class);
		AccountInfo L1 = PageFactory.initElements(driver, AccountInfo.class);

		
		// Product Details
		P.products.click();
		P.searchproduct.sendKeys("saree");
		P.clickonsearch.click();
		P.Firstviewproduct.click();
		P.firstproductadd.click();
		P.continueshopping.click();
		P.products.click();
		P.secondproduct.click();
		P.secondproductadd.click();
		P.viewcart.click();
		P.proceedcheckout.click();
		P.registerforcheckout.click();

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

		P.cart.click();
		P.proceedcheckout.click();

		P.placeorder.click();
		P.nameoncard.sendKeys("swati");
		P.cardnumber.sendKeys("123456789");
		P.cvc.sendKeys("123");
		P.MM.sendKeys("01");
		P.year.sendKeys("2024");
		P.submit.click();
		P.invoice.click();
		P.conti.click();

		// P.registerforcheckout.click();
		P.products.click();

		// Page Scrolldown
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,8000)");
		P.scrolldown.sendKeys("vishwaswat@gmail.com");
		P.arrowclick.click();

	}

}
