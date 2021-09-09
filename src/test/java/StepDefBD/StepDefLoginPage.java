package StepDefBD;

import com.bangladesh.PageAction.HomePageAction;
import com.bangladesh.PageAction.LoginPageAction;
import com.bangladesh.Util.TestBase_BD;

import cucumber.api.java.en.Then;

public class StepDefLoginPage extends TestBase_BD {
	
	HomePageAction homePageAction = new HomePageAction();
	LoginPageAction loginPageAction = new LoginPageAction();
	@Then("^Click signinbutton$")
	public void Click_signinbutton() throws Throwable {
		homePageAction.Clicksigninbutton();   
	}

	@Then("^Click sugninlinkk$")
	public void Click_signinlink() throws Throwable {
		homePageAction.Clicksugninlink();
	}

	@Then("^Enter user pass and Click signin$")
	public void Enter_user_pass_and_Click_signin() throws Throwable {
		loginPageAction.uercard(prop.getProperty("mrxuser"),prop.getProperty("mrxpass"));
	}

	

	@Then("^Verify user can login$")
	public void verify_user_can_login() throws Throwable {
		loginPageAction.Verifyusercanlogin();	   
	}


}
