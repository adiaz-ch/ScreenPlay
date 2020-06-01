package co.com.choucair.reto2.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;


public class SelectFromTheMenu implements Interaction {

    private Target menuList;
    private String option;

    public SelectFromTheMenu(Target menuList, String option) {
        this.menuList = menuList;
        this.option = option;
    }

    public static SelectFromTheMenu theOption(Target menuList, String option) {
        return new SelectFromTheMenu(menuList, option);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> menu_list = menuList.resolveAllFor(actor);
        for (int i = 0; i < menu_list.size(); i++){
            if (menu_list.get(i).getText().trim().equalsIgnoreCase(option)){
                menu_list.get(i).click();
                break;
            }
        }
    }
}
