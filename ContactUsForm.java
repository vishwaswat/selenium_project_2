package seleniumProject2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsForm {
	// Contact Us Form

	@FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[8]/a")
	WebElement contactus;
	@FindBy(name = "name")
	WebElement name;
	@FindBy(name = "email")
	WebElement email;
	@FindBy(name = "subject")
	WebElement subject;
	@FindBy(id = "message")
	WebElement yourmsg;
	// @FindBy(name="upload_file")WebElement uploadfile;
	@FindBy(name = "submit")
	WebElement submit;
	@FindBy(xpath = "//*[@id=\"form-section\"]/a/span/i")
	WebElement home;

}
