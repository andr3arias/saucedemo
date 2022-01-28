package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class YourCartPage {
    public static final Target BTN_CHECKOUT = Target.the("boton checkout").locatedBy("//*[@id='checkout']");
    public static final Target LBL_FIRSTNAME = Target.the("First Name").locatedBy("//*[@id='first-name']");
    public static final Target LBL_LASTNAME = Target.the("Last Name").locatedBy("//*[@id='last-name']");
    public static final Target LBL_ZIPCODE = Target.the("Zip Postal Code").locatedBy("//*[@id='postal-code']");
    public static final Target BTN_CONTINUE = Target.the("boton Continue").locatedBy("//*[@id='continue']");
    public static final Target BTN_FINISH = Target.the("Btn Finish").locatedBy("//*[@id='finish']");
    public static final Target MESSAGE_ORDER_COMPLETE = Target.the("Thank your for your order message").locatedBy("//*[@id='checkout_complete_container']");
}
