package org.Swag.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


import SwagLabs.Base.baseClass;

public class LoginPage extends baseClass {

	public LoginPage (WebDriver driver) {
		this.driver = driver;
	}

	//valid credentials - Username
	public LoginPage enterUserName(String username) {
		driver.findElement(By.id("user-name")).sendKeys(username,Keys.TAB);
		return this;
	}

	//valid credentials - Password
	public LoginPage enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password,Keys.TAB);
		return this;
	}

	//Click Login button
	public dashPage clickBtn() {
		driver.findElement(By.id("login-button")).click();
		return new dashPage(driver);
	}
	
	//Direct Login method
	public dashPage directLogin(String username,String password) {
		LoginPage obj = new LoginPage(driver);
		obj.enterUserName(username);
		obj.enterPassword(password);
		obj.clickBtn();
		return new dashPage(driver);
	}
}
