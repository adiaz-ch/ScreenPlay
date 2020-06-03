package co.com.choucair.reto2.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmationPage extends PageObject {
    public static final Target CONFIRMATION_MESSAGE = Target.the("confirmation message").
            located(By.className("panel-body"));
}
