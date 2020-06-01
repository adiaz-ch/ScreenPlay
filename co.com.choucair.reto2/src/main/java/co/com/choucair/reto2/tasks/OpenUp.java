package co.com.choucair.reto2.tasks;

import co.com.choucair.reto2.userinterface.AplicativoAdministracionHospitales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {

    private AplicativoAdministracionHospitales aplicativoAdministracionHospitales;

    public static OpenUp thaPage() {return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(aplicativoAdministracionHospitales));
    }
}