package com.erin.easyhrp.testcase;

import java.security.PublicKey;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.erin.easyhrp.base.CaseBase;
import com.erin.easyhrp.base.DriverBase;
import com.erin.easyhrp.business.LoginPro;

public class login extends CaseBase{
public DriverBase driver;
public LoginPro loginPro;
static Logger logger = Logger.getLogger(login.class);//log4j引用
@BeforeClass
public void loginTest() {
	this.driver = InitDriver("chrome");
	loginPro = new LoginPro(driver);
}
@Test
public void getLoginHome() {
	driver.get("http://betterme.easyhrp.cn/doct-webManager/bms/");
}

@Test(dependsOnMethods= {"getLoginHome"})
@Parameters({"userName","passWord"})
public void login(String userName,String passWord) {
	logger.debug("登录开始-------------------------");
	loginPro.login(userName, passWord);
}

@AfterClass
public void after() {
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.stop();
}
}
