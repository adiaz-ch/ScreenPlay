package co.com.choucair.winappdriver.calculadora.stepdefinitions;

import co.com.choucair.winappdriver.calculadora.questions.TheResult;
import co.com.choucair.winappdriver.calculadora.tasks.Add;
import co.com.choucair.winappdriver.calculadora.tasks.ClearThe;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

public class AddStepDefinitions {
    @Given("^(.*) opens the Windows calculator$")
    public void alixOpensTheWindowsCalculator(String Alix) {
        OnStage.theActorCalled(Alix).wasAbleTo(ClearThe.calculator());
    }

    @When("^she adds (\\d+) and (\\d+)$")
    public void sheAddsAnd(int numero1, int numero2) {
        OnStage.theActorInTheSpotlight().attemptsTo(Add.numbers(numero1, numero2));
    }

    @Then("^she checks the total sum (\\d+)$")
    public void sheChecksTheTotalSum(int total) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheResult.isCorrect(total)));
    }
}
