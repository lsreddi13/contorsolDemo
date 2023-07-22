package com.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.Base;

public class DashboardPage extends Base{

	public DashboardPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	WebElement adminTab = driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[1]/a"));
	
	
	public void clickAdmin() {
		adminTab.click();
	}
}
