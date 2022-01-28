package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.SignInPage;

public class SignIn implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SignInPage.USER_NAME),
                Enter.keyValues("standard_user").into(SignInPage.USER_NAME),
                Enter.keyValues("secret_sauce").into(SignInPage.PASSWORD),
                Click.on(SignInPage.BTN_LOGIN)

        );
    }
    public static SignIn inTheApp(){
        return Tasks.instrumented(SignIn.class);
    }
}
