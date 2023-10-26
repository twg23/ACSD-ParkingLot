package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ParkingLotStepDefinitions {

    @Given("first things")
    public void first_things() {
        System.out.println("Given ran");
    }
    @When("second things")
    public void second_things() {
        System.out.println("When ran");
    }
    @Then("last things")
    public void last_things() {
        System.out.println("then ran");
    }
}
