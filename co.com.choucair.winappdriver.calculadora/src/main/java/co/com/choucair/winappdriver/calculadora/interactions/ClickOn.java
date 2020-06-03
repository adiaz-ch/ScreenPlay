package co.com.choucair.winappdriver.calculadora.interactions;

import co.com.choucair.winappdriver.calculadora.userinterfaces.CalculatorPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

public class ClickOn implements Interaction {
    private Integer num;

    public ClickOn(int num) {this.num = num;}

    public static ClickOn number(int num) {return new ClickOn(num);}

    private Interaction switchNumber(Integer num) {
        switch (num) {
            case 1:
                return Click.on(CalculatorPage.NUMBER_1);
            case 2:
                return Click.on(CalculatorPage.NUMBER_2);
            case 3:
                return Click.on(CalculatorPage.NUMBER_3);
            case 4:
                return Click.on(CalculatorPage.NUMBER_4);
            case 5:
                return Click.on(CalculatorPage.NUMBER_5);
            case 6:
                return Click.on(CalculatorPage.NUMBER_6);
            case 7:
                return Click.on(CalculatorPage.NUMBER_7);
            case 8:
                return Click.on(CalculatorPage.NUMBER_8);
            case 9:
                return Click.on(CalculatorPage.NUMBER_9);
            case 0:
                return Click.on(CalculatorPage.NUMBER_0);
        }
        return null;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        int numbersOfDigits = this.num.toString().length();
        String numAsString = this.num.toString();
        if (numbersOfDigits==1){
            actor.attemptsTo(switchNumber(this.num));
        }else{
            for (int i = 0; i < numbersOfDigits; i++) {
                int digit = Character.getNumericValue(numAsString.charAt(i));
                actor.attemptsTo(switchNumber(digit));
            }
        }
    }
}
