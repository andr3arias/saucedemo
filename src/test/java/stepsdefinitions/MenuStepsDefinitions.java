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
import questions.CheckMenuAll;
import questions.ValidateMenu;
import tasks.CheckMenu;
import tasks.Validate;

public class MenuStepsDefinitions {
    @Managed
    private WebDriver hisBrowser;

    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Andre");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @When("^the user check the all items menu$")
    public void theUserCheckTheAllItemsMenu() {
        OnStage.theActorInTheSpotlight().attemptsTo(CheckMenu.AllItems());
    }


    @Then("^the user can see how to filter all products$")
    public void theUserCanSeeHowToFilterAllProducts() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CheckMenuAll.items()
                , Matchers.is(Matchers.equalTo(true))));
    }

    @When("^the user check the about menu$")
    public void theUserCheckTheAboutMenu() {
        OnStage.theActorInTheSpotlight().attemptsTo(Validate.about());
    }


    @Then("^the user can see the user can see that he is directed to a new page$")
    public void theUserCanSeeTheUserCanSeeThatHeIsDirectedToANewPage() {
OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateMenu.about()
,Matchers.is(Matchers.equalTo(true))));
    }


}
