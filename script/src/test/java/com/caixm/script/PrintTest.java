package com.caixm.script;

import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;

import com.caixm.element.CashPage;
import com.caixm.element.OrderCenter;
import com.caixm.script.StartApp.Distribute;

import io.appium.java_client.android.AndroidDriver;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(Parameterized.class)
public class PrintTest{
	private AndroidDriver driver = StartApp.driver;
	//private AndroidDriver driver;
	private CashPage cashPage = new CashPage();
	private OrderCenter orderCenter = new OrderCenter();
	//private int count;
	@Parameterized.Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[1000][0]);
    }
	
    /**
               * 已完成订单
     * @throws InterruptedException 
     * @throws MalformedURLException 
     */
    //@Ignore
	@Test
	public void a_printFinishOrder() throws MalformedURLException, InterruptedException {
		try {
			
			System.out.println(Thread.currentThread().getName()+"___"+StartApp.count);
			StartApp.count++;
			//选择第一个菜品
			driver.findElementByXPath(cashPage.getCash_home()).click();
			driver.findElementByXPath(cashPage.getBatchListNO1_xpath()).click();
			driver.findElementByXPath(cashPage.getVegetableVariety_xpath()).click();
			driver.findElementById(cashPage.getcertainPackingPrice_Piece()).click();
			randomPrice();
			/*driver.findElementByXPath(cashPage.getNo1_xpath()).click();
			driver.findElementByXPath(cashPage.getNo2_xpath()).click();*/
			
			driver.findElementById(cashPage.getCertainPackingPrice_yuanPerKg()).click();
			randomPrice();
			/*driver.findElementByXPath(cashPage.getNo1_xpath()).click();
			driver.findElementByXPath(cashPage.getNo2_xpath()).click();*/
			try {
				driver.findElementById(cashPage.getSure_btn()).click();
			} catch (Exception e) {
				driver.findElementById(cashPage.getPeiceBiggerZero_sure()).click();
				e.printStackTrace();
				a_printFinishOrder();
			}
			
			
			//选择第二个菜品
			driver.findElementByXPath(cashPage.getCash_home()).click();
			driver.findElementByXPath(cashPage.getBatchListNO1_xpath()).click();
			driver.findElementByXPath(cashPage.getVegetableVariety01_xpath()).click();
			driver.findElementById(cashPage.getcertainPackingPrice_Piece()).click();
			randomPrice();
			/*driver.findElementByXPath(cashPage.getNo1_xpath()).click();
			driver.findElementByXPath(cashPage.getNo2_xpath()).click();*/
			
			driver.findElementById(cashPage.getCertainPackingPrice_yuanPerKg()).click();
			randomPrice();
			/*driver.findElementByXPath(cashPage.getNo1_xpath()).click();
			driver.findElementByXPath(cashPage.getNo2_xpath()).click();*/
			try {
				driver.findElementById(cashPage.getSure_btn()).click();
			} catch (Exception e) {
				driver.findElementById(cashPage.getPeiceBiggerZero_sure()).click();
				e.printStackTrace();
				a_printFinishOrder();
			}
			
			//选择第三个菜品
			driver.findElementByXPath(cashPage.getCash_home()).click();
			driver.findElementByXPath(cashPage.getBatchListNO1_xpath()).click();
			driver.findElementByXPath(cashPage.getVegetableVariety02_xpath()).click();
			driver.findElementById(cashPage.getcertainPackingPrice_Piece()).click();
			randomPrice();
			/*driver.findElementByXPath(cashPage.getNo1_xpath()).click();
			driver.findElementByXPath(cashPage.getNo2_xpath()).click();*/
			
			driver.findElementById(cashPage.getCertainPackingPrice_yuanPerKg()).click();
			randomPrice();
			/*driver.findElementByXPath(cashPage.getNo1_xpath()).click();
			driver.findElementByXPath(cashPage.getNo2_xpath()).click();*/
			try {
				driver.findElementById(cashPage.getSure_btn()).click();
			} catch (Exception e) {
				driver.findElementById(cashPage.getPeiceBiggerZero_sure()).click();
				e.printStackTrace();
				a_printFinishOrder();
			}
			
			//
			driver.findElementByXPath(cashPage.getCustomerNo1()).click();
			driver.findElementById(cashPage.getPlaceOrder()).click();
			driver.findElementById(cashPage.getCash_money()).click();
			Thread.sleep(2000);
			driver.findElementById(cashPage.getCash_cashing()).click();
		} catch (Exception e) {
			new StartApp().boot();
			new Login().login();
			assert false:"脚本运行异常";
			e.printStackTrace();
		}
	}
	
	/**
	 * 赊账单
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
    //@Ignore
	@Test
	public void b_printCredit() throws MalformedURLException, InterruptedException {
		try {
			driver.findElementByXPath(cashPage.getCash_home()).click();
			driver.findElementByXPath(cashPage.getBatchListNO1_xpath()).click();
			driver.findElementByXPath(cashPage.getVegetableVariety_xpath()).click();
			driver.findElementById(cashPage.getcertainPackingPrice_Piece()).click();
			randomPrice();
			driver.findElementById(cashPage.getCertainPackingPrice_yuanPerKg()).click();
			randomPrice();
			driver.findElementById(cashPage.getSure_btn()).click();
			/*try {
				
			} catch (Exception e) {
				driver.findElementById(cashPage.getPeiceBiggerZero_sure()).click();
				e.printStackTrace();
				b_printCredit();
			}*/
			
			driver.findElementByXPath(cashPage.getCustomerNo1()).click();
			driver.findElementById(cashPage.getPlaceOrder()).click();
			driver.findElementById(cashPage.getCash_money()).click();
			Thread.sleep(2000);
			driver.findElementById(cashPage.getCash_credit()).click();
			driver.findElementById(cashPage.getCash_credit_sure()).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			new StartApp().boot();
			new Login().login();
			assert false:"脚本运行异常";
			e.printStackTrace();
		}
	}
	
	/**
	 * 部分还款
	 * @throws InterruptedException 
	 * @throws MalformedURLException 
	 */
	@Test
	public void c_repayment() throws MalformedURLException, InterruptedException {
		try {
			driver.findElementByXPath(orderCenter.getOrderCenter()).click();
			driver.findElementById(orderCenter.getCredit()).click();
			driver.findElementById(orderCenter.getAllCredit()).click();
			driver.findElementByXPath(orderCenter.getAllCreditNo1()).click();
			driver.findElementById(orderCenter.getRepay()).click();
			driver.findElementById(orderCenter.getRepay_home_1()).click();
			driver.findElementById(orderCenter.getRepay_home_cash()).click();
			driver.findElementById(orderCenter.getRepay_home_check()).click();
		} catch (Exception e) {
			new StartApp().boot();
			new Login().login();
			assert false:"脚本运行异常";
			e.printStackTrace();
		}
	}
	
	public void randomPrice() {
		String[] str_array = new String[]{cashPage.getNo0_xpath(),cashPage.getNo1_xpath(),
				cashPage.getNo2_xpath(),cashPage.getNo3_xpath(),cashPage.getNo4_xpath(),cashPage.getNo5_xpath(),
				cashPage.getNo6_xpath(),cashPage.getNo7_xpath(),cashPage.getNo8_xpath(),cashPage.getNo9_xpath(),cashPage.getNoDot_xpath()};
		int i = 0;
		while(i<1) {
			driver.findElementByXPath(str_array[new Random().nextInt(9)+1]).click();
			i++;
		}	
	}
	
	//@Test
	/*public void randomN() throws InterruptedException {
		while(true) {
			Thread.sleep(500);
			System.out.println(new Random().nextInt(10));
		}	
	}*/
	
	//@Test
	public void exception1() {
		try {
			
			System.out.println(1/0);
		} catch (Exception e) {
			return;
			
		}
	}

	
	/**
	 * 实现多driver接口，初始化单个driver，执行此类的测试方法前必须先初始化此方法
	 */
	/*public void printDistribute(StartApp startApp) {
		try {
			this.driver =startApp.getDriver();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}*/
}
