package com.santiago845.screenplay.stepdefinitions;

import com.santiago845.screenplay.tasks.OpenSwagLabsWebPageOn;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class ProductsPurchaseStepDefinitions {

    private static final String SANTIAGO = "Santiago";

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(SANTIAGO).wasAbleTo(OpenSwagLabsWebPageOn.theBrowser());
    }

    @Given("^the winner client has the access credentials to login into application$")
    public void theWinnerClientHasTheAccessCredentialsToLoginIntoApplication() {

    }

    @When("^he selects two articles of product list$")
    public void heSelectsTwoArticlesOfProductList() {

    }

    @Then("^he can finish the checkout seeing the successful purchase status$")
    public void heCanFinishTheCheckoutSeeingTheSuccessfulPurchaseStatus() {

    }

}
