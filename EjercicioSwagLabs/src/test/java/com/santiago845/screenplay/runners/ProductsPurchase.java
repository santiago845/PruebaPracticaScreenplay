package com.santiago845.screenplay.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/products_purchase.feature",
        glue = "com.santiago845.screenplay.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class ProductsPurchase {

}
