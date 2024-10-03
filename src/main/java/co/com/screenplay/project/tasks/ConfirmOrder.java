package co.com.screenplay.project.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static co.com.screenplay.project.ui.CheckoutPage.CONFIRM_ORDER_BUTTON;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConfirmOrder implements Task {

    @Override
    @Step("{0} confirms the order")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CONFIRM_ORDER_BUTTON)
        );
    }

    public static ConfirmOrder now() {
        return instrumented(ConfirmOrder.class);
    }
}
