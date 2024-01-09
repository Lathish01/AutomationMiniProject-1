package org.Swag.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import SwagLabs.Base.baseClass;

public class CheckOutOverview extends baseClass {
	
	
	public CheckOutOverview(WebDriver driver) {
		this.driver = driver;
	}
	
	//click finish to confirm the order
	public CheckOutOverview clickFinish() {
		driver.findElement(By.xpath("//button[contains(@class,'cart_button')]")).click();
		return this;
		
	}

	//click cancel and back to cart page 
	public cartPage clickCancel() {
		driver.findElement(By.xpath("//button[contains(@class,'cancel_link')]")).click();
		return new cartPage(driver);
	}
}
