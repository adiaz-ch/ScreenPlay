package co.com.choucair.winappdriver.calculadora.tasks;

import co.com.choucair.winappdriver.calculadora.interactions.ClickOn;
import co.com.choucair.winappdriver.calculadora.interactions.Select;
import co.com.choucair.winappdriver.calculadora.userinterfaces.CalculatorPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class OperateThe implements Task {
    private String operator;
    private Integer number1;
    private Integer number2;

    public OperateThe(String operator, Integer number1, Integer number2) {
        this.operator = operator;
        this.number1 = number1;
        this.number2 = number2;
    }

    public static OperateThe numbers(String operator, int number1, int number2) {
        return Tasks.instrumented(OperateThe.class, operator, number1, number2);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ClickOn.number(number1),
                Select.theOperator(operator),
                ClickOn.number(number2),
                Click.on(CalculatorPage.BUTTON_EQUAL));
    }
}
