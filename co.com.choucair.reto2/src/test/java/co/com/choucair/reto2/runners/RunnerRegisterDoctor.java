package co.com.choucair.reto2.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/register_doctor.feature",
        tags = "@scenario1",
        glue = "co.com.choucair.reto2.stepdefinitions",
        snippets = SnippetType.CAMELCASE )
public class RunnerRegisterDoctor {
}
