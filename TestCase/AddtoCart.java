package SwagLabs.TestCase;

import org.Swag.Pages.LoginPage;
import org.Swag.Pages.dashPage;
import org.testng.annotations.Test;

import SwagLabs.Base.baseClass;

public class AddtoCart extends baseClass {
	
	@Test
	public void addCart() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		
		lp.directLogin("standard_user", "secret_sauce");
		Thread.sleep(2000);
		
		dashPage obj3 = new dashPage(driver);
		
		obj3.addtoCart();
		Thread.sleep(2000);
		
		obj3.cartPag();
		Thread.sleep(2000);
	}

}
