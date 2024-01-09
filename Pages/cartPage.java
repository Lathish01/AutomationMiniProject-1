package org.Swag.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import SwagLabs.Base.baseClass;

public class cartPage extends baseClass {

	
	public cartPage (WebDriver driver) {
		this.driver = driver;
	}
	//click checkout page
	public CheckOutPage clickCheckout() {
		
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		return new CheckOutPage(driver);
	}
	
	//click remove button
	public cartPage clickRemove() {
		driver.findElement(By.id("remove-sauce-labs-backpack")).click();
		return this;
	}
	
	//go back to products page
	public dashPage productPage() {
		driver.navigate().back();
		return new dashPage(driver);
	}
	
}
