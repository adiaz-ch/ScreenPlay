package co.com.choucair.reto2.tasks;

import co.com.choucair.reto2.interactions.SelectFromTheMenu;
import co.com.choucair.reto2.userinterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Select implements Task {

    private String option;

    public Select(String option) {this.option = option;}

    public static Select menuOption(String option) {return Tasks.instrumented(Select.class, option);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(SelectFromTheMenu.theOption(HomePage.getMenuList(), option));
    }
}
