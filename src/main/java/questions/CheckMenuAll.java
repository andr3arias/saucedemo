package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import userinterfaces.ProductsPage;

public class CheckMenuAll implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(ProductsPage.PRODUCT_SORT_CONTAINER).viewedBy(actor).asBoolean();
    }
    public static CheckMenuAll items(){
        return new CheckMenuAll();
    }
}
