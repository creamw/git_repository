package com.caixm.script_app;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.mobile.AddNetworkConnection;

import com.caixm.elements.mobile.TruckManagePage;

import io.appium.java_client.android.AndroidDriver;

public class TruckManage {
	public static AndroidDriver androidDriver = StartApp.driver;
	
	
	/**
	 * 售罄所有车次
	 */
	@Test
	public void sellALL() {
		
		try {
			while (true) {
				androidDriver.findElement(By.xpath(TruckManagePage.TRUCKMANAGEBUTTON)).click();
				androidDriver.findElement(By.xpath(TruckManagePage.FIRSTTRUCKNO)).click();
				androidDriver.findElement(By.id(TruckManagePage.SELLFINISH)).click();
				androidDriver.findElement(By.id(TruckManagePage.SELLFINISHCONFIRM)).click();
				androidDriver.findElement(By.id(TruckManagePage.SELLFINISHSUCCESS)).click();
			} 
		} catch (Exception e) {
			System.out.println("所有车次售罄完毕");
		}
		
	}
}
