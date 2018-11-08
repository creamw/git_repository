package com.caixm;


import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Screen;






public class Demo {
	@Test
	public void getWeb() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://dev.api.caixm.cn/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#username")).sendKeys("15666666666");
		driver.findElement(By.cssSelector("#password")).sendKeys("123456");
		driver.findElement(By.cssSelector(
				"#root > div > div.content___1xAM2 > div.main___3vXQQ > div > form > div:nth-child(3) > div > div > span > button"))
				.click();
		
	}
	
	@Test
	public void sikuliDemo() throws IOException, FindFailed {
		Screen s = new Screen();


		
		ImagePath.add("res\\weixin.png");
		s.click("res\\weixin.png");
		
		//ImagePath.add("res\\chrome.jpg");
		s.click("res\\\\chrome.jpg");
		
		
	}
}
