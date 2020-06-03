package co.com.choucair.winappdriver.calculadora.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/add.feature",
        glue = {"co.com.choucair.winappdriver.calculadora.stepdefinitions","co.com.choucair.winappdriver.calculadora.utils"},
        snippets = SnippetType.CAMELCASE
)
public class RunnerAdd {
}
