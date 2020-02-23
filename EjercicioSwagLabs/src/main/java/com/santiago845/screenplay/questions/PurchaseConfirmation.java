package com.santiago845.screenplay.questions;

import com.santiago845.screenplay.userinterface.ConfirmationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class PurchaseConfirmation implements Question {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ConfirmationPage.CONFIRMATION_MESSAGE).viewedBy(actor).asString();
    }

    public static  PurchaseConfirmation message(){
        return new PurchaseConfirmation();
    }
}
