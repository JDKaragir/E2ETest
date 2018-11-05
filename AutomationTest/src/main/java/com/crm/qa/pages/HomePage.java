package com.crm.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{
	
	public HomePage(){
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[text()='Contacts']")
	WebElement contactsLink;
	
	@FindBy(xpath="//select[@name='cs_status']")
	List <WebElement> StatusDrop;
	
	
	public ContactsPage clickiOnContactsLink(){
		
		contactsLink.click();
		
		return new ContactsPage();
		
	}
	
	
}


