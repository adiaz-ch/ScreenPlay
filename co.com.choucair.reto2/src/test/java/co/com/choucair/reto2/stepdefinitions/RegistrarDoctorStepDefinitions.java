package co.com.choucair.reto2.stepdefinitions;

import co.com.choucair.reto2.questions.AnswerCreationDoctor;
import co.com.choucair.reto2.tasks.OpenUp;
import co.com.choucair.reto2.tasks.Register;
import co.com.choucair.reto2.tasks.Select;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class RegistrarDoctorStepDefinitions {

    @Before
    public void setStage() {OnStage.setTheStage(new OnlineCast());}

    @Given("^than Carlos needs to register a new doctor in option: (.*)$")
    public void thanCarlosNeedsToRegisterANewDoctorInOptionAgregarDoctor(String option) {
        OnStage.theActorCalled("Carlos").wasAbleTo(OpenUp.thaPage(),
                Select.menuOption(option));
    }

    @When("^he registers it in the Hospital Administration application$")
    public void heRegistersItInTheHospitalAdministrationApplication(DataTable datos) {
        List<List<String>> form = datos.raw();
        OnStage.theActorInTheSpotlight().attemptsTo(Register.the(form));
    }

    @Then("^He verifies that the message appears on the screen: (.*)$")
    public void heVerifiesThatTheMessageAppearsOnTheScreenDatosGuardadosCorrectamente(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerCreationDoctor.toThe(question)));
    }
}
