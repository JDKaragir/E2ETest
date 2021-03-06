package com.crm.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase{
	
	LoginPage loginPage;
	TestUtil testUtil;
	ContactsPage contactsPage;
	HomePage homePage;
	
	public HomePageTest(){
		
		super();
	}
	
	@BeforeMethod()
	public void setUp(){
		
		initialization();
		testUtil=new TestUtil();
		contactsPage= new ContactsPage();
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));		
	}
	
	@Test
	public void verifyContactLink(){
		
		testUtil.switchToFrame();
		contactsPage=homePage.clickiOnContactsLink();
	}

}
