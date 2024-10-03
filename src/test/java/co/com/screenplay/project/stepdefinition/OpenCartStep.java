package co.com.screenplay.project.stepdefinition;

import co.com.screenplay.project.hook.OpenWeb;
import co.com.screenplay.project.questions.ProductNamesInCart;
import co.com.screenplay.project.questions.TheOrderConfirmationPage;
import co.com.screenplay.project.tasks.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static co.com.screenplay.project.utils.Constants.WEB_URL;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.assertj.core.api.Assertions.assertThat;

public class OpenCartStep {

    @Given("the {string} has entered the OpenCart homepage")
    public void iAmOnTheOpenCartHomepage(String actor) {
        theActorCalled(actor).wasAbleTo(OpenWeb.browserURL(WEB_URL));
    }

    @When("I add products to the shopping cart")
    public void iAddProductsToTheShoppingCart(List<String> productNames) {
        theActorInTheSpotlight().attemptsTo(AddProductsToCartTask.withProducts(productNames), ViewShoppingCart.view());
        List<String> actualProducts = theActorInTheSpotlight().asksFor(ProductNamesInCart.displayed());
        assertThat(actualProducts).containsAll(productNames);
    }

    @When("I complete the purchase as a guest")
    public void iCompleteThePurchaseAsAGuest() {
        theActorInTheSpotlight().attemptsTo(ProceedToCheckout.now(),
                SelectGuestCheckout.ifNotSelected(),
                FillBillingDetailsForm.withRandomValues(),
                SelectShippingMethod.andContinue(),
                SelectPaymentMethod.andContinue(),
                ConfirmOrder.now());

    }

    @Then("a confirmation message should be displayed")
    public void aConfirmationMessageShouldBeDisplayed() {
        theActorInTheSpotlight().should(seeThat(TheOrderConfirmationPage.isDisplayed()));
    }
}
