import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.*;
import org.openqa.selenium.Keys;

public class Tests {
Mozabrick mozabrick = new Mozabrick();


    @Test
    void CheckingAnEmptyCart() {
        mozabrick.OpenSite()
                .ClickOnCart()
                .StayedOnTheMainPage();
    }

    @Test
    void OpeningTheDeliveryPage() {
        mozabrick.OpenSite()
                .ClickDelivery()
                .TheDeliveryPageHasOpened();
    }


    @Test
    void AddingAnItemToYourCart() {
        mozabrick.OpenSite()
                 .ClickBuyDesigner()
                 .ClickBuyOnTheFirstSet()
                 .GoToCart()
                 .MakeSureWeAreInTheCart();
    }

}