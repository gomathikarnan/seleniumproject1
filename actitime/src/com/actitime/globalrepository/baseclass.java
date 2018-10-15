package com.actitime.globalrepository;

import java.io.IOException;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class baseclass {
	WebDriver driver;
	Commonproperty c=new Commonproperty();
	@BeforeSuite
	public void connecttodatabase() throws SQLException {
		//Driver d=new Driver();
		//DriverManager.registerDriver(d);
		//DriverManager.getConnection("url", "user", "password");
		System.out.println("connect to database and check for the update");
	}
@BeforeClass
public void launchbrowser() throws IOException {
	System.setProperty("webdriver.gecko.driver", "F:\\Softwares\\photon program\\actitime\\RESOURCES\\geckodriver.exe");
	driver=new FirefoxDriver();
}
@BeforeMethod
public void login() throws IOException {
	driver.get(c.commonproperty("url"));
}
}
