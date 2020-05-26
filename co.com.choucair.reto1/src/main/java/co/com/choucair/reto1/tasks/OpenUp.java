package co.com.choucair.reto1.tasks;

import co.com.choucair.reto1.userinterface.WebAutomationDemoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.actions.Open.browserOn;

public class OpenUp implements Task {

    private WebAutomationDemoPage webAutomationDemoPage;

    public static OpenUp thaPage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(webAutomationDemoPage));
    }
}
