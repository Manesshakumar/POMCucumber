package com.crm.qa.pages;

import com.crm.qa.base.TestBaseClass;

public class Homepage extends TestBaseClass{
	
	public String pageTitle() {
		String title = driver.getTitle();
		return title;
	}

}
