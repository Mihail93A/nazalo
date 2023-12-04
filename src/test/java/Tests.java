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
    void OpeningTheDeliveryPage() {
        mozabrick.OpenSite()
                .ClickDelivery()
                .TheDeliveryPageHasOpened();
    }

    @Test
    void CheckingAnEmptyCart() {
        mozabrick.OpenSite()
                 .ClickOnCart()
                 .StayedOnTheMainPage();
    }

    @Test
    void Test3() {
        mozabrick.OpenSite()
                 .ClickBuyDesigner()
                 .ClickBuyOnTheFirstSet()
                 .GoToCart()
                 .MakeSureWeAreInTheCart();
    }

    @Test
    void Test4() {
        new Mozabrick().OpenSite();
        $(".nav__item:nth-child(1)").click();
        $(byLinkText("Купить")).click();
        $(".reviews__button").click();
        $(".basketPage__list-inner > .basketPage__title").shouldHave(text("КОРЗИНА"));
        $(".fa-times-circle").click();
        $("h1").shouldHave(text("Ваша корзина пуста!"));
    }

    @Test
    void Test5() {
        new Mozabrick().OpenSite();
        $(".header__city-select-open:nth-child(4) > .header__city-select-open-value > .open-window2").click();
        $("#cityNameField").click();
        $("#cityNameField").val("Саратов");
        sleep(5000);
        $("#cityNameField").sendKeys(Keys.ENTER);
        $(".header__city-select-open:nth-child(4) > .header__city-select-open-value > .open-window2").shouldHave(text("Саратов"));
    }
}