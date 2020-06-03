package co.com.choucair.reto2.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddDoctorPage extends PageObject {
    public static final Target FIRST_NAME = Target.the("where we write the first name").
            located(By.id("name"));
    public static final Target LAST_NAME = Target.the("where we write the last name").
            located(By.id("last_name"));
    public static final Target PHONE = Target.the("where we write the number phone").
            located(By.id("telephone"));
    public static final Target TYPE_DOCUMENT = Target.the("where we select the type of document of identy").
            located(By.id("identification_type"));
    public static final Target NUMBER_DOCUMENT = Target.the("where we write the identification document").
            located(By.id("identification"));
    public static final Target SAVE = Target.the("where we select save").
            located(By.className("btn"));
}
