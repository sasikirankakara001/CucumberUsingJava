package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {
	@Given("User is on NetBanking landing page")
	public void user_is_on_net_banking_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("Landing Page");
	}
//	@When("User login into application with {string} and password {string}")
//	public void user_login_into_application(String user,String password) {
//	    // Write code here that turns the phrase above into concrete actions
////	    throw new io.cucumber.java.PendingException();
//		System.out.println("User Page");
//		System.out.println("UserName: "+user+" "+"Password: "+password);
//	}
	@When("^User login into application with (.+) and password (.+)$")
	public void user_login_into_application(String user,String password) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("User Page");
		System.out.println("UserName: "+user+" "+"Password: "+password);
	}
	@Then("Home Page is displayed")
	public void home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("home_page");
	}
	@Then("Cards are displayed")
	public void cards_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("cards page");
	}

@Given("User is on Practice landing page")
public void user_is_on_practice_landing_page() {
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
	System.out.println("Welcome to Practice Landing Page");
}
@When("User signup into application")
public void user_signup_into_application(List<String>data) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
//    throw new io.cucumber.java.PendingException();
	System.out.println("Welcome to the User Sign up");
	System.out.println(data.get(2));
	
	
}

}
