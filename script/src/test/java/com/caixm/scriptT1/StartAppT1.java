package com.caixm.scriptT1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class StartAppT1 {
	static AndroidDriver  driver;
	public static int count;
	@Test
	public void boot() throws MalformedURLException, InterruptedException{
       DesiredCapabilities capabilities = new DesiredCapabilities();  
       capabilities.setCapability("udid", "192.168.1.116:5555");
       capabilities.setCapability("deviceName","nubia Z11"); 
     //capabilities.setCapability("deviceName", "test_device");
     //capabilities.setCapability("deviceName", "test_device");
       capabilities.setCapability("automationName","Appium");  
       capabilities.setCapability("platformName","Android");  
       capabilities.setCapability("platformVersion","6.0.1"); 
       
       
       capabilities.setCapability("appPackage", "com.zhiyi.cxm.caixm_dev");  
       capabilities.setCapability("appActivity", "com.zhiyi.cxm.caixm.LoadingADActivity");  
       capabilities.setCapability("sessionOverride", true);
       capabilities.setCapability("unicodeKeyboard", true);
       capabilities.setCapability("resetKeyboard", false);
       driver = new AndroidDriver(new URL("http://127.0.0.1:47231/wd/hub"), capabilities);  
       //driver = new AndroidDriver(new URL("http://127.0.0.1:4724/wd/hub"), capabilities);
       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);  
       Thread.sleep(5000);   
       
	}
}
