package com.JetStar.testautomation.src;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WebsiteAutomationSteps {
	// WebDriver driver;
	 
	 public WebsiteAutomationSteps()
	 {		
	 }
	 
	 @Given("^I open the JetStart website$")
	 public void i_open_the_JetStart_website() {
		 System.out.println("Entering: I open the JetStart website");
	     BrowserDriver.loadPage("http://www.jetstar.com/nz/en/home");
	 }
	 
	 @Given("^I choose a destination \"([^\"]*)\"$")
	 public void i_choose_a_destination(String location)  throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
		 System.out.println("I will choose a destination");
		 BrowserDriver.choosedestination(location);
	 }
	 
	 @Given("^I want buy a one way ticket and choose date$")
	 public void i_want_buy_a_one_way_ticket_and_choose_date()  {
		 BrowserDriver.choosedate( );
	 }
	 
	 @Given("^I select flight time$")
	 public void i_select_flight_time() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
		 BrowserDriver.choosetime("12:40-14:05");
	}
	 
	 @Given("^I have no bundle and baggage$")
	 public void i_have_no_bundle_and_baggage() throws Throwable {
		 BrowserDriver.bundlebaggage();
	 }
	 
	 
	 @Given("^I dont mind where i sit and dont book hotel$")
	 public void i_dont_mind_where_i_sit_and_dont_book_hotel() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
		 BrowserDriver.continuenoseat();
	 }

	 @Then("^I log in and enter the right username and password$")
	 public void i_log_in_and_enter_the_right_username_and_password() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
		 BrowserDriver.login();
	 }

	 @Then("^I should get login_in$")
	 public void i_should_get_login_in()  throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
	 }
	 

//	 @Then("^I should see the following error message$")
//	    public void then_I_Should_get_error_message(String expMsg){
//		 String rspMsg = BrowserDriver.getResponse();
//		 System.out.println("The response message is " + expMsg);
//		 org.junit.Assert.assertEquals(expMsg, rspMsg);
//	    }
	 
}
	 
