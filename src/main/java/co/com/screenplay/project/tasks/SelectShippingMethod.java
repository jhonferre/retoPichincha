package co.com.screenplay.project.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static co.com.screenplay.project.ui.CheckoutPage.SHIPPING_METHOD_CONTINUE_BUTTON;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectShippingMethod implements Task {

    @Override
    @Step("{0} selects the shipping method and continues")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SHIPPING_METHOD_CONTINUE_BUTTON)
        );
    }

    public static SelectShippingMethod andContinue() {
        return instrumented(SelectShippingMethod.class);
    }
}
