package com.caixm.scriptT2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class StartAppT2 {
	static AndroidDriver  driver;
	public static int count;
	//static ExecutorService executorService = new ThreadPoolExecutor(0, Integer.MAX_VALUE,60L, TimeUnit.SECONDS,new SynchronousQueue<Runnable>());
	//维护driver的参数，udid及appiumServer端口号
	static String[][] str_array = new String[][] {};
	public int i =0;
	
	//@Test
	public void startThread() {
		
	}
	
	@Test
	public void boot() throws MalformedURLException, InterruptedException{
       DesiredCapabilities capabilities = new DesiredCapabilities();  
       capabilities.setCapability("udid", "192.168.1.130:5555");
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
       driver = new AndroidDriver(new URL("http://127.0.0.1:47232/wd/hub"), capabilities);  
       //driver = new AndroidDriver(new URL("http://127.0.0.1:4724/wd/hub"), capabilities);
       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);  
       Thread.sleep(5000);   
       
	}
	
	/**
	 * 参数化 创建driver对象
	 * @return
	 * @throws InterruptedException
	 * @throws MalformedURLException
	 */
	public AndroidDriver getDriver(String udid,String port) throws InterruptedException, MalformedURLException {
		AndroidDriver driver = null;
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("udid", udid);
		capabilities.setCapability("deviceName", "nubia Z11");
		// capabilities.setCapability("deviceName", "test_device");
		// capabilities.setCapability("deviceName", "test_device");
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "6.0.1");

		capabilities.setCapability("appPackage", "com.zhiyi.cxm.caixm_dev");
		capabilities.setCapability("appActivity", "com.zhiyi.cxm.caixm.LoadingADActivity");
		capabilities.setCapability("sessionOverride", true);
		capabilities.setCapability("unicodeKeyboard", true);
		capabilities.setCapability("resetKeyboard", false);
		driver = new AndroidDriver(new URL("http://127.0.0.1:"+port+"/wd/hub"), capabilities);
		// driver = new AndroidDriver(new URL("http://127.0.0.1:4724/wd/hub"),
		// capabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		return driver;
	}
	
	public void getInterface(Distribute distribute) {
		distribute.printDistribute();
	}
	/*public void newCachedThreadPool(ExecutorService executorService) {
		
	}*/
	
	public interface Distribute{
		
		public void printDistribute(StartAppT2  startApp);
		public void printDistribute();
		
	}
}
