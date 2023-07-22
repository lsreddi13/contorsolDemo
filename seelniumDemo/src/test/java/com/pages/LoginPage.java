package com.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;

import com.base.Base;

public class LoginPage extends Base{
	
	//WebElememnts
		WebElement userName = driver.findElement(By.name("username"));
		WebElement pwd = driver.findElement(By.name("password"));
		WebElement loginBtn = driver.findElement(RelativeLocator.with(By.tagName("button")).below(pwd));

		//vegaintellisoft.com - rasmi
		
//		anupama muraleedara - ust-global
		
		
	public LoginPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	//craete methods
	public void enterUserName(String name) {
		userName.sendKeys(name);
	}
	
	public void enterPassword(String pawd) {
		pwd.sendKeys(pawd);
	}
	
	public void clickLogin() {
		loginBtn.click();
	}

}
