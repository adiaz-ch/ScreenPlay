package co.com.choucair.reto1.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

public class SelectInteraction implements Interaction {
    private Target lista;
    private String opcion;

    public SelectInteraction(Target lista, String opcion) {
        this.lista = lista;
        this.opcion = opcion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> listaOpciones = lista.resolveAllFor(actor);
        for (int i = 0; i < listaOpciones.size(); i++) {
            if (listaOpciones.get(i).getValue().trim().equalsIgnoreCase(opcion) || listaOpciones.get(i).getText().trim().equalsIgnoreCase(opcion)) {
                listaOpciones.get(i).click();
                break;
            }
        }
    }

    public static SelectInteraction theOption(Target lista, String opcion){
        return new SelectInteraction(lista, opcion);
    }
}
