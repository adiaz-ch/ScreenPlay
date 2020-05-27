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

    public static final Target EMAIL = Target.the("where we write the email").
            located(By.xpath("//*[@id='eid']/input"));

    public static final Target PHONE = Target.the("where we write the phone").
            located(By.xpath("//*[@id='basicBootstrapForm']/div[4]/div/input"));

    public static final Target GENDER_MALE = Target.the("where we select the gender").
            located(By.xpath("//*[@id='basicBootstrapForm']/div[5]/div/label[1]/input"));

    public static final Target GENDER_FEMALE = Target.the("where we select the gender").
            located(By.xpath("//*[@id='basicBootstrapForm']/div[5]/div/label[2]/input"));

    public static final Target HOBBIES_CHECKBOX1 = Target.the("where we select the hobbies").
            located(By.id("checkbox1"));

    public static final Target HOBBIES_CHECKBOX2 = Target.the("where we select the hobbies").
            located(By.id("checkbox2"));

    public static final Target HOBBIES_CHECKBOX3 = Target.the("where we select the hobbies").
            located(By.id("checkbox3"));

    public static final Target LANGUAGES = Target.the("where we select the languages").
            located(By.id("msdd"));

    public static final Target LABEL = Target.the("label to deselect the language list").
            located(By.xpath("//*[@id='basicBootstrapForm']/div[8]/label"));

    public static final Target SKILLS = Target.the("where we select the skills").
            located(By.id("Skills"));

    public static final Target COUNTRY = Target.the("where we select the country").
            located(By.id("countries"));

    public static final Target SELECT_COUNTRY = Target.the("where we write a country").
            located(By.xpath("//*[@id='basicBootstrapForm']/div[10]/div/span/span[1]/span"));

    public static final Target SEARCH_COUNTRY = Target.the("where we write a country").
            located(By.xpath("/html/body/span/span/span[1]/input"));

    public static final Target DATE_OF_BIRTH_YEAR = Target.the("where we select the year of date of birth").
            located(By.id("yearbox"));

    public static final Target DATE_OF_BIRTH_MONTH = Target.the("where we select the month of date of birth").
            located(By.xpath("//*[@id='basicBootstrapForm']/div[11]/div[2]/select"));

    public static final Target DATE_OF_BIRTH_DAY = Target.the("where we select the day of date of birth").
            located(By.id("daybox"));

    public static final Target PASSWORD = Target.the("where we write the password").
            located(By.id("firstpassword"));

    public static final Target CONFIRM_PASSWORD = Target.the("where we write the password to confirm").
            located(By.id("secondpassword"));

    public static final Target BUTTON_SUBMIT = Target.the("button to submit").
            located(By.id("submitbtn"));

    public static Target getLanguagesList(){
        return Target.the("where we select the languages").
                located(By.xpath("//*[@id='basicBootstrapForm']/div[7]/div/multi-select/div[2]/ul/li"));
    }
}
