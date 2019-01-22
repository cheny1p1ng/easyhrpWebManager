package com.erin.easyhrp.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
@Parameters("browser")
public class SelectDriver {
public WebDriver selectDriver(String browserName) {
	if(browserName.equals("firefox")) {
		System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir")+"/src/test/resources/files/geckodrive-v0.23.0r.exe");
		return new FirefoxDriver();
	}else if(browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/files/chromedriver.exe");
		return new ChromeDriver();
	}else {
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"/src/test/resources/files/IEDriverServer64.exe");
		return new InternetExplorerDriver();
	}
}
}
