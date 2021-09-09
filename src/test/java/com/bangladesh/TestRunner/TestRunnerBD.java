package com.bangladesh.TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.bangladesh.Util.TestBase_BD;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/Feature"} , 
plugin = {"json:target/cucumber.json"},
glue = "StepDefBD",tags= {"@test"})




public class TestRunnerBD extends AbstractTestNGCucumberTests {
	
	
	@BeforeTest
	public void LaunchApplicationURL() {
		TestBase_BD lunch= new TestBase_BD();
		lunch.initz();
		
		
	}
	
	@AfterTest
	public void CloseApplicationURL() {
		TestBase_BD lunch = new TestBase_BD();	
		lunch.driver.quit();
		
	}
	

}


