package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ContainerCartPage {
    public static final Target PRODUCT1_CART = Target.the("Product1").locatedBy("//div[@class='inventory_item_name' and contains(.,'Sauce Labs Backpack')]");
    public static final Target PRODUCT2_CART = Target.the("Product2").locatedBy("//div[@class='inventory_item_name' and contains(.,'Sauce Labs Onesie')]");
}
