package co.com.choucair.reto2.tasks;

import co.com.choucair.reto2.userinterface.SchedulesAppointmentPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

public class ScheduleMedicalAppointment implements Task {
    private List<List<String>> patient;

    public ScheduleMedicalAppointment(List<List<String>> patient) {this.patient = patient;}

    public static ScheduleMedicalAppointment to(List<List<String>> patient) {
        return Tasks.instrumented(ScheduleMedicalAppointment.class, patient);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(patient.get(1).get(0).trim()).into(SchedulesAppointmentPage.APPOINTMET_DATE).thenHit(Keys.ENTER),
                Enter.theValue(patient.get(1).get(1).trim()).into(SchedulesAppointmentPage.PATIENT_DOCUMENT),
                Enter.theValue(patient.get(1).get(2).trim()).into(SchedulesAppointmentPage.DOCTOR_DOCUMENT),
                Enter.theValue(patient.get(1).get(3).trim()).into(SchedulesAppointmentPage.OBSERVATIONS),
                Click.on(SchedulesAppointmentPage.SAVE));
    }
}
