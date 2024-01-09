package SwagLabs.TestCase;

import org.Swag.Pages.LoginPage;
import org.testng.annotations.Test;

import SwagLabs.Base.baseClass;

public class ValidInputs extends baseClass {

	@Test(priority = 1,enabled = false)
	public void validCredentials() {
		
		LoginPage obj2 = new LoginPage(driver);
		
		obj2.enterUserName("standard_user");
		obj2.enterPassword("secret_sauce");
		obj2.clickBtn();
	
		
	}
}
