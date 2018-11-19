package com.caixm.script_web;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.caixm.elements.web.WorkPlatform;
import com.caixm.utils.Driver;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WorkPlatformCase {
	ChromeDriver chromeDriver = Driver.chromeDriver;
	
	/**
	 * 检查档口当日收益，数据是否同步（单菜品，单收银员）
	 * @throws InterruptedException
	 */
	@Test
	public void checkStallProfit() throws InterruptedException {
		
		//档口今日收益数据
		String l = chromeDriver.findElement(By.xpath(WorkPlatform.MyWorkPlatform.STALLPROFIT)).getText();
		String l1 = l.substring(8,l.length());
		System.out.println("档口今日收益："+l1);
		//开票费
		String l2 = chromeDriver.findElement(By.xpath(WorkPlatform.MyWorkPlatform.BILLCOST)).getText();
		System.out.println("开票费："+l2);
		//力资费
		String l3 = chromeDriver.findElement(By.xpath(WorkPlatform.MyWorkPlatform.STALLFEE)).getText();
		System.out.println("力资费："+l3);
		//灌包费
		String l4 = chromeDriver.findElement(By.xpath(WorkPlatform.MyWorkPlatform.PACKAGEFEE)).getText();
		System.out.println("灌包费："+l4);
		//货款零差收益
		String l5 = chromeDriver.findElement(By.xpath(WorkPlatform.MyWorkPlatform.GOODSZDPROFIT)).getText();
		System.out.println("货款零差收益："+l5);
		//力资零差收益
		//String l6 = chromeDriver.findElement(By.xpath(WorkPlatform.MyWorkPlatform.STALLZDPROFIT)).getText();
		//System.out.println("力资零差收益："+l6);
		//灌包零差收益
		//String l7 = chromeDriver.findElement(By.xpath(WorkPlatform.MyWorkPlatform.PACKAGEZDPROFIT)).getText();
		//System.out.println("灌包零差收益："+l7);
		//档口n月累计收益
		String l8 = chromeDriver.findElement(By.xpath(WorkPlatform.MyWorkPlatform.STALLACCUMLATIVE)).getText().split(":")[1].trim();
		System.out.println("档口n月累计收益："+l8);
		//历史赊欠
		String l9 = chromeDriver.findElement(By.xpath(WorkPlatform.MyWorkPlatform.HISTORYOWE)).getText();
		System.out.println("历史赊欠："+l9);
		//档口今日销售货款
		String l10 = chromeDriver.findElement(By.xpath(WorkPlatform.MyWorkPlatform.STALLTODAYTRUCKFEE)).getText();
		System.out.println("档口今日销售货款："+l10);
		//今日历史还款
		String l11 = chromeDriver.findElement(By.xpath(WorkPlatform.MyWorkPlatform.TODAYHISTORYREPAY)).getText();
		System.err.println("今日历史还款："+l11);
		//在售车次
		String l12 = chromeDriver.findElement(By.xpath(WorkPlatform.MyWorkPlatform.SELLINGTRUCK)).getText();
		System.err.println("在售车次："+l12);
		//销售额趋势
		//String l13 = chromeDriver.findElement(By.xpath(WorkPlatform.MyWorkPlatform.SELLTREND)).getText();
		//System.out.println("销售额趋势："+l13);
		chromeDriver.quit();
	}
}
