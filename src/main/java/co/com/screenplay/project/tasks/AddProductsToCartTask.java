package co.com.screenplay.project.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import java.util.List;

import static co.com.screenplay.project.ui.HomePage.ADD_TO_CART_BUTTON;
import static co.com.screenplay.project.ui.HomePage.SUCCESS_ADDED_MESSAGE;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddProductsToCartTask implements Task {
    private final List<String> productNames;

    public AddProductsToCartTask(List<String> productNames) {
        this.productNames = productNames;
    }

    public static AddProductsToCartTask withProducts(List<String> productNames) {
        return instrumented(AddProductsToCartTask.class, productNames);
    }

    @Override
    @Step("{0} adds products to the cart: #productNames")
    public <T extends Actor> void performAs(T actor) {
        productNames.forEach(productName -> actor.attemptsTo(Scroll.to(ADD_TO_CART_BUTTON.of(productName)),
                Click.on(ADD_TO_CART_BUTTON.of(productName)),
                WaitUntil.the(SUCCESS_ADDED_MESSAGE.of(productName), isVisible()).forNoMoreThan(5).seconds()));
    }
}
