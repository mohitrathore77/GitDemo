package stepDefinations;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefination {
	
	@Given("^User is on netbanking login page$")
	public void user_is_on_netbanking_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User is on netbanking login page");
	}
	//Regular expersion \"([^\"]*)\"
	@When("^User login into the application by entering ([^\"]*) and ([^\"]*)$")
	public void user_login_into_the_application_by_entering_username_and_password(String args1, String args2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User login into the application by entering username and password");
		System.out.println(args1);
		System.out.println(args2);
	}
	@Then("^Netbanking home page is populated$")
	public void netbanking_home_page_is_populated() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Netbanking home page is populated");
	}
	@Then("^Cards are displayed ([^\"]*)$")
	public void cards_are_displayed(String agrs1) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Cards are displayed");
		System.out.println(agrs1);
	}
	
	/*@Given("User is on netbanking login page")
	public void user_is_on_netbanking_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("User login into the application by entering username and passowrd")
	public void user_login_into_the_application_by_entering_username_and_passowrd() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Netbanking home page is populated")
	public void netbanking_home_page_is_populated() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Cards are displayed")
	public void cards_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}*/

}
