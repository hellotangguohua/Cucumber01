package runner;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSteps {

    @Given("user is on login page")
    public void userIsOnLoginPage(){
        System.out.println("Step 01 - user is on login page");
    }

    @When("user enter valid username and password")
    public void userEnterValidUsernameAndPassword(){
        System.out.println("Step 02 - user enter valid username and password");
    }

    @And("clicks on login button")
    public void clicksOnLoginButton(){
        System.out.println("Step 03 - clicks on login button");
    }

    @Then("user can navigated to home page successfully")
    public void userCanNavigatedToHomePageSuccessfully(){
        System.out.println("Step 04 - user can navigated to home page successfully");
    }

    @When("user enter invalid username and password")
    public void userEnterInvalidUsernameAndPassword(){
        System.out.println("Step 02 - user enter invalid username and password");
    }

    @Then("error message is displayed")
    public void errorMessageIsDisplayed(){
        System.out.println("Step 04 - error message is displayed");
    }
}
