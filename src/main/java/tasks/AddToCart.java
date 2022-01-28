package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.ProductsPage;

public class AddToCart implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ProductsPage.PRODUCT1),
                Click.on(ProductsPage.PRODUCT2),
                Click.on(ProductsPage.BTN_CART)
        );
    }
    public static AddToCart container(){
        return Tasks.instrumented(AddToCart.class);
    }
}
