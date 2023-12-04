import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Mozabrick {


    public Mozabrick OpenSite(){
        open("https://mozabrick.ru/");
        return this;
    }




    public Mozabrick ClickDelivery(){
        $(".nav__item:nth-child(2)").click();
        return this;
    }

    public Mozabrick TheDeliveryPageHasOpened(){
        $(".delivery-hidden-xs > .delivery_city:nth-child(1) > .delivery_city_title").shouldHave(text("Москва и Область"));
        return this;
    }




    public Mozabrick ClickOnCart(){
        $(".icon-cart > use").click();
        return this;
    }

    public Mozabrick StayedOnTheMainPage(){
        $(".promo__title").shouldHave(text("ФОТО-КОНСТРУКТОР MOZABRICK"));
        return this;
    }





    public Mozabrick ClickBuyDesigner(){
        $(".nav__item:nth-child(1)").click();
        return this;
    }

    public Mozabrick ClickBuyOnTheFirstSet(){
        $(byLinkText("Купить")).click();
        return this;
    }
    public Mozabrick GoToCart(){
        $(".reviews__button").click();
        return this;
    }

    public Mozabrick MakeSureWeAreInTheCart(){
        $(".basketPage__list-inner > .basketPage__title").shouldHave(text("КОРЗИНА"));
        return this;
    }







}
