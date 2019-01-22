package com.erin.easyhrp.util;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.omg.CORBA.portable.InputStream;

public class ProUtil {
public Properties properties;
public String filePath;
public ProUtil(String filePath) {
	this.filePath = filePath;
	this.properties = readProperties();
}
/*
 * 读取配置文件
 */
public Properties readProperties() {
	Properties properties = new Properties();
	try {
		FileInputStream inputStream = new FileInputStream(filePath);
		BufferedInputStream in = new BufferedInputStream(inputStream);
		properties.load(in);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return properties;
}
public String getElementKey(String Key) {
	if(properties.containsKey(Key)) {
		String elementKey = properties.getProperty(Key);
		return elementKey;
	}else {
		System.out.println("定位的key值不存在:"+Key);
		return "";
	}
}
}
