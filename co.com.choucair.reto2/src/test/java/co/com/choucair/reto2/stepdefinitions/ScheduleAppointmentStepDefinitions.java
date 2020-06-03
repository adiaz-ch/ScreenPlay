package co.com.choucair.reto2.stepdefinitions;

import co.com.choucair.reto2.tasks.OpenUp;
import co.com.choucair.reto2.tasks.ScheduleMedicalAppointment;
import co.com.choucair.reto2.tasks.Select;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

public class ScheduleAppointmentStepDefinitions {
    @Given("^than Carlos needs to schedule a medical appointment in option: (.*)$")
    public void thanCarlosNeedsToScheduleAMedicalAppointmentInOptionAgendarCita(String option) {
        OnStage.theActorCalled("Carlos").wasAbleTo(OpenUp.thaPage(),
                Select.menuOption(option));
    }

    @When("^he schedules an appointment$")
    public void heSchedulesAnAppointment(DataTable datos) {
        List<List<String>> patient = datos.raw();
        OnStage.theActorInTheSpotlight().attemptsTo(ScheduleMedicalAppointment.to(patient));
    }
}
