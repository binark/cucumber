package com.binark.testingproject.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.ResponseBody;
import org.junit.Assert;

public class TestGreetingNameSteps {

    private static final String BASE_URL = "http://localhost:8080/api";
    private ResponseBody responseBody;
    private String name;

    @Given("^A visitor named (.+)$")
    public void initialization(String name) {
        this.name = name;
    }

    @When("^I call greeting name controller with my name$")
    public void callGreetingNameController() {
        responseBody = RestAssured.get(BASE_URL + "/" + this.name).body();
    }

    @Then("^I should get (.+) response$")
    public void verifyGreetingNameControllerResponse(String expectedResult) {
        Assert.assertNotNull(responseBody);
        String result = responseBody.asString();
        Assert.assertEquals(expectedResult.toUpperCase(), result.toUpperCase());
    }
}
