package com.erin.easyhrp.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.erin.easyhrp.util.ProUtil;

public class BasePage {
	public DriverBase driverBase;
	public BasePage(DriverBase driver) {
		this.driverBase = driver;
	}
	
	/*
	 * 定位element
	 */
	public WebElement element(By by) {
		WebElement element= driverBase.zhaodaoys(by);
		return element;
	}
	/*
	 * 根据元素
	 */
	public By KeyElement(String elementName) {
		ProUtil proUtil = new ProUtil("element.properties");
		String keyResult = proUtil.getElementKey(elementName);
		String keyType = keyResult.split(">")[0];
		String keyValue = keyResult.split(">")[1];
		if(keyType.equals("id")) {
			return By.id(keyValue);
		}else if(keyType.equals("name")) {
			return By.name(keyValue);
		}else if(keyType.equals("className")) {
			return By.name(keyValue);
		}else if(keyType.equals("tagName")) {
			return By.tagName(keyValue);
		}else if(keyType.equals("linkText")) {
			return By.linkText(keyValue);
		}else {
			return By.xpath(keyValue);
		}
	}
	
	/*
	 * 封装输入
	 */
	public void sendKey(WebElement element,String value) {
		if(element!=null) {
			element.sendKeys(value);
		}else {
			System.out.println(element+"元素没有定位到，输入失败"+value);
		}
	}
	/*
	 * 封装点击
	 */
	public void click(WebElement element) {
		if(element!=null) {
			element.click();
		}else {
			System.out.println("元素没有定位到，点击失败");
		}
	}
	/**
	 * 判断元素是否显示
	 */
	
	public boolean assertElementIs(WebElement element) {
		return element.isDisplayed();
	}
}
