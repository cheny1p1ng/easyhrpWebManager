package com.erin.easyhrp.business;

import com.erin.easyhrp.base.DriverBase;
import com.erin.easyhrp.handle.loginPageHandle;

public class LoginPro {
	public loginPageHandle lph;
	public LoginPro(DriverBase driver) {
		lph = new loginPageHandle(driver);
	}
	public void login(String userName,String passWord) {
		if(lph.assertLoginPage()) {
			lph.sendKeyUser(userName);
			lph.sendPassWord(passWord);
			lph.clickLoginBtn();
		}else {
			System.out.println("登录页面不存在或者状态不正确");
		}
	}
}
