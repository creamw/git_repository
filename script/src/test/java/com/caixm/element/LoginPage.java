package com.caixm.element;

public class LoginPage {
	private String passWord;
	private String userName;
	private String login;
	private String allow;
	private String allow2;
	
	public String getAllow() {
		allow = "com.android.packageinstaller:id/permission_allow_button";
		return allow;
	}
	public void setAllow(String allow) {
		this.allow = allow;
	}
	public String getAllow2() {
		return allow2;
	}
	public void setAllow2(String allow2) {
		this.allow2 = allow2;
	}
	
	
	public String getLogin() {
		login = "com.zhiyi.cxm.caixm_dev:id/login_btn";
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getUserName() {
		userName = "com.zhiyi.cxm.caixm_dev:id/login_username";
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		passWord = "com.zhiyi.cxm.caixm_dev:id/login_password";
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
}
