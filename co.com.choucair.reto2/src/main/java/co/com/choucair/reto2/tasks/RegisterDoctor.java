package co.com.choucair.reto2.tasks;

import co.com.choucair.reto2.userinterface.AddDoctorPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

public class RegisterDoctor implements Task {

    private List<List<String>> form;

    public RegisterDoctor(List<List<String>> form) {this.form = form;}

    public static RegisterDoctor the(List<List<String>> form) {
        return Tasks.instrumented(RegisterDoctor.class, form);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(form.get(1).get(0).trim()).into(AddDoctorPage.FIRST_NAME),
                Enter.theValue(form.get(1).get(1).trim()).into(AddDoctorPage.LAST_NAME),
                Enter.theValue(form.get(1).get(2).trim()).into(AddDoctorPage.PHONE),
                Click.on(AddDoctorPage.TYPE_DOCUMENT),
                SelectFromOptions.byValue(form.get(1).get(3).trim()).from(AddDoctorPage.TYPE_DOCUMENT),
                Enter.theValue(form.get(1).get(4).trim()).into(AddDoctorPage.NUMBER_DOCUMENT),
                Click.on(AddDoctorPage.SAVE));
    }
}
