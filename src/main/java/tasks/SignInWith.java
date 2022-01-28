package tasks;

import models.Users;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.SignInPage;

public class SignInWith implements Task {
    Users users;
    public SignInWith (Users users){
        this.users = users;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SignInPage.USER_NAME),
                Enter.keyValues(users.getUserName()).into(SignInPage.USER_NAME),
                Enter.keyValues(users.getPassword()).into(SignInPage.PASSWORD),
                Click.on(SignInPage.BTN_LOGIN)

        );
    }
    public static SignInWith herTargets(Users users){
        return Tasks.instrumented(SignInWith.class, users);
    }
}
