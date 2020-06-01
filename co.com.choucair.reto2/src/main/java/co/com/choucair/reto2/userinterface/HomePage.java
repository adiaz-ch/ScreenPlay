package co.com.choucair.reto2.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    public static Target getMenuList() {
        return Target.the("menu options").
                located(By.className("list-group-item"));
    }
}
