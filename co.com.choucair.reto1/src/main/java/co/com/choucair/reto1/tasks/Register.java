package co.com.choucair.reto1.tasks;

import co.com.choucair.reto1.userinterface.RegisterFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class Register implements Task {

    private List<List<String>> form;

    public Register(List<List<String>> form) {
        this.form = form;
    }

    public static Register the(List<List<String>> form) {
        return Tasks.instrumented(Register.class, form);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(form.get(1).get(0).trim()).into(RegisterFormPage.FIRST_NAME),
                Enter.theValue(form.get(1).get(1).trim()).into(RegisterFormPage.LAST_NAME),
                Enter.theValue(form.get(1).get(2).trim()).into(RegisterFormPage.ADDRESS));
    }
}
