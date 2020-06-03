package co.com.choucair.reto2.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SchedulesAppointmentPage extends PageObject {
    public static final Target APPOINTMET_DATE = Target.the("where we write the date of the appointment").
            located(By.id("datepicker"));
    public static final Target PATIENT_DOCUMENT = Target.the("where we write the patient document").
            located(By.xpath("//*[@id='page-wrapper']/div/div[3]/div/div[2]/input"));
    public static final Target DOCTOR_DOCUMENT = Target.the("where we write the doctor document").
            located(By.xpath("//*[@id='page-wrapper']/div/div[3]/div/div[3]/input"));
    public static final Target OBSERVATIONS = Target.the("where we write the observations").
            located(By.xpath("//*[@id='page-wrapper']/div/div[3]/div/div[4]/textarea"));
    public static final Target SAVE = Target.the("where we save").
            located(By.className("btn"));
}
