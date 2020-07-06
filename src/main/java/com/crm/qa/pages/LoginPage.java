package com.crm.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBaseClass;

public class LoginPage extends TestBaseClass {

	@FindBy(name = "username")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath="//input[@type = 'submit']")
	WebElement loginbtn;


	public LoginPage() {			
		 PageFactory.initElements(driver, this);
	}

	public void linkCheck() {
		List<WebElement>  linkcount = driver.findElements(By.tagName("a"));
		int count = linkcount.size();
		System.out.println(count);
	}

	public void labelCheck() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String sText =  js.executeScript("return document.documentElement.innerText;").toString();
		System.out.println(sText);
	}

	public Homepage loginValidation() {
		username.sendKeys("batchautomation");
		password.sendKeys("Test@12345");
		loginbtn.click();
		return new Homepage();
	}

}
