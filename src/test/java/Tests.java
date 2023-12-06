import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.logevents.SelenideLogger.step;

import org.openqa.selenium.Keys;




public class Tests {
Mozabrick mozabrick = new Mozabrick();



    @Test
    void AddingAnItemToYourCart() {
        step("Test2", () -> {
        mozabrick.OpenSite()
                .ClickBuyDesigner()
                .ClickBuyOnTheFirstSet()
                .GoToCart()
                .MakeSureWeAreInTheCart();
        });
    }


    @Test
    void OpeningTheDeliveryPage() {
        step("Test3", () -> {
        mozabrick.OpenSite()
                .ClickDelivery()
                .TheDeliveryPageHasOpened();
        });
    }


}