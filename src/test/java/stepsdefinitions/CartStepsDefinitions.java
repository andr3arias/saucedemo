package stepsdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import groovyjarjarpicocli.groovy.PicocliScriptASTTransformation;
import models.Users;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import questions.ShoppingCart;
import tasks.AddToCart;
import tasks.SignIn;
import tasks.SignInWith;

import java.util.List;

public class CartStepsDefinitions {
    @Managed
    private WebDriver hisBrowser;

    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Andrea");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^the user is in the application$")
    public void theUserIsInTheApplication() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.saucedemo.com"));

    }

    @When("^the user login with her credentials$")
    public void theUserLoginWithHerCredentials() {
        OnStage.theActorInTheSpotlight().attemptsTo(SignIn.inTheApp());
    }

    @When("^the user login with her targets$")
    public void theUserLoginWithHerTargets(List<Users> usersList) {
        Users users;
        users = usersList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(SignInWith.herTargets(users));
    }

    @When("^the user try to add items to shopping cart$")
    public void theUserTryToAddItemsToShoppingCart() {
        OnStage.theActorInTheSpotlight().attemptsTo(AddToCart.container());
    }

    @Then("^the user validating the cart with message$")
    public void theUserValidatingTheCartWithMessage() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ShoppingCart.validating(),
                Matchers.is(Matchers.equalTo(true))));
    }
}
