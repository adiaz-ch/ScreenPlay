package co.com.choucair.reto2.tasks;

import co.com.choucair.reto2.userinterface.AddPatientPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

public class RegisterPatient implements Task {
    private List<List<String>> form;

    public RegisterPatient(List<List<String>> form) {this.form = form;}

    public static RegisterPatient the(List<List<String>> form) {
        return Tasks.instrumented(RegisterPatient.class, form);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(form.get(1).get(0).trim()).into(AddPatientPage.FIRST_NAME),
                Enter.theValue(form.get(1).get(1).trim()).into(AddPatientPage.LAST_NAME),
                Enter.theValue(form.get(1).get(2).trim()).into(AddPatientPage.PHONE),
                Click.on(AddPatientPage.TYPE_DOCUMENT),
                SelectFromOptions.byValue(form.get(1).get(3).trim()).from(AddPatientPage.TYPE_DOCUMENT),
                Enter.theValue(form.get(1).get(4).trim()).into(AddPatientPage.NUMBER_DOCUMENT));

        if (form.get(1).get(5).trim().equalsIgnoreCase("Si")){
            actor.attemptsTo(Click.on(AddPatientPage.PREPAGADA));
        }

        actor.attemptsTo(Click.on(AddPatientPage.SAVE));
    }
}
