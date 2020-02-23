package com.santiago845.screenplay.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class ShopCartPage {

    public static final Target CHECKOUT = the("checkout button")
            .located(By.xpath("//*[@id='cart_contents_container']/div/div[2]/a[2]"));

}
