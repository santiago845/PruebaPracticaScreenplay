package com.santiago845.screenplay.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class ProductsListPage {

    public static final Target BACKPACK = the("backpack add button")
            .located(By.xpath("//*[@id='inventory_container']/div/div[1]/div[3]/button"));

    public static final Target FLEECE_JACKET = the("fleece jacket add button")
            .located(By.xpath("//*[@id='inventory_container']/div/div[2]/div[3]/button"));

    public static final Target SHOP_CART = the("shop cart button")
            .located(By.id("shopping_cart_container"));

}
