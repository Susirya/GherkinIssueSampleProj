package hellocucumber;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefs {


	@Given("that I created UTF{int}-BOM encoded feature-file")
	public void that_I_created_UTF_BOM_encoded_feature_file(Integer int1) {
		// some code
	}

	@When("I pass it to cucumber-jvm")
	public void i_pass_it_to_cucumber_jvm() {
		// some code
	}

	@Then("it gets parsed normally")
	public void it_gets_parsed_normally() {
		// some code
	}
}