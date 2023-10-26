package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.ParkingLot;
import org.example.Ticket;

import java.time.LocalDateTime;

public class ParkingLotStepDefinitions {
    Ticket ticket;
    ParkingLot parkingLot;
    LocalDateTime entryTime;
    LocalDateTime exitTime;


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

    @Given("I am staying in the {string} parking lot")
    public void i_am_staying_in_the_parking_lot(String lotType) {
        if(lotType.equals("Long Term")) {

        }

    }
    @When("I enter on {string}")
    public void i_enter_on(String string) {

    }
    @When("I excit on \"{int}, {int}, {int}, {int}, {int}")
    public void i_excit_on(Integer int1, Integer int2, Integer int3, Integer int4, Integer int5) {


    }
    @Then("my fee is {int}")
    public void my_fee_is(Integer int1) {

    }
}
