package Stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;

import Actions.Sauceloginactions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Saucelabs {
	Sauceloginactions SauceAct = new Sauceloginactions(Hooks.driver);
	@Given("User launch the application with {string}")
	public void user_launch_the_application_with(String string) {
	  Hooks.driver.get(string);
	}

	@When("user enter valid username {string}")
	public void user_enter_valid_username(String string) {
	    SauceAct.enterUsername(string);
	}

	@When("user enter valid password {string}")
	public void user_enter_valid_password(String string) {
	    SauceAct.enterpassword(string);
	}

	@When("user click on submit button")
	public void user_click_on_submit_button() {
		SauceAct.clickLoginBtn();
	}

	@Then("user should br able to logged in successfully")
	public void user_should_br_able_to_logged_in_successfully() {
	   Assert.assertEquals("Swag Labs",Hooks.driver.getTitle());
	}
	@When("user enter inavalid creds as {string} and password as {string}")
	public void user_enter_inavalid_creds_as_and_password_as(String string, String string2) {
	    SauceAct.enterUsername(string);
	    SauceAct.enterpassword(string2);
	}

	@Then("user should get some error message")
	public void user_should_get_some_error_message() {
		 String actualText=Hooks.driver.findElement(By.xpath("//*[@data-test='error']")).getText();
		Assert.assertEquals("Epic sadface: Username and password do not match any user in this service",actualText);
	}

}
