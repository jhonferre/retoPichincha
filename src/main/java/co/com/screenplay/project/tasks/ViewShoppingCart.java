package co.com.screenplay.project.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static co.com.screenplay.project.ui.HomePage.SHOPPING_CART_LINK;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ViewShoppingCart implements Task {

    public static ViewShoppingCart view() {
        return instrumented(ViewShoppingCart.class);
    }

    @Override
    @Step("{0} clicks on the shopping cart link to view the list of products")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SHOPPING_CART_LINK));
    }
}
