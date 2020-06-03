package co.com.choucair.winappdriver.calculadora.tasks;

import co.com.choucair.winappdriver.calculadora.interactions.ClickOn;
import co.com.choucair.winappdriver.calculadora.interactions.Select;
import co.com.choucair.winappdriver.calculadora.models.OperationData;
import co.com.choucair.winappdriver.calculadora.userinterfaces.CalculatorPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

public class Operate implements Task {
    List<OperationData> dataset;

    public Operate(List<OperationData> dataset) {this.dataset = dataset;}

    public static Operate numbers(List<OperationData> dataset) {
        return Tasks.instrumented(Operate.class, dataset);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ClickOn.number(dataset.get(0).getNumber1()),
                Select.theOperator(dataset.get(0).getOperator().trim()),
                ClickOn.number(dataset.get(0).getNumber2()),
                Click.on(CalculatorPage.BUTTON_EQUAL));
    }
}
