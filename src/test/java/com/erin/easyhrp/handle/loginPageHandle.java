package com.erin.easyhrp.handle;

import com.erin.easyhrp.base.DriverBase;
import com.erin.easyhrp.page.loginPage;

public class loginPageHandle {
	public DriverBase driverBase;
	public loginPage lp;

	public loginPageHandle(DriverBase driver) {
		// TODO Auto-generated constructor stub
		this.driverBase = driver;
		lp = new loginPage(driver);
	}
	/*
	 * 输入字符串
	 */
	public void sendKeyUser(String userName) {
		 lp.sendKey(lp.getUserElement(), userName);
	}
	/*
	 * 输入密码
	 */
	public void sendPassWord(String passWord) {
		lp.sendKey(lp.getPassWordElement(), passWord);
	}
	/*
	 * 点击登录
	 */
	public void clickLoginBtn() {
		lp.click(lp.getLoginBtn());
	}
	/*
	 * 判断是否是登录页面
	 * 
	 */
	
	public boolean assertLoginPage() {
	 return	lp.assertElementIs(lp.getUserElement());
	}
}
