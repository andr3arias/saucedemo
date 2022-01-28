package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SignInPage {
    public static final Target USER_NAME = Target.the("Username").locatedBy("//*[@id='user-name']");
    public static final Target PASSWORD = Target.the("Password").locatedBy("//*[@id='password']");
    public static final Target BTN_LOGIN = Target.the("Button Login").locatedBy("//*[@id='login-button']");
}
