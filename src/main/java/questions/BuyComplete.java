package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import userinterfaces.YourCartPage;

public class BuyComplete implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Visibility.of(YourCartPage.MESSAGE_ORDER_COMPLETE).viewedBy(actor).asBoolean();
    }

    public static BuyComplete message(){
        return new BuyComplete();
    }
}
