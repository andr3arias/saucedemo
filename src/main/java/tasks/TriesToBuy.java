package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.YourCartPage;

public class TriesToBuy implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(YourCartPage.BTN_CHECKOUT),
                Enter.keyValues("Andrea").into(YourCartPage.LBL_FIRSTNAME),
                Enter.keyValues("Arias").into(YourCartPage.LBL_LASTNAME),
                Enter.keyValues("440001").into(YourCartPage.LBL_ZIPCODE),
                Click.on(YourCartPage.BTN_CONTINUE),
                Click.on(YourCartPage.BTN_FINISH)
        );
    }

    public static TriesToBuy products(){
        return Tasks.instrumented(TriesToBuy.class);
    }
}
