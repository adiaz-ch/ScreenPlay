package co.com.choucair.reto1.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WebTablePage extends PageObject {
    public static final Target TITLE = Target.the("title to verify").
            located(By.xpath("/html/body/section/div[1]/div/div[2]/h4[1]"));
}
