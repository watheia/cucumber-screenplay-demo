package features.hello

import io.cucumber.java.PendingException
import io.cucumber.java.en.Given

class HelloStepDefs {
	@Given("I have a matching step definition")
	public void i_have_a_matching_step_definition() {
		throw new PendingException();
	}
}
