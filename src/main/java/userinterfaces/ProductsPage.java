package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ProductsPage {
    public static final Target PRODUCT1 = Target.the("Sauce Labs Backpack").locatedBy("//*[@id='add-to-cart-sauce-labs-backpack']");
    public static final Target PRODUCT2 = Target.the("Sauce Labs Onesie").locatedBy("//*[@id='add-to-cart-sauce-labs-onesie']");
    public static final Target BTN_CART = Target.the("Shopping cart container").locatedBy("//*[@id='shopping_cart_container']");
    public static final Target PRODUCT_SORT_CONTAINER = Target.the("¨Product Sort").locatedBy("//select[@class='product_sort_container']");

}
