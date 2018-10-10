package com.caixm.scriptT1;

import org.junit.Test;

import com.caixm.element.LoginPage;

import io.appium.java_client.android.AndroidDriver;

public class LoginT1 {
	private LoginPage loginPage = new LoginPage();
	private AndroidDriver driver = StartAppT1.driver;
	
	@Test
	public void login() throws InterruptedException {
		driver.findElementById(loginPage.getUserName()).sendKeys("13995585951");
		driver.findElementById(loginPage.getPassWord()).sendKeys("123456");
		driver.findElementById(loginPage.getLogin()).click();
		//driver.findElementById(loginPage.getAllow()).click();
	}
}
