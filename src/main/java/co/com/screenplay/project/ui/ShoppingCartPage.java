package co.com.screenplay.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ShoppingCartPage extends PageObject {

    public static final Target PRODUCT_NAMES_IN_CART = Target.the("Product names in cart")
            .locatedBy("//div[@class='table-responsive']//tbody/tr/td[2]/a");

    public static final Target CHECKOUT_BUTTON = Target.the("button to proceed to checkout")
            .locatedBy("//a[text()='Checkout']");

}
