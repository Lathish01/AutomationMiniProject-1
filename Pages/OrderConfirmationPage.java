package org.Swag.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import SwagLabs.Base.baseClass;

public class OrderConfirmationPage extends baseClass{
	
	
	public OrderConfirmationPage(WebDriver driver) {
		this.driver = driver;
		
	}

	//after clicking finish - get the order confirmation title
	public OrderConfirmationPage finalTitle() {
		
		String expectedTitle = "Thank you for your order!";
		String actTitle = driver.findElement(By.xpath("//h2[@class='complete-header']")).getText();
	//	actTitle.get();
		
		if(expectedTitle.equals(actTitle)) {
			System.out.println(actTitle);
		}else {
			System.out.println("something error");
		}
		
		return this;
	}
	}
	

	
