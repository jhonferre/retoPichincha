package co.com.screenplay.project.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static co.com.screenplay.project.ui.CheckoutPage.AGREE_CHECKBOX;
import static co.com.screenplay.project.ui.CheckoutPage.PAYMENT_METHOD_CONTINUE_BUTTON;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectPaymentMethod implements Task {

    @Override
    @Step("{0} agrees to terms and conditions and selects the payment method")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AGREE_CHECKBOX),
                Click.on(PAYMENT_METHOD_CONTINUE_BUTTON)
        );
    }

    public static SelectPaymentMethod andContinue() {
        return instrumented(SelectPaymentMethod.class);
    }
}
