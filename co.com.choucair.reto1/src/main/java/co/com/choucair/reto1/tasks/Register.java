package co.com.choucair.reto1.tasks;

import co.com.choucair.reto1.interactions.SelectInteraction;
import co.com.choucair.reto1.userinterface.RegisterFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import java.util.Arrays;
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
        List<String> hobbies = Arrays.asList(form.get(1).get(6).split(","));
        List<String> languages = Arrays.asList(form.get(1).get(7).replaceAll("\\s+","").split(","));

        actor.attemptsTo(Enter.theValue(form.get(1).get(0).trim()).into(RegisterFormPage.FIRST_NAME),
                Enter.theValue(form.get(1).get(1).trim()).into(RegisterFormPage.LAST_NAME),
                Enter.theValue(form.get(1).get(2).trim()).into(RegisterFormPage.ADDRESS),
                Enter.theValue(form.get(1).get(3).trim()).into(RegisterFormPage.EMAIL),
                Enter.theValue(form.get(1).get(4).trim()).into(RegisterFormPage.PHONE));

        if (form.get(1).get(5).trim().equals("Male")){
            actor.attemptsTo(Click.on(RegisterFormPage.GENDER_MALE));
        }else{
            actor.attemptsTo(Click.on(RegisterFormPage.GENDER_FEMALE));
        }

        for (String hobbie : hobbies){
            switch (hobbie.trim()){
                case "Cricket":
                    actor.attemptsTo(Click.on(RegisterFormPage.HOBBIES_CHECKBOX1));
                    break;
                case "Movies":
                    actor.attemptsTo(Click.on(RegisterFormPage.HOBBIES_CHECKBOX2));
                    break;
                case "Hockey":
                    actor.attemptsTo(Click.on(RegisterFormPage.HOBBIES_CHECKBOX3));
                    break;
                default:
                    break;
            }
        }

        actor.attemptsTo(Click.on(RegisterFormPage.LANGUAGES));

        for (String language : languages){
            actor.attemptsTo(SelectInteraction.theOption(RegisterFormPage.getLanguagesList(), language.trim()));
        }

        actor.attemptsTo(Click.on(RegisterFormPage.LABEL),
                Click.on(RegisterFormPage.SKILLS),
                SelectFromOptions.byValue(form.get(1).get(8).trim()).from(RegisterFormPage.SKILLS),
                Click.on(RegisterFormPage.COUNTRY),
                SelectFromOptions.byValue(form.get(1).get(9).trim()).from(RegisterFormPage.COUNTRY),
                Click.on(RegisterFormPage.SELECT_COUNTRY),
                Enter.theValue(form.get(1).get(10).trim()).into(RegisterFormPage.SEARCH_COUNTRY).thenHit(Keys.ENTER),
                Click.on(RegisterFormPage.DATE_OF_BIRTH_YEAR),
                SelectFromOptions.byValue(form.get(1).get(11).trim()).from(RegisterFormPage.DATE_OF_BIRTH_YEAR),
                Click.on(RegisterFormPage.DATE_OF_BIRTH_MONTH),
                SelectFromOptions.byValue(form.get(1).get(12).trim()).from(RegisterFormPage.DATE_OF_BIRTH_MONTH),
                Click.on(RegisterFormPage.DATE_OF_BIRTH_DAY),
                SelectFromOptions.byValue(form.get(1).get(13).trim()).from(RegisterFormPage.DATE_OF_BIRTH_DAY),
                Enter.theValue(form.get(1).get(14).trim()).into(RegisterFormPage.PASSWORD),
                Enter.theValue(form.get(1).get(15).trim()).into(RegisterFormPage.CONFIRM_PASSWORD),
                Click.on(RegisterFormPage.BUTTON_SUBMIT));
    }

}
