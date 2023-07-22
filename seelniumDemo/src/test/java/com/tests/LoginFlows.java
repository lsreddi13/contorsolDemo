package com.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.base.Base;
import com.pages.DashboardPage;
import com.pages.LoginPage;

public class LoginFlows extends Base{

	
	

	public LoginFlows() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void login() throws IOException, InterruptedException {
		
		String username = prop.getProperty("username");
		String loginpwd = prop.getProperty("password");
		
		setUp();
		System.out.println(prop.getProperty("url"));
		
		driver.get(prop.getProperty("url"));
		
		Thread.sleep(3000);
		
		LoginPage lp = new LoginPage();
		//enter the user name
		lp.enterUserName(username);
		lp.enterPassword(loginpwd);
		lp.clickLogin();
		Thread.sleep(3000);
		DashboardPage dp = new DashboardPage();
		dp.clickAdmin();
		
		//enter pasword
		
		
		
		//click login
		
		
		
	}
	
	
}
