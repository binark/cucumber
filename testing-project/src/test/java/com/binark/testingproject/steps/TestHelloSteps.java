package com.binark.testingproject.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.ResponseBody;
import org.junit.Assert;

public class TestHelloSteps {

    private static final String BASE_URL = "http://localhost:8080/api";
    private static final String HELLO_CONTROLLER_PATH = "/";

    private ResponseBody responseBody;

    @Given("^A visitor$")
    public void initialization() {
        responseBody = null;
    }

    @When("^I call test hello controller$")
    public void callTestHelloController() {
        responseBody = RestAssured.get(BASE_URL + HELLO_CONTROLLER_PATH).body();
    }

    @Then("^I should get (.+) text$")
    public void verifyTestControllerResponse(String expectedResult) {
        Assert.assertNotNull(responseBody);
        String result = responseBody.asString();
        Assert.assertEquals(expectedResult.toUpperCase(), result.toUpperCase());
    }

}
