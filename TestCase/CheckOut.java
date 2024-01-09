package SwagLabs.TestCase;


import org.Swag.Pages.LoginPage;
import org.Swag.Pages.cartPage;
import org.Swag.Pages.dashPage;
import org.testng.annotations.Test;

import SwagLabs.Base.baseClass;

public class CheckOut extends baseClass {
	
	
	@Test
	 public void check() throws InterruptedException {
		
		
		 LoginPage obj4 = new LoginPage(driver);
		 
		 obj4.directLogin("standard_user", "secret_sauce");
		 Thread.sleep(3000);
		 
		 dashPage obj5 = new dashPage(driver);
		 
		 obj5.addtoCart();
		 Thread.sleep(3000);
		
		 obj5.cartPag();
		 Thread.sleep(3000);
		 
		 cartPage obj6=new cartPage(driver);
		 
		 obj6.clickCheckout();
		 Thread.sleep(3000);
	 }
		
		
	
	
	
	}
