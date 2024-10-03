package co.com.screenplay.project.tasks;

import com.github.javafaker.Faker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.thucydides.core.annotations.Step;

import static co.com.screenplay.project.ui.CheckoutPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillBillingDetailsForm implements Task {

    private final Faker faker = new Faker();

    @Override
    @Step("{0} fills the billing details form with random values")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(faker.name().firstName()).into(FIRST_NAME_FIELD),
                Enter.theValue(faker.name().lastName()).into(LAST_NAME_FIELD),
                Enter.theValue(faker.internet().emailAddress()).into(EMAIL_FIELD),
                Enter.theValue(faker.phoneNumber().cellPhone()).into(TELEPHONE_FIELD),
                Enter.theValue(faker.address().streetAddress()).into(ADDRESS_FIELD),
                Enter.theValue(faker.address().city()).into(CITY_FIELD),
                Enter.theValue(faker.address().zipCode()).into(POSTCODE_FIELD),
                SelectFromOptions.byVisibleText("Colombia").from(COUNTRY_DROPDOWN),
                SelectFromOptions.byVisibleText("Antioquia").from(REGION_DROPDOWN),
                Click.on(GUEST_CONTINUE_BUTTON)
        );
    }

    public static FillBillingDetailsForm withRandomValues() {
        return instrumented(FillBillingDetailsForm.class);
    }
}