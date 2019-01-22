package com.erin.easyhrp.page;

import org.openqa.selenium.WebElement;

import com.erin.easyhrp.base.BasePage;
import com.erin.easyhrp.base.DriverBase;

public class loginPage extends BasePage{

	public loginPage(DriverBase driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	/*
	 * 获取账号输入框
	 */
	public WebElement getUserElement() {
		return element(KeyElement("userName"));
	}
	/*
	 * 获取密码输入框
	 */
	public WebElement getPassWordElement() {
		return element(KeyElement("passWord"));
	}
	
	/*
	 * 获取登录按钮
	 */
	public WebElement getLoginBtn() {
		return element(KeyElement("loginBtn"));
	}
	
}
