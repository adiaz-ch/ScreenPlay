package co.com.choucair.winappdriver.calculadora.interactions;

import co.com.choucair.winappdriver.calculadora.userinterfaces.CalculatorPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;

public class Select implements Interaction {
    private String operator;

    public Select(String operator) {this.operator = operator;}

    public static Select theOperator(String operator) {return new Select(operator);}

    private Interaction switchOperator() {
        switch (operator) {
            case "+":
                return Click.on(CalculatorPage.BUTTON_ADD);
            case "-":
                return Click.on(CalculatorPage.BUTTON_MINUS);
            case "*":
                return Click.on(CalculatorPage.BUTTON_MULTIPLY);
            case "/":
                return Click.on(CalculatorPage.BUTTON_DIVIDE);
        }
        return null;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(switchOperator());
    }
}
