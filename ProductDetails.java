package seleniumProject2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetails {
	// Product Details
	@FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")
	WebElement products;
	@FindBy(id = "search_product")
	WebElement searchproduct;
	@FindBy(id = "submit_search")
	WebElement clickonsearch;
	@FindBy(xpath = "/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[2]/ul/li/a/i")
	WebElement Firstviewproduct;
	@FindBy(xpath = "/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")
	WebElement firstproductadd;
	@FindBy(xpath = "//*[@id=\"cartModal\"]/div/div/div[3]/button")
	WebElement continueshopping;
	@FindBy(xpath = "/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[2]/ul/li/a")
	WebElement secondproduct;
	@FindBy(xpath = "/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")
	WebElement secondproductadd;
	@FindBy(xpath = "//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a/u")
	WebElement viewcart;
	@FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a")
	WebElement home;
//  @FindBy(xpath="/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[2]/div/a")WebElement addfour;
	@FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")
	WebElement cart;
	@FindBy(xpath = "//*[@id=\"do_action\"]/div[1]/div/div/a")
	WebElement proceedcheckout;

	@FindBy(xpath = "//*[@id=\"cart_items\"]/div/div[7]/a")
	WebElement placeorder;
	@FindBy(name = "name_on_card")
	WebElement nameoncard;
	@FindBy(xpath = "//*[@id=\"payment-form\"]/div[2]/div/input")
	WebElement cardnumber;
	@FindBy(xpath = "//*[@id=\"payment-form\"]/div[3]/div[1]/input")
	WebElement cvc;
	@FindBy(name = "expiry_month")
	WebElement MM;
	@FindBy(xpath = "//*[@id=\"payment-form\"]/div[3]/div[3]/input")
	WebElement year;
	@FindBy(id = "submit")
	WebElement submit;
	@FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div/a")
	WebElement conti;
	@FindBy(xpath = "//*[@id=\"form\"]/div/div/div/a")
	WebElement invoice;

	@FindBy(xpath = "//*[@id=\"checkoutModal\"]/div/div/div[2]/p[2]/a/u")
	WebElement registerforcheckout;

	// Page Scrolldown
	@FindBy(id = "susbscribe_email")
	WebElement scrolldown;
	@FindBy(xpath = "//*[@id=\"subscribe\"]/i")
	WebElement arrowclick;

}
