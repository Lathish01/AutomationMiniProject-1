package org.Swag.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import SwagLabs.Base.baseClass;

public class dashPage extends baseClass {
	
	public dashPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//add the product to cart page
	public dashPage addtoCart() {
		driver.findElement(By.xpath("//button[contains(@id,'onesie')]")).click();
		return this;
		}
	
	
	//after adding the product move to cart page
	public cartPage cartPag() {
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		return new cartPage(driver);
	}
}
