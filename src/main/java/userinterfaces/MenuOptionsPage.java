package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MenuOptionsPage {
    public static final Target BTN_MENU = Target.the("Boton Menu").locatedBy("//*[@id='react-burger-menu-btn']");
    public static final Target ALL_ITEMS = Target.the("All items menu").locatedBy("//*[@id='inventory_sidebar_link']");
    public static final Target ABOUT = Target.the("About Menu").locatedBy("//*[@id='about_sidebar_link']");
    public static final Target LOGOUT = Target.the("Log Out Menu").locatedBy("//*[@id='logout_sidebar_link']");
    public static final Target RESET_APP = Target.the("Reset app State").locatedBy("//*[@id='reset_sidebar_link']");

}
