package com.bangladesh.PageAction;

import org.testng.Assert;

import com.bangladesh.PageLacoter.HomePageLocator;
import com.bangladesh.Util.TestBase_BD;
import com.bangladesh.Util.TestDataBD;

public class HomePageAction extends TestBase_BD  {
	
	HomePageLocator homePageLocator = new HomePageLocator();
	
 public void EnterXPSinSearchFiled() {
	 homePageLocator.Searchfield.sendKeys(TestDataBD.laptop);
	 
 }
 public void ClickonSearchLink() {
	 homePageLocator.SearchLink.click(); 
 }
 public void Verifysearchresultdisplay() {
	 boolean searchresult= homePageLocator.VerifySearchResult.isDisplayed(); 
	 Assert.assertTrue(searchresult);
 }
 public void Clicksigninbutton() {
	 
	// homePageLocator.Signinbutton.click();
	 homePageLocator.signinbutton.click();
 }
public void Clicksugninlink() {
	homePageLocator.Signinlink.click();	
}
}
