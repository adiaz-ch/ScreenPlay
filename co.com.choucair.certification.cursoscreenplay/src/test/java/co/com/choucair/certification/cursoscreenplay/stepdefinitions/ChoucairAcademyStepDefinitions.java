package co.com.choucair.certification.cursoscreenplay.stepdefinitions;

import co.com.choucair.certification.cursoscreenplay.questions.Answer;
import co.com.choucair.certification.cursoscreenplay.tasks.Login;
import co.com.choucair.certification.cursoscreenplay.tasks.OpenUp;
import co.com.choucair.certification.cursoscreenplay.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Alix wants to learn automation at the Choucair Academy$")
    public void thanAlixWantsToLearnAutomationAtTheChoucairAcademy() {
        OnStage.theActorCalled("Alix").wasAbleTo(OpenUp.thaPage(), (Login.onThePage()));
    }

    @When("^he search for the course (.*) on the choucair academy platform$")
    public void heSearchForTheCourseAutomatizacionDePruebasOnTheChoucairAcademyPlatform(String course) {
        System.out.println("Nombre curso when: "+course);
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));
    }

    @Then("^he finds the course called resources (.*)$")
    public void heFindsTheCourseCalledResourcesAutomatizacionDePruebas(String question) {
        System.out.println("Nombre curso then: "+question);
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }
}
