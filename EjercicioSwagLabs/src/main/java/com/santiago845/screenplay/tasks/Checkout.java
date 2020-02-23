package com.santiago845.screenplay.tasks;

import com.santiago845.screenplay.model.ClientInformation;
import com.santiago845.screenplay.model.SwagLabsAccount;
import com.santiago845.screenplay.userinterface.CheckoutPage;
import com.santiago845.screenplay.userinterface.ShopCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Checkout implements Task {

    private String firstName;
    private String lastName;
    private String zipPostalCode;

    public Checkout(ClientInformation clientInformation) {
        this.firstName = clientInformation.firstName();
        this.lastName = clientInformation.lastName();
        this.zipPostalCode = clientInformation.zipPostalCode();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(ShopCartPage.CHECKOUT),
                Enter.theValue(firstName).into(CheckoutPage.FIRST_NAME),
                Enter.theValue(lastName).into(CheckoutPage.LAST_NAME),
                Enter.theValue(zipPostalCode).into(CheckoutPage.ZIP_POSTAL_CODE).thenHit(Keys.ENTER),
                Click.on(CheckoutPage.FINISH));

    }

    public static Checkout purchase(ClientInformation clientInformation) {
        return instrumented(Checkout.class, clientInformation);
    }
}
