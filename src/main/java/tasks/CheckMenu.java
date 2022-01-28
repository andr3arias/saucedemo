package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.MenuOptionsPage;

public class CheckMenu implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MenuOptionsPage.BTN_MENU),
                Click.on(MenuOptionsPage.ALL_ITEMS)
        );
    }
    public static CheckMenu AllItems(){
        return Tasks.instrumented(CheckMenu.class);
    }
}
