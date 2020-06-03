package co.com.choucair.reto2.stepdefinitions;

import co.com.choucair.reto2.tasks.OpenUp;
import co.com.choucair.reto2.tasks.RegisterPatient;
import co.com.choucair.reto2.tasks.Select;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

public class RegisterPatientStepDefinitions {
    @Given("^than Carlos needs to register a new patient in option: (.*)$")
    public void thanCarlosNeedsToRegisterANewPatientInOptionAgregarPaciente(String option) {
        OnStage.theActorCalled("Carlos").wasAbleTo(OpenUp.thaPage(),
                Select.menuOption(option));
    }

    @When("^he performs the registration of the patient in the Hospital Administration application$")
    public void hePerformsTheRegistrationOfThePatientInTheHospitalAdministrationApplication(DataTable datos) {
        List<List<String>> form = datos.raw();
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterPatient.the(form));
    }
}
