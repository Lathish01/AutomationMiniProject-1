package SwagLabs.TestCase;

import org.Swag.Pages.CheckOutOverview;
import org.Swag.Pages.CheckOutPage;
import org.Swag.Pages.LoginPage;
import org.Swag.Pages.OrderConfirmationPage;
import org.Swag.Pages.cartPage;
import org.Swag.Pages.dashPage;
import org.testng.annotations.Test;

import SwagLabs.Base.baseClass;

public class TestCheckoutOverview extends baseClass {
	
	@Test(priority = 1)
	public void finishPage() throws InterruptedException {
		
		//calling login method  
		LoginPage lpage = new LoginPage(driver);
		lpage.directLogin("standard_user","secret_sauce");
		Thread.sleep(2000);
		
		//calling dash page 
		dashPage lpage2 = new dashPage(driver);
		lpage2.addtoCart();
		lpage2.cartPag();
		Thread.sleep(2000);
		
		//calling cart page
		cartPage lpage3 = new cartPage(driver);
		lpage3.clickCheckout();
		Thread.sleep(2000);
		
		//calling checkout page
		CheckOutPage lpage4 = new CheckOutPage(driver);
		lpage4.enterName("Lathish");
		lpage4.lastName("kannan");
		lpage4.ZipNumber("641607");
		Thread.sleep(2000);
		lpage4.clickContinue();
		
		//calling checkout Overview page
		CheckOutOverview lpage5 = new CheckOutOverview(driver);
		lpage5.clickFinish();
		
		//calling order confirmation page to get the title
		OrderConfirmationPage lpage6 = new OrderConfirmationPage(driver);
		lpage6.finalTitle();
		
		
		
		
		
	}

}
