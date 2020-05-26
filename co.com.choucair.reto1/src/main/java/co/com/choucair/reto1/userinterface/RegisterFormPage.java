package co.com.choucair.reto1.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterFormPage extends PageObject {

    public static final Target FIRST_NAME = Target.the("where we write the first name").
            located(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[1]/input"));

    public static final Target LAST_NAME = Target.the("where we write the last name").
            located(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[2]/input"));

    public static final Target ADDRESS = Target.the("where we write the address").
            located(By.xpath("//*[@id='basicBootstrapForm']/div[2]/div/textarea"));

 
}
