package co.com.screenplay.project.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Attribute;
import net.thucydides.core.annotations.Step;

import static co.com.screenplay.project.ui.CheckoutPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectGuestCheckout implements Task {

    @Override
    @Step("{0} selects the Guest Checkout radio button if not already selected")
    public <T extends Actor> void performAs(T actor) {
        String isChecked = Attribute.of(GUEST_CHECKOUT_RADIO_BUTTON).named("checked").answeredBy(actor);
        if (!"checked".equals(isChecked)) {
            actor.attemptsTo(Click.on(GUEST_CHECKOUT_RADIO_BUTTON));
        }
        actor.attemptsTo(Click.on(ACCOUNT_CONTINUE_BUTTON));
    }

    public static SelectGuestCheckout ifNotSelected() {
        return instrumented(SelectGuestCheckout.class);
    }
}
