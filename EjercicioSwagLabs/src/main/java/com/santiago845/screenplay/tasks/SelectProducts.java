package com.santiago845.screenplay.tasks;
import com.santiago845.screenplay.userinterface.ProductsListPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectProducts implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(ProductsListPage.BACKPACK),
                Click.on(ProductsListPage.FLEECE_JACKET),
                Click.on(ProductsListPage.SHOP_CART));

    }

    public static SelectProducts toAddInTheShopCart() {
        return instrumented(SelectProducts.class);
    }
}
