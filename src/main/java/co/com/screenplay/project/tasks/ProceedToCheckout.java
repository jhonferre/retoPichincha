package co.com.screenplay.project.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static co.com.screenplay.project.ui.ShoppingCartPage.CHECKOUT_BUTTON;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ProceedToCheckout implements Task {

    public static ProceedToCheckout now() {
        return instrumented(ProceedToCheckout.class);
    }

    @Override
    @Step("{0} clicks on the checkout button")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CHECKOUT_BUTTON));
    }
}
