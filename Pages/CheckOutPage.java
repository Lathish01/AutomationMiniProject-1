package org.Swag.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import SwagLabs.Base.baseClass;

public class CheckOutPage extends baseClass {
	
	
	public CheckOutPage(WebDriver driver) {
		this.driver=driver;
	}

	//enter personal-details to check out the product
	public CheckOutPage enterName(String name) {
		driver.findElement(By.id("first-name")).sendKeys(name,Keys.TAB);
		return this;
	}
	
	public CheckOutPage lastName(String lastname) {
		driver.findElement(By.id("last-name")).sendKeys(lastname,Keys.TAB);
		return this;
	}
	
	public CheckOutPage ZipNumber(String zipCode) {
		driver.findElement(By.id("postal-code")).sendKeys(zipCode);
		return this;
	}
	
	//click continue to check-out overview page
	public CheckOutOverview clickContinue() {
		driver.findElement(By.id("continue")).click();
		return new CheckOutOverview(driver);
	}
}
