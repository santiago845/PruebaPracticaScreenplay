package com.santiago845.screenplay.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import static net.serenitybdd.screenplay.targets.Target.the;

public class ConfirmationPage {

    public static final Target CONFIRMATION_MESSAGE = the("succesfull purchase confirmation message")
            .located(By.xpath("//*[@id='checkout_complete_container']/div[1]"));

}
