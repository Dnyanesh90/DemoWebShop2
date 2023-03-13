package TestLayer;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;

public class LoginPageTest extends BaseClass {

	

	
	@BeforeClass
	public void setUp() {
		BaseClass.inilization();
	}

	@Test
	public void validateLoginFunctionality() {
		LoginPage loginpage = new LoginPage();
		loginpage.clickOnLoginLink();
		loginpage.clickOnLoginLink();
		loginpage.typeEmailidAndPassword("planittest78@gmail.com", "123456");
		loginpage.clickonLoginButton();
		loginpage.clickOnCompLink();
		loginpage.clickonDeskButton();
		loginpage.clickonAddTocartButton();
		loginpage.clickonAddCartButton();
		loginpage.clickonShoppingButton();
		loginpage.clickonCheckBoxButton();
		loginpage.clickonCheckOutButton();
		loginpage.selectAddress("New Address");
		loginpage.typeFirstnameAndLastName("DNYANESHWAR", "KADAM", "planittest78@gmail.com", "SYSCRYPTION TECHNOLOGIES");
		loginpage.selectCountry("India");
		loginpage.typeCityAndAddress1("pune", "katraj", "414315", "8073900651");
		loginpage.clickOnContinue();
		loginpage.selectShippingAddress("planit test, katraj, pune 414315, India");
		loginpage.clickOnContinue1();
		loginpage.clickonShippingMethodButton();
		loginpage.clickonShippingMethodButton1();
		loginpage.clickonCashOnDeliveryButton();
		loginpage.clickonPaymentMethodButton();
		loginpage.clickonPaymentMessageButton();
		loginpage.clickonPaymentInfoButton();
		loginpage.clickonConfirmOrder1Button();
		loginpage.clickonConfirmOrderButton();
		loginpage.captureOrderno();
		loginpage.clickonSetLocationButton();
		loginpage.clickonLogOutButton();
		
	}


	@AfterClass
	public void tearDown() {
		//driver.quit();

}
}