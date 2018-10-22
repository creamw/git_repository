package com.caixm.element;

public class OrderCenter {
	private String orderCenter;
	private String allCredit;
	private String allCreditNo1;
	private String repay;
	private String repay_home_1;
	private String repay_home_check;
	private String repay_home_cash;
	private String credit;
	
	public String getCredit() {
		credit = "com.zhiyi.cxm.caixm_dev:id/order_status_credit_history_tv";
		return credit;
	}

	public void setCredit(String credit) {
		this.credit = credit;
	}

	public String getRepay_home_cash() {
		repay_home_cash = "com.zhiyi.cxm.caixm_dev:id/repay_home_cash";
		return repay_home_cash;
	}

	public void setRepay_home_cash(String repay_home_cash) {
		this.repay_home_cash = repay_home_cash;
	}

	public String getRepay_home_check() {
		repay_home_check = "com.zhiyi.cxm.caixm_dev:id/repay_home_check";
		return repay_home_check;
	}

	public void setRepay_home_check(String repay_home_check) {
		this.repay_home_check = repay_home_check;
	}

	public String getRepay_home_1() {
		repay_home_1 = "com.zhiyi.cxm.caixm_dev:id/repay_home_1";
		return repay_home_1;
	}

	public void setRepay_home_1(String repay_home_1) {
		this.repay_home_1 = repay_home_1;
	}

	public String getRepay() {
		repay = "com.zhiyi.cxm.caixm_dev:id/btn_bill_repay";
		return repay;
	}

	public void setRepay(String repay) {
		this.repay = repay;
	}

	public String getAllCreditNo1() {
		allCreditNo1 = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[2]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout[1]";
		return allCreditNo1;
	}

	public void setAllCreditNo1(String allCreditNo1) {
		this.allCreditNo1 = allCreditNo1;
	}

	public String getAllCredit() {
		allCredit = "com.zhiyi.cxm.caixm_dev:id/btn_credit_by_stall";
		return allCredit;
	}

	public void setAllCredit(String allCredit) {
		this.allCredit = allCredit;
	}

	public String getOrderCenter() {
		orderCenter = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.LinearLayout[2]";
		return orderCenter;
	}

	public void setOrderCenter(String orderCenter) {
		this.orderCenter = orderCenter;
	}
}
