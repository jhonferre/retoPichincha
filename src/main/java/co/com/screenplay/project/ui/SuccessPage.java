package co.com.screenplay.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SuccessPage extends PageObject {

    public static final Target ORDER_CONFIRMATION_MESSAGE = Target.the("order confirmation message")
            .locatedBy("//div[@id='content' and contains(., 'Your order has been placed!')]");

}
