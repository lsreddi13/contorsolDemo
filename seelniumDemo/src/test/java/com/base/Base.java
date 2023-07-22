package com.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static Properties prop;
	public static WebDriver driver;

	// load the properties file
	public Base() throws IOException {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//config.properties");

		prop = new Properties();
		prop.load(fis);

	}

	// initializing the webdriver
	public static void setUp() {
		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	// wait methods

	// takescreenshots

	// read data from xls files

}
