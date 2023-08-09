package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src/test/java/Features/Checkout.feature",
			glue= {"Stepdefinitions"},
			plugin = {"pretty","html:target/cucumber-reports.html"},
			monochrome= true
			//tags='@regression"
	
					)
			
			
	public class TestRunner {
			
}
