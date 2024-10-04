package co.com.screenplay.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CheckoutPage extends PageObject {

    public static final Target GUEST_CHECKOUT_RADIO_BUTTON = Target.the("radio button for Guest Checkout")
            .locatedBy("//input[@value='guest']");

    public static final Target ACCOUNT_CONTINUE_BUTTON = Target.the("button to continue with account creation")
            .locatedBy("//input[@id='button-account' and @value='Continue']");

    public static final Target FIRST_NAME_FIELD = Target.the("first name field")
            .locatedBy("//input[@id='input-payment-firstname']");

    public static final Target LAST_NAME_FIELD = Target.the("last name field")
            .locatedBy("//input[@id='input-payment-lastname']");

    public static final Target EMAIL_FIELD = Target.the("email field")
            .locatedBy("//input[@id='input-payment-email']");

    public static final Target TELEPHONE_FIELD = Target.the("telephone field")
            .locatedBy("//input[@id='input-payment-telephone']");

    public static final Target ADDRESS_FIELD = Target.the("address field")
            .locatedBy("//input[@id='input-payment-address-1']");

    public static final Target CITY_FIELD = Target.the("city field")
            .locatedBy("//input[@id='input-payment-city']");

    public static final Target POSTCODE_FIELD = Target.the("postcode field")
            .locatedBy("//input[@id='input-payment-postcode']");

    public static final Target COUNTRY_DROPDOWN = Target.the("dropdown to select country")
            .locatedBy("//select[@id='input-payment-country']");

    public static final Target REGION_DROPDOWN = Target.the("dropdown to select region or state")
            .locatedBy("//select[@id='input-payment-zone']");

    public static final Target GUEST_CONTINUE_BUTTON = Target.the("button to continue as guest")
            .locatedBy("//input[@id='button-guest' and @value='Continue']");

    public static final Target SHIPPING_METHOD_CONTINUE_BUTTON = Target.the("button to continue with shipping method")
            .locatedBy("//input[@id='button-shipping-method' and @value='Continue']");

    public static final Target PAYMENT_METHOD_CONTINUE_BUTTON = Target.the("button to continue with payment method")
            .locatedBy("//input[@id='button-payment-method' and @value='Continue']");

    public static final Target AGREE_CHECKBOX = Target.the("checkbox to agree to terms and conditions")
            .locatedBy("//input[@type='checkbox' and @name='agree' and @value='1']");

    public static final Target CONFIRM_ORDER_BUTTON = Target.the("button to confirm order")
            .locatedBy("//input[@id='button-confirm' and @value='Confirm Order']");

}
