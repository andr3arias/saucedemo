package stepsdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import questions.BuyComplete;
import tasks.TriesToBuy;

public class BuyProductsStepsDefinitions {
    @Managed
    private WebDriver hisBrowser;

    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Andre");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @When("^the user tries to buy the products in the cart$")
    public void theUserTriesToBuyTheProductsInTheCart() {
        OnStage.theActorInTheSpotlight().attemptsTo(TriesToBuy.products());
    }


    @Then("^the user sees the successful purchase message$")
    public void theUserSeesTheSuccessfulPurchaseMessage() {
OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(BuyComplete.message(),
        Matchers.is(Matchers.equalTo(true))));
    }
}
