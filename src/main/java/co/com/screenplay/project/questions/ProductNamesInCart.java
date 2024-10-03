package co.com.screenplay.project.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;
import java.util.stream.Collectors;

import static co.com.screenplay.project.ui.ShoppingCartPage.PRODUCT_NAMES_IN_CART;

public class ProductNamesInCart implements Question<List<String>> {

    @Override
    public List<String> answeredBy(Actor actor) {
        List<WebElementFacade> elements = PRODUCT_NAMES_IN_CART.resolveAllFor(actor);
        return elements.stream()
                .map(WebElementFacade::getText)
                .collect(Collectors.toList());
    }

    public static ProductNamesInCart displayed() {
        return new ProductNamesInCart();
    }
}
