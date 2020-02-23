package com.santiago845.screenplay.stepdefinitions;

import com.santiago845.screenplay.model.ClientInformation;
import com.santiago845.screenplay.model.SwagLabsAccount;
import com.santiago845.screenplay.tasks.Checkout;
import com.santiago845.screenplay.tasks.Login;
import com.santiago845.screenplay.tasks.OpenSwagLabsWebPageOn;
import com.santiago845.screenplay.tasks.SelectProducts;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.List;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ProductsPurchaseStepDefinitions {

    private static final String SANTIAGO = "Santiago";

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(SANTIAGO).wasAbleTo(OpenSwagLabsWebPageOn.theBrowser());
    }

    @Given("^the winner client has the access credentials to login into application$")
    public void theWinnerClientHasTheAccessCredentialsToLoginIntoApplication(List<List<String>> accountData) {

        SwagLabsAccount swagLabsAccount = new SwagLabsAccount(accountData.get(1).get(0), accountData.get(1).get(1));

        theActorInTheSpotlight().attemptsTo(Login.withCredentials(swagLabsAccount));

    }

    @When("^he selects two articles of product list$")
    public void heSelectsTwoArticlesOfProductList(List<List<String>> checkoutInformation) {

        ClientInformation clientInformation = new ClientInformation(checkoutInformation.get(1).get(0), checkoutInformation.get(1).get(1), checkoutInformation.get(1).get(2));

        theActorInTheSpotlight().attemptsTo(SelectProducts.toAddInTheShopCart(),
                Checkout.purchase(clientInformation));

    }

    @Then("^he can finish the checkout seeing the successful purchase status$")
    public void heCanFinishTheCheckoutSeeingTheSuccessfulPurchaseStatus() {

    }

}
