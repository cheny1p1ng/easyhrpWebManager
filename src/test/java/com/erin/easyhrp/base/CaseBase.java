package com.erin.easyhrp.base;

public class CaseBase {
	public DriverBase InitDriver(String browser) {
		return new DriverBase(browser);
	}
}
