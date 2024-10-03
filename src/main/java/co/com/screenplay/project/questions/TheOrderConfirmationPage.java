package co.com.screenplay.project.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import static co.com.screenplay.project.ui.SuccessPage.ORDER_CONFIRMATION_MESSAGE;

public class TheOrderConfirmationPage implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return WebElementQuestion.the(ORDER_CONFIRMATION_MESSAGE).answeredBy(actor).isCurrentlyVisible();
    }

    public static TheOrderConfirmationPage isDisplayed() {
        return new TheOrderConfirmationPage();
    }
}
