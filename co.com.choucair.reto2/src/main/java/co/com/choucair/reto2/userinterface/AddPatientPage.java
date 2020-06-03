package co.com.choucair.reto2.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddPatientPage extends PageObject {
    public static final Target FIRST_NAME = Target.the("where we write the first name").
            located(By.name("name"));
    public static final Target LAST_NAME = Target.the("where we write the last name").
            located(By.name("last_name"));
    public static final Target PHONE = Target.the("where we write the number phone").
            located(By.name("telephone"));
    public static final Target TYPE_DOCUMENT = Target.the("where we select the type of document of identy").
            located(By.name("identification_type"));
    public static final Target NUMBER_DOCUMENT = Target.the("where we write the identification document").
            located(By.name("identification"));
    public static final Target PREPAGADA = Target.the("").
            located(By.name("prepaid"));
    public static final Target SAVE = Target.the("where we select save").
            located(By.className("btn"));
}
