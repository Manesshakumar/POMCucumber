package stepDefinition;

import com.crm.qa.base.TestBaseClass;
import com.crm.qa.pages.Homepage;
import com.crm.qa.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Login_stepDef extends TestBaseClass {
		
	public Login_stepDef() {
		super();
	}	
	LoginPage loginpage = new LoginPage();
	//Homepage homepage = new Homepage();
	

	@Given("^user enter the Valid URL$")
	public void user_enter_the_Valid_URL() {
		initialization();
		
	}

	@Then("^Check the no of links available on webpage$")
	public void check_the_no_of_links_available_on_webpage() {
		loginpage.linkCheck();
	}

	@Then("^Check the no of text available on webpage$")
	public void check_the_no_of_text_available_on_webpage() {
		loginpage.labelCheck();
	}

	@Then("^enter valid username and password$")
	public void enter_valid_username_and_password() {
		loginpage.loginValidation();
	}

//	@Then("^the User is on HomePage$")
//	public void the_User_is_on_HomePage() {
//		String titleValidation = homepage.pageTitle();
//		System.out.println(titleValidation);
//	}


}
