package co.com.screenplay.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage extends PageObject {

    public static final Target ADD_TO_CART_BUTTON = Target.the("button to add to cart")
            .locatedBy("//a[text()='{0}']/ancestor::div[2]//span[text()='Add to Cart']");

    public static final Target SUCCESS_ADDED_MESSAGE = Target.the("success message for adding product")
            .locatedBy("//div[contains(text(), 'Success: You have added')]/a[text()='{0}']");

    public static final Target SHOPPING_CART_LINK = Target.the("link to shopping cart")
            .locatedBy("//a[text()='shopping cart']");
}
