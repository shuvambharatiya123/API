package StepDef;

import ApiUtils.CreateAPI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class VerifyGetSteps {
	
	@Given("calling Get Method")
	public void calling_get_method() {
		CreateAPI obj = new CreateAPI();
		obj.getMethod();
	   
	}

	@Then("executed Successfully")
	public void executed_successfully() {
		System.out.println("Get Method is successfully executed.");
	   
	}

}
