package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import userinterfaces.SauceLabsPage;

public class ValidateMenu implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(SauceLabsPage.WELLCOME_MESSAGE).viewedBy(actor).asBoolean();
    }
    public static ValidateMenu about(){
        return new ValidateMenu();
    }
}
