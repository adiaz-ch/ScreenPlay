package co.com.choucair.certification.cursoscreenplay.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("button to select Universidad Choucair").
            located(By.id("universidad"));

    public static final Target INPUT_COURSE = Target.the("where we write the name of course").
            located(By.id("coursesearchbox"));

    public static final Target BUTTON_GO = Target.the("button to search the course").
            located(By.xpath("//*[@id='coursesearch']/fieldset/button"));

    public static final Target SELECT_COURSE = Target.the("button to select the course").
            located(By.xpath("//*[@id='category-course-list']/div/div[2]/div/div[1]/div"));

    public static final Target NAME_COURSE = Target.the("Name course").
            located(By.xpath("//*[@id='page-header']/div/div/div[2]/div[1]/div/a/div/div/h1"));
}
