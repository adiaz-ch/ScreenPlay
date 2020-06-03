package co.com.choucair.winappdriver.calculadora.stepdefinitions;

import co.com.choucair.winappdriver.calculadora.models.OperationData;
import co.com.choucair.winappdriver.calculadora.models.OperationResults;
import co.com.choucair.winappdriver.calculadora.questions.TheResult;
import co.com.choucair.winappdriver.calculadora.tasks.Operate;
import co.com.choucair.winappdriver.calculadora.tasks.OperateThe;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

public class MathOperationStepDefinitions{

    @When("^she operates$")
    public void sheOperates(List<OperationData> dataset) {
        OnStage.theActorInTheSpotlight().attemptsTo(Operate.numbers(dataset));
    }

    @Then("^she checks the total sum$")
    public void sheChecksTheTotalSum(List<OperationResults> dataset) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.
                seeThat(TheResult.isCorrect(dataset.get(0).getTotal())));
    }

    @When("^she performs the (.+) between (.+) and (.+)$")
    public void shePerformsTheBetweenAnd(String operator, int number1, int number2) {
        OnStage.theActorInTheSpotlight().
                attemptsTo(OperateThe.numbers(operator, number1, number2));
    }

}
