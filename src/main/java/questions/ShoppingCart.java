package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import userinterfaces.ContainerCartPage;

public class ShoppingCart implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(ContainerCartPage.PRODUCT1_CART).viewedBy(actor).asBoolean();
    }

    public static ShoppingCart validating(){
        return new ShoppingCart();
    }
}
