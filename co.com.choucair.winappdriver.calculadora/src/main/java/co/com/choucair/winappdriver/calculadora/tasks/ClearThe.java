package co.com.choucair.winappdriver.calculadora.tasks;

import co.com.choucair.winappdriver.calculadora.userinterfaces.CalculatorPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ClearThe implements Task {

    public static ClearThe calculator() {return Tasks.instrumented(ClearThe.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Click.on(CalculatorPage.BUTTON_CLEAR));
    }
}
