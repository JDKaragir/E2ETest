package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	public LoginPage(){
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="username")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	
	public HomePage login(String uName, String pwd)
	{
		userName.sendKeys(uName);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new HomePage();	
	}

}
