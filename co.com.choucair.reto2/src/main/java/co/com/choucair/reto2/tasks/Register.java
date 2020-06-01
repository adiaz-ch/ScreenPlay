package co.com.choucair.reto2.tasks;

import co.com.choucair.reto2.userinterface.AgregarDoctorPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

public class Register implements Task {

    private List<List<String>> form;

    public Register(List<List<String>> form) {this.form = form;}

    public static Register the(List<List<String>> form) {
        return Tasks.instrumented(Register.class, form);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(form.get(1).get(0).trim()).into(AgregarDoctorPage.FIRST_NAME),
                Enter.theValue(form.get(1).get(1).trim()).into(AgregarDoctorPage.LAST_NAME),
                Enter.theValue(form.get(1).get(2).trim()).into(AgregarDoctorPage.PHONE),
                Click.on(AgregarDoctorPage.TYPE_DOCUMENT),
                SelectFromOptions.byValue(form.get(1).get(3).trim()).from(AgregarDoctorPage.TYPE_DOCUMENT),
                Enter.theValue(form.get(1).get(4).trim()).into(AgregarDoctorPage.NUMBER_DOCUMENT),
                Click.on(AgregarDoctorPage.SAVE));
    }
}
