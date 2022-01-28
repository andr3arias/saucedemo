package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.MenuOptionsPage;

public class Validate implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MenuOptionsPage.BTN_MENU),
                Click.on(MenuOptionsPage.ABOUT)
        );
    }
    public static Validate about(){
        return Tasks.instrumented(Validate.class);
    }
}
