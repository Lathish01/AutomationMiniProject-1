package SwagLabs.TestCase;

import org.Swag.Pages.CheckOutPage;
import org.Swag.Pages.LoginPage;
import org.Swag.Pages.cartPage;
import org.Swag.Pages.dashPage;


import SwagLabs.Base.baseClass;

public class CheckoutInformation extends baseClass {
	
	public void info() throws InterruptedException {
		
		LoginPage lpage = new LoginPage(driver);
		lpage.directLogin("standard_user","secret_sauce");
		Thread.sleep(2000);
		
		dashPage lpage2 = new dashPage(driver);
		lpage2.addtoCart();
		lpage2.cartPag();
		Thread.sleep(2000);
		
		cartPage lpage3 = new cartPage(driver);
		lpage3.clickCheckout();
		Thread.sleep(2000);
		
		CheckOutPage lpage4 = new CheckOutPage(driver);
		lpage4.enterName("Lathish");
		Thread.sleep(2000);
		lpage4.lastName("kannan");
		Thread.sleep(2000);
		lpage4.ZipNumber("641607");
		Thread.sleep(2000);
		lpage4.clickContinue();
		
		
	}

}
