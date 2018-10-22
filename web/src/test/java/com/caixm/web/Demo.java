package com.caixm.web;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	private ThreadPoolExecutor executPool;

	public void getThreadPool() {
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
	public void getWeb() {
		String chromedriver = "C:\\Users\\Administrator\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromedriver);

		//WebDriver driver = new FirefoxDriver();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.baidu.com");
		//driver.findElementsByCssSelector(By.id("kw")));
		driver.findElement(By.id("kw")).sendKeys("吹牛比");
		driver.findElement(By.id("su")).click();
	}
	
	@Test
	public void getCaixm() {
		String chromedriver = "C:\\Users\\Administrator\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromedriver);

		//WebDriver driver = new FirefoxDriver();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://dev.api.caixm.cn");
		
		driver.findElement(By.id("username")).sendKeys("15927219809");
		driver.findElement(By.id("password")).sendKeys("123456");
		//"ant-btn submit___3bWpy ant-btn-primary ant-btn-lg"
		driver.findElement(By.className("ant-btn-lg")).click();
	}
}
