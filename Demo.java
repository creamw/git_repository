package com.caixm.script;

import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import com.caixm.element.CashPage;
import com.caixm.element.OrderCenter;

import io.appium.java_client.android.AndroidDriver;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(Parameterized.class)
public class PrintTestT1 {
	private AndroidDriver driver = StartAppT1.driver;
	//private AndroidDriver driver;
	private CashPage cashPage = new CashPage();
	private OrderCenter orderCenter = new OrderCenter();
	
	@Parameterized.Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[1000][0]);
    }
	
    /**
               * ����ɶ���
     * @throws InterruptedException 
     * @throws MalformedURLException 
     */
    //@Ignore
	@Test
	public void a_printFinishOrder() throws MalformedURLException, InterruptedException {
		try {
			
			//ѡ���һ����Ʒ
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
			
			
			//ѡ��ڶ�����Ʒ
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
			
			//ѡ���������Ʒ
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
			Thread.sleep(4000);
			driver.findElementById(cashPage.getCash_cashing()).click();
		} catch (Exception e) {
			new StartAppT1().boot();
			new LoginT1().login();
			assert false:"�ű������쳣";
			e.printStackTrace();
		}
	}
	
	/**
	 * ���˵�
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
			Thread.sleep(4000);
			driver.findElementById(cashPage.getCash_credit()).click();
			driver.findElementById(cashPage.getCash_credit_sure()).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			new StartAppT1().boot();
			new LoginT1().login();
			assert false:"�ű������쳣";
			e.printStackTrace();
		}
	}
	
	/**
	 * ���ֻ���
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
			
			WebElement element = driver.findElementById(orderCenter.getRepay());
			Point point = element.getLocation();
			Runtime.getRuntime().exec("adb -s 192.168.1.116:5555 shell input tap 224 720");
			
			//driver.findElementById(orderCenter.getRepay()).click();
			
			System.out.println("�����");
			driver.findElementById(orderCenter.getRepay_home_1()).click();
			driver.findElementById(orderCenter.getRepay_home_cash()).click();
			driver.findElementById(orderCenter.getRepay_home_check()).click();
		} catch (Exception e) {
			new StartAppT1().boot();
			new LoginT1().login();
			assert false:"�ű������쳣";
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

}
