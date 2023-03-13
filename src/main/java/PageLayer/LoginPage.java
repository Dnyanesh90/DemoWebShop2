package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.DropDownMethods;
import UtilsLayer.UtilsClass;


public class LoginPage extends BaseClass {
	
	@FindBy(xpath = "//a[@href='/login']")
	private WebElement loginlink;
	
	@FindBy(name = "Email")
	private WebElement email;

	@FindBy(name = "Password")
	private WebElement password;

	@FindBy(xpath = "(//*[@type='submit'])[2]")
	private WebElement loginbutton;
	
	@FindBy(xpath = "(//a[@href='/computers'])[3]")
	private WebElement complink;

	@FindBy(xpath = "(//div[@class='sub-category-item'])[1]")
	private WebElement deskbutton;
	
	@FindBy(xpath = "//img[@alt='Picture of Build your own expensive computer']")
	private WebElement addTocart;

	@FindBy(xpath = "(//input[@type='button'])[2]")
	private WebElement addCart;

	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement shopping;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private WebElement checkbox;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement checkout;
	
	@FindBy(xpath = "//select[@name='billing_address_id']")
	private WebElement billing;
	
//	@FindBy(xpath = "(//input[@type='text'])[2]")
//	private WebElement firstname;
//	
//	@FindBy(xpath = "(//input[@type='text'])[3]")
//	private WebElement lastname;
//	
//	@FindBy(xpath = "(//input[@type='text'])[4]")
//	private WebElement mailId;
//	
	@FindBy(xpath = "(//input[@type='text'])[5]")
	private WebElement companyname;
	
	@FindBy(xpath = "(//select[@data-val='true'])[1]")
	private WebElement country;
	
	@FindBy(xpath = "(//input[@type='text'])[6]")
	private WebElement cityname;
	
	@FindBy(xpath = "(//input[@type='text'])[7]")
	private WebElement add;
	
	@FindBy(xpath = "(//input[@type='text'])[9]")
	private WebElement pincode;
	
	@FindBy(xpath = "(//input[@type='text'])[10]")
	private WebElement phoneno;
	
	@FindBy(xpath = "(//input[@title='Continue'])[1]")
	private WebElement save;
	
	@FindBy(xpath = "//select[@name='shipping_address_id']")
	private WebElement shippingadd;
	
	@FindBy(xpath = "(//input[@title='Continue'])[2]")
	private WebElement save1;
	
	@FindBy(xpath = "//input[@id='shippingoption_1']")
	private WebElement shippingmethod;
	
	@FindBy(xpath = "//input[@onclick='ShippingMethod.save()']")
	private WebElement shippingmethod1;
	
	@FindBy(xpath = "//input[@id='paymentmethod_0']")
	private WebElement cashOnDelivery;
	
	@FindBy(xpath = "//input[@onclick='PaymentMethod.save()']")
	private WebElement paymentmethod;
	
	@FindBy(xpath = "//p[text()='You will pay by COD']")
	private WebElement paymentmessage;
	
	@FindBy(xpath = "//input[@onclick='PaymentInfo.save()']")
	private WebElement paymentinfo;

	@FindBy(xpath = "//div[@class='order-review-data']")
	private WebElement confirmOrder1;
	
	@FindBy(xpath = "//input[@onclick='ConfirmOrder.save()']")
	private WebElement confirmOrder;
	
	@FindBy(xpath = "//ul[@class='details']")
	private WebElement Orderno;
	
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement ordersucces;
	
	@FindBy(xpath = "//a[@class='ico-logout']")
	private WebElement logout;
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	public void clickOnLoginLink() {
		UtilsClass.clickOnElement(loginlink);
	}

	public void typeEmailidAndPassword(String mailid, String pass) {
		UtilsClass.enterData(email, mailid);
		UtilsClass.enterData(password, pass);
	}

	public void clickonLoginButton() {
		UtilsClass.clickOnElement(loginbutton);
	}
	
	public void clickOnCompLink() {
		UtilsClass.clickOnElement(complink);
	
	}

	public void clickonDeskButton() {
		UtilsClass.clickOnElement(deskbutton);
	}
    public void clickonAddTocartButton() {
	UtilsClass.clickOnElement(addTocart);
	
	}
	public void clickonAddCartButton() {
		UtilsClass.clickOnElement(addCart);
	}
	public void clickonShoppingButton() {
		UtilsClass.clickOnElement(shopping);
	}
	public void clickonCheckBoxButton() {
		UtilsClass.clickOnElement(checkbox);
	}
	public void clickonCheckOutButton() {
		UtilsClass.clickOnElement(checkout);
	}
	public void selectAddress(String value) {
		DropDownMethods.seletvalueByVisibleText(billing, value);
	}
	public void typeFirstnameAndLastName(String fname, String lass, String mail, String company ) {
		//UtilsClass.enterData(firstname, fname);
		//UtilsClass.enterData(lastname, lass);
		//UtilsClass.enterData(mailId, mail);
		UtilsClass.enterData(companyname, company);
	}
	public void selectCountry(String valid) {
		DropDownMethods.seletvalueByVisibleText(country, valid);
	}
	public void typeCityAndAddress1(String city, String address1, String pcode, String phno) {
		UtilsClass.enterData(cityname, city);
		UtilsClass.enterData(add, address1);
		UtilsClass.enterData(pincode, pcode);
		UtilsClass.enterData(phoneno, phno);
		
	}
	public void clickOnContinue() {
		UtilsClass.clickOnElement(save);
	}
	public void selectShippingAddress(String value) {
		DropDownMethods.seletvalueByVisibleText(shippingadd, value);
	}
	public void clickOnContinue1() {
		UtilsClass.clickOnElement(save1);
	}
	public void clickonShippingMethodButton() {
		UtilsClass.clickOnElement(shippingmethod);
	}
	public void clickonShippingMethodButton1() {
		UtilsClass.clickOnElement(shippingmethod1);
	}
	public void clickonCashOnDeliveryButton() {
		UtilsClass.clickOnElement(cashOnDelivery);
	}
	public void clickonPaymentMethodButton() {
		UtilsClass.clickOnElement(paymentmethod);
	}
	public void clickonPaymentMessageButton() {
		UtilsClass.clickOnElement(paymentmessage);
	}
	public void clickonPaymentInfoButton() {
		UtilsClass.clickOnElement(paymentinfo);
	}
	public void clickonConfirmOrder1Button() {
		UtilsClass.clickOnElement(confirmOrder1);
	}
	public void clickonConfirmOrderButton() {
		UtilsClass.clickOnElement(confirmOrder);
	}
	public void captureOrderno() {
		
		System.out.print(Orderno.getText());
	}
	public void clickonSetLocationButton() {
		UtilsClass.clickOnElement(ordersucces);
	}
	public void clickonLogOutButton() {
		UtilsClass.clickOnElement(logout);
	}
}



	


