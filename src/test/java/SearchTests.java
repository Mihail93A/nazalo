import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.*;
import org.openqa.selenium.Keys;


public class SearchTests {

    @Test
    void Test1() {
        open("https://mozabrick.ru/");
        $(".nav__item:nth-child(2)").click();
        $(".delivery-hidden-xs > .delivery_city:nth-child(1) > .delivery_city_title").shouldHave(text("Москва и Область"));
    }

    @Test
    void Test2() {
        open("https://mozabrick.ru/");
        $(".icon-cart > use").click();
        $(".promo__title").shouldHave(text("ФОТО-КОНСТРУКТОР MOZABRICK"));
    }

    @Test
    void Test3() {
        open("https://mozabrick.ru/");
        $(".nav__item:nth-child(1)").click();
        $(byLinkText("Купить")).click();
        $(".reviews__button").click();
        $(".basketPage__list-inner > .basketPage__title").shouldHave(text("КОРЗИНА"));
    }

    @Test
    void Test4() {
        open("https://mozabrick.ru/");
        $(".nav__item:nth-child(1)").click();
        $(byLinkText("Купить")).click();
        $(".reviews__button").click();
        $(".basketPage__list-inner > .basketPage__title").shouldHave(text("КОРЗИНА"));
        $(".fa-times-circle").click();
        $("h1").shouldHave(text("Ваша корзина пуста!"));
    }

    @Test
    void Test5() {
        open("https://mozabrick.ru/");
        $(".header__city-select-open:nth-child(4) > .header__city-select-open-value > .open-window2").click();
        $("#cityNameField").click();
        $("#cityNameField").val("Саратов");
        sleep(5000);
        $("#cityNameField").sendKeys(Keys.ENTER);
        $(".header__city-select-open:nth-child(4) > .header__city-select-open-value > .open-window2").shouldHave(text("Саратов"));
    }
}