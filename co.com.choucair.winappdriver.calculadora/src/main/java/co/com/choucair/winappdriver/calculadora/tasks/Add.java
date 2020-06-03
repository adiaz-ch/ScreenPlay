package co.com.choucair.winappdriver.calculadora.tasks;

import co.com.choucair.winappdriver.calculadora.interactions.ClickOn;
import co.com.choucair.winappdriver.calculadora.userinterfaces.CalculatorPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Add implements Task {
    private Integer numero1;
    private Integer numero2;

    public Add(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public static Add numbers(int numero1, int numero2) {
        return Tasks.instrumented(Add.class, numero1, numero2);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ClickOn.number(numero1),
                Click.on(CalculatorPage.BUTTON_ADD),
                ClickOn.number(numero2),
                Click.on(CalculatorPage.BUTTON_EQUAL));

    }
}
