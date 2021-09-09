package StepDefBD;

import com.bangladesh.PageAction.HomePageAction;
import com.bangladesh.PageLacoter.HomePageLocator;
import com.bangladesh.Util.TestBase_BD;
import com.bangladesh.Util.utilll;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefHomePage extends TestBase_BD {
	
	
	HomePageAction homePageAction = new HomePageAction();
		

	
	@Given("^Open Application \"([^\"]*)\"$")
	public void open_Application(String URL) throws Throwable {
	launchApplication(URL); 
	
	}

	@Then("^Enter XPS in SearchFiled$")
	public void enter_XPS_in_SearchFiled() throws Throwable {
		homePageAction.EnterXPSinSearchFiled();	
	}

	@Then("^Click on SearchLink$")
	public void click_on_SearchLink() throws Throwable {
		homePageAction.ClickonSearchLink();
	}

	@Then("^Verify search result display$")
	public void verify_search_result_display() throws Throwable {
		homePageAction.Verifysearchresultdisplay(); 
	}



}
