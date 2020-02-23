package com.santiago845.screenplay.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actions.Open.url;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class OpenSwagLabsWebPageOn implements Task {

    private static final String WEB_PAGE = "https://www.saucedemo.com/";

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(url(WEB_PAGE));
    }

    public static OpenSwagLabsWebPageOn theBrowser() {
        return instrumented(OpenSwagLabsWebPageOn.class);
    }

}
