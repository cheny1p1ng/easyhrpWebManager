package com.erin.easyhrp.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.erin.easyhrp.util.SelectDriver;

public class DriverBase {
	public WebDriver driver;

	public DriverBase(String driver) {
		SelectDriver selectDriver = new SelectDriver();
		this.driver = selectDriver.selectDriver(driver);
	}
	/*
	 * 获取driver
	 */
	
	public WebDriver getDriver() {
		return driver;
	}
	/*
	 * 封装element方法
	 */
	public WebElement zhaodaoys(By by) {
		WebElement element = driver.findElement(by);
		return element;
	}
	/**
	 *  geturl封装
	 */
	public void get(String url) {
		driver.get(url);
	}
	public void stop() {
		System.out.println("stop webDriver");
		driver.close();
	}
	
}
