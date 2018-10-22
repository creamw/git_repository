package com.caixm.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class DistributedExcutor {
	private AndroidDriver driver;
	private static ThreadPoolExecutor executPool;

	public static void getThreadPool() {
		executPool = new ThreadPoolExecutor(50, 200, 60, TimeUnit.SECONDS, 
										new ArrayBlockingQueue<Runnable>(5000),	
										new ThreadFactory(){ 
											public Thread newThread(Runnable r) {
											return new Thread(r, "t_pl_pool_" + r.hashCode());
											}
										},  
										new ThreadPoolExecutor.DiscardOldestPolicy());

	}
	
	@Test
	public void boot() throws MalformedURLException, InterruptedException {
		/*AppiumDriverLocalService build = new AppiumServiceBuilder().usingPort(4723).build();
		build.start();*/
		AndroidDriver driver;
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		//capabilities.setCapability("udid", "f67b245");
		capabilities.setCapability("udid", "192.168.1.100:5555");
		capabilities.setCapability("deviceName", "T1mini");
		// capabilities.setCapability("deviceName", "test_device");
		// capabilities.setCapability("deviceName", "test_device");
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "6.0.1");

		capabilities.setCapability("appPackage", "com.tencent.mm");
		capabilities.setCapability("appActivity", "com.tencent.mm.ui.LauncherUI");
		capabilities.setCapability("sessionOverride", true); // ÿ������ʱ����session������ڶ��κ����лᱨ�����½�session
		capabilities.setCapability("unicodeKeyboard", true); // ���ü���
		capabilities.setCapability("resetKeyboard", false); // ����Ĭ�ϼ���Ϊappium�ļ���
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		// driver.findElementById("com.tencent.mm:id/dbe").click();
		// driver.findElementByName("登录").click();
		// String login = "//android.widget.FrameLayout[1]/android.widget.Button[1]";
		String allow1_id = "com.android.packageinstaller:id/permission_allow_button";
		String allow2_xpath = "//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.Button[2]";
		String login = "com.tencent.mm:id/d75";
		String login_xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.Button[1]";
		driver.findElementById(allow1_id).click();
		driver.findElementByXPath(allow2_xpath).click();
		// driver.findElementByXPath(login_xpath).click();
		driver.findElementById(login).click();

		

	}
	
	@Test
	public void initDriver() throws InterruptedException, MalformedURLException {
		AndroidDriver driver;
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability("udid", "192.168.1.116:5555");
		capabilities.setCapability("deviceName", "nubia Z11");
		// capabilities.setCapability("deviceName", "test_device");
		// capabilities.setCapability("deviceName", "test_device");
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "6.0.1");

		capabilities.setCapability("appPackage", "com.tencent.mm");
		capabilities.setCapability("appActivity", "com.tencent.mm.ui.LauncherUI");
		capabilities.setCapability("sessionOverride", true); // ÿ������ʱ����session������ڶ��κ����лᱨ�����½�session
		capabilities.setCapability("unicodeKeyboard", true); // ���ü���
		capabilities.setCapability("resetKeyboard", false); // ����Ĭ�ϼ���Ϊappium�ļ���
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		// driver.findElementById("com.tencent.mm:id/dbe").click();
		// driver.findElementByName("登录").click();
		// String login = "//android.widget.FrameLayout[1]/android.widget.Button[1]";
		String allow1_id = "com.android.packageinstaller:id/permission_allow_button";
		String allow2_xpath = "//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.Button[2]";
		String login = "com.tencent.mm:id/d75";
		String login_xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.Button[1]";
		driver.findElementById(allow1_id).click();
		driver.findElementByXPath(allow2_xpath).click();
		// driver.findElementByXPath(login_xpath).click();
		driver.findElementById(login).click();
	}

	@Test
	public void runDriver() throws InterruptedException {
		
		new Thread(new Runnable() {
			
			public void run() {
				
				try {
					boot();
				} catch (MalformedURLException e) {
					
					e.printStackTrace();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		}).start();
		
		new Thread(new Runnable() {
			
			public void run() {
				
				try {
					initDriver();
				} catch (MalformedURLException e) {
					
					e.printStackTrace();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		}).start();
		
		CountDownLatch countDownLatch = new CountDownLatch(4);
		countDownLatch.await();
	}
	
	public void setUp() throws IOException {
		Runtime runtime = Runtime.getRuntime();

		Process exec = runtime.exec("adb");
		// InputStream inputStream = exec.getInputStream();
		final InputStream inputStream = exec.getErrorStream();
		new Thread(new Runnable() {

			public void run() {
				
				InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
				BufferedReader bf = new BufferedReader(inputStreamReader);
				// BufferedReader bf = new BufferedReader(new InputStreamReader(inputStream));
				String str = null;
				try {
					System.out.println(123);
					while ((str = bf.readLine()) != null) {
						System.out.println(str);
					}
				} catch (IOException e2) {
					
					e2.printStackTrace();
				}
				try {
					System.out.println(456);
					inputStreamReader.close();
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
				try {
					bf.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
		}).start();

		/*
		 * System.out.println(bf.readLine()); System.out.println(bf.readLine());
		 * System.out.println(bf.readLine()); System.out.println(bf.readLine());
		 * System.out.println(bf.readLine());
		 */
		// String str = bf.readLine();
		// String str2 = bf.readLine();
		// System.out.println(str2);
		// int a;
		// System.out.println(a =1);
		// inputStream.close();
		// bf.close();

	}
	
	@Test
	public void excute()throws InterruptedException {
		
		getThreadPool();
		executPool.execute(new Runnable() {
			
			public void run() {
				Thread.currentThread().setName("T");
				JUnitCore.runClasses(TestExcutor.class);
			}
		});
		
		/*executPool.execute(new Runnable() {
			
			public void run() {
				Thread.currentThread().setName("T1");
				JUnitCore.runClasses(TestExcutorT1.class);
			}
		});*/
		
		executPool.execute(new Runnable() {
			
			public void run() {
				Thread.currentThread().setName("T2");
				JUnitCore.runClasses(TestExcutorT2.class);
			}
		});
		CountDownLatch countDownLatch = new CountDownLatch(4);
		countDownLatch.await();
		/*JUnitCore.runClasses(StartApp.class);
		new Thread(new Runnable() {
			
			public void run() {
				JUnitCore.runClasses(TestExcutor.class);
				
			}
		}).start();
		
		new Thread(new Runnable() {
			
			public void run() {
				JUnitCore.runClasses(TestExcutorT1.class);
				
			}
		}).start();*/
		
	}

}
