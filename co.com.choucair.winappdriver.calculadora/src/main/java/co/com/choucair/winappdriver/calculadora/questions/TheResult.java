package co.com.choucair.winappdriver.calculadora.questions;

import co.com.choucair.winappdriver.calculadora.userinterfaces.CalculatorPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheResult implements Question<Boolean> {

    private Integer total;

    public TheResult(Integer total) {this.total = total;}

    public static TheResult isCorrect(int total) {return new TheResult(total);}

    @Override
    public Boolean answeredBy(Actor actor) {
        String calculator_Result = Text.of(CalculatorPage.CALCULATOR_RESULT).viewedBy(actor).asString().replaceAll("\\D+", "");
        return total.equals(Integer.valueOf(calculator_Result));
    }
}
