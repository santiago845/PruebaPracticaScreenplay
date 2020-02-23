package com.santiago845.screenplay.tasks;

import com.santiago845.screenplay.model.SwagLabsAccount;
import com.santiago845.screenplay.userinterface.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {

    private String username;
    private String password;

    public Login(SwagLabsAccount swagLabsAccount) {
        this.username = swagLabsAccount.name();
        this.password = swagLabsAccount.password();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(username).into(LoginPage.USERNAME),
                Enter.theValue(password).into(LoginPage.PASSWORD).thenHit(Keys.ENTER));
    }

    public static Login withCredentials(SwagLabsAccount swagLabsAccount) {
        return instrumented(Login.class, swagLabsAccount);
    }
}
