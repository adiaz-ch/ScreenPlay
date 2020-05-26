package co.com.choucair.reto1.stepdefinitions;

import co.com.choucair.reto1.tasks.OpenUp;
import co.com.choucair.reto1.tasks.Register;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class WebAutomationDemoStepDefinitions {

    @Before
    public void setStage() {OnStage.setTheStage(new OnlineCast());}

    @Given("^than Alix wants to access the Web Automation Demo site$")
    public void thanAlixWantsToAccessTheWebAutomationDemoSite() {
        OnStage.theActorCalled("Alix").wasAbleTo(OpenUp.thaPage());
    }

    @When("^she performs the registration on the page$")
    public void shePerformsTheRegistrationOnThePage(DataTable datos) {
        List<List<String>> form = datos.raw();
        OnStage.theActorInTheSpotlight().attemptsTo(Register.the(form));
    }

    @Then("^she verifies that the screen loads with text (.*)$")
    public void sheVerifiesThatTheScreenLoadsWithTextDoubleClickOnEditIconToEDITTheTableRow() {
    }
}
