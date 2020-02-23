package com.santiago845.screenplay.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class LoginPage {

    public static final Target USERNAME = the("username field")
            .located(By.id("user-name"));

    public static final Target PASSWORD = the("password field")
            .located(By.id("password"));

}
