package com.santiago845.screenplay.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class CheckoutPage {

    public static final Target FIRST_NAME = the("first name field")
            .located(By.id("first-name"));

    public static final Target LAST_NAME = the("last name field")
            .located(By.id("last-name"));

    public static final Target ZIP_POSTAL_CODE = the("zip or postal code field")
            .located(By.id("postal-code"));

    public static final Target FINISH = the("finish checkout button")
            .located(By.xpath("//*[@id='checkout_summary_container']/div/div[2]/div[8]/a[2]"));

}
