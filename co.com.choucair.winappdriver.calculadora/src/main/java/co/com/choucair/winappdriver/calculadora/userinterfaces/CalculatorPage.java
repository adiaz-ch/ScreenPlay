package co.com.choucair.winappdriver.calculadora.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CalculatorPage {

    public static final Target NUMBER_0 = Target.the("Number 0").
            located(By.xpath("//*[@AutomationId='num0Button']"));

    public static final Target NUMBER_1 = Target.the("Number 1").
            located(By.xpath("//*[@AutomationId='num1Button']"));

    public static final Target NUMBER_2 = Target.the("Number 2").
            located(By.xpath("//*[@AutomationId='num2Button']"));

    public static final Target NUMBER_3 = Target.the("Number 3").
            located(By.xpath("//*[@AutomationId='num3Button']"));

    public static final Target NUMBER_4 = Target.the("Number 4").
            located(By.xpath("//*[@AutomationId='num4Button']"));

    public static final Target NUMBER_5 = Target.the("Number 5").
            located(By.xpath("//*[@AutomationId='num5Button']"));

    public static final Target NUMBER_6 = Target.the("Number 6").
            located(By.xpath("//*[@AutomationId='num6Button']"));

    public static final Target NUMBER_7 = Target.the("Number 7").
            located(By.xpath("//*[@AutomationId='num7Button']"));

    public static final Target NUMBER_8 = Target.the("Number 8").
            located(By.xpath("//*[@AutomationId='num8Button']"));

    public static final Target NUMBER_9 = Target.the("Number 9").
            located(By.xpath("//*[@AutomationId='num9Button']"));

    public static final Target BUTTON_CLEAR = Target.the("Button to clear").
            located(By.xpath("//*[@AutomationId='clearButton']"));

    public static final Target BUTTON_ADD = Target.the("Button to add").
            located(By.xpath("//*[@AutomationId='plusButton']"));

    public static final Target BUTTON_MINUS = Target.the("Button to minus").
            located(By.xpath("//*[@AutomationId='minusButton']"));

    public static final Target BUTTON_MULTIPLY = Target.the("Button to multiply").
            located(By.xpath("//*[@AutomationId='multiplyButton']"));

    public static final Target BUTTON_DIVIDE= Target.the("Button to divide").
            located(By.xpath("//*[@AutomationId='divideButton']"));

    public static final Target BUTTON_EQUAL = Target.the("Button to equal").
            located(By.xpath("//*[@AutomationId='equalButton']"));

    public static final Target CALCULATOR_RESULT = Target.the("Operation result").
            located(By.xpath("//*[@AutomationId='CalculatorResults']"));

    public CalculatorPage() {
    }
}
