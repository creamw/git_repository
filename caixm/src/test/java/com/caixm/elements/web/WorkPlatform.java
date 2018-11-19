package com.caixm.elements.web;

public class WorkPlatform {

	
	/**我的工作台*/
	public static class MyWorkPlatform{
		/**档口今日收益*/
		public static final String STALLPROFIT = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[2]/div/div[1]/div[1]/div/div";
		/**开票费*/
		public static final String BILLCOST = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div/table/tbody/tr/td[1]/span[2]";
		/**力资费*/
		public static final String STALLFEE = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div/table/tbody/tr/td[2]/span/span";
		/**灌包费*/
		public static final String PACKAGEFEE = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div/table/tbody/tr/td[3]/span/span";
		/**货款零差收益*/
		public static final String GOODSZDPROFIT = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div/table/tbody/tr/td[4]/span/span";
		/**力资零差收益*/
		public static final String STALLZDPROFIT = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div/table/tbody/tr/td[5]/span/span";
		/**灌包零差收益*/
		public static final String PACKAGEZDPROFIT = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div/div/div/div/div/div/div/table/tbody/tr/td[6]/span/span";
		/**档口n月累计收益*/
		public static final String STALLACCUMLATIVE = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[2]/div/div[2]/div[1]/div/div";
		/**档口今日销售货款*/
		public static final String STALLTODAYTRUCKFEE = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[2]/div/div[3]/div[2]/div/div[1]/span/span";
		/**历史赊欠*/
		public static final String HISTORYOWE = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[2]/div/div[4]/div[2]/div/div[1]/span/span";
		/**今日历史还款*/
		public static final String TODAYHISTORYREPAY = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[2]/div/div[4]/div[2]/div/div[2]/span/span";
		/**在售车次*/
		public static final String SELLINGTRUCK = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[2]/div/div[5]/div[2]/div/div/span";
		/**销售额趋势*/
		public static final String SELLTREND = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[6]/div/div/div/div/div/div/div";
		
	}
	
	public static class BlanceTable{
		
	}
}
