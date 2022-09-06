package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage {
	

@Given("^user is on login page$")
public void user_is_on_login_page() {
    System.out.println("inside step-user is on login page");
}

@When("users enter username & password")
public void users_enter_username_password() {
	System.out.println("inside step-users enter username & password");
}

@And("click on login button")
public void click_on_login_button() {
	System.out.println("inside step-click on login button");
}

@Then("user navigating home page")
public void user_navigating_home_page() {
	System.out.println("inside step-user navigating home page");
}


}
