package com.caixm.script;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.caixm.element.LoginPage;

import io.appium.java_client.android.AndroidDriver;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Login {
	private LoginPage loginPage = new LoginPage();
	private AndroidDriver driver = StartApp.driver;
	
	@Test
	public void login() throws InterruptedException {
		driver.findElementById(loginPage.getUserName()).sendKeys("15927445425");
		driver.findElementById(loginPage.getPassWord()).sendKeys("a123456");
		driver.findElementById(loginPage.getLogin()).click();
		driver.findElementById(loginPage.getAllow()).click();
	}
	
	//@Test
	public void login2() throws InterruptedException {
		driver.findElementById(loginPage.getUserName()).sendKeys("13995585951");
		driver.findElementById(loginPage.getPassWord()).sendKeys("123456");
		driver.findElementById(loginPage.getLogin()).click();
		driver.findElementById(loginPage.getAllow()).click();
	}
}
