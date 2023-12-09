import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.*;

public class Mozabrick {


    public Mozabrick OpenSite(){
        open("https://mozabrick.ru/");
        return this;
    }

/*

1_OpeningTheDeliveryPage

*/


    public Mozabrick ClickDelivery(){
        $(".nav__item:nth-child(2)").click();
        return this;
    }

    public Mozabrick TheDeliveryPageHasOpened(){
        $(".delivery-hidden-xs > .delivery_city:nth-child(1) > .delivery_city_title").shouldHave(text("Москва и Область"));
        return this;
    }


/*

2_CheckingAnEmptyCart

*/


    public Mozabrick ClickOnCart(){
        $(".icon-cart > use").click();
        return this;
    }

    public Mozabrick StayedOnTheMainPage(){
        $(".promo__title").shouldHave(text("ФОТО-КОНСТРУКТОР MOZABRICK"));
        return this;
    }


/*

3_AddingAnItemToYourCart

*/



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



/*

 DeletingFromTheTrash() {


*/


    public Mozabrick ClickBuyAConstructor(){
          $(".nav__item:nth-child(1)").click();
        return this;
    }

    public Mozabrick ClickOnTheFirstSetToBuy(){
        $(byLinkText("Купить")).click();
        return this;
    }

    public Mozabrick ClickGoToCart(){
        $(".reviews__button").click();
        return this;
    }


    public Mozabrick MakeSureThatWeAreInTheBasket(){
        $(".basketPage__list-inner > .basketPage__title").shouldHave(text("КОРЗИНА"));
        return this;
    }

        public Mozabrick RemoveAnItemFromTheShoppingCart(){
            $(".fa-times-circle").click();
        return this;
    }

        public Mozabrick MakeSureThatTheTrashIsEmpty(){
            $("h1").shouldHave(text("Ваша корзина пуста!"));
        return this;
    }

/*
    ChangingTheCityToSaratov
*/


    public Mozabrick ClickOnTheNameOfTheCity(){
           $(".header__city-select-open:nth-child(4) > .header__city-select-open-value > .open-window2").click();
        return this;
    }


    public Mozabrick ClickOnTheLineSelectACity(){
         $("#cityNameField").click();
        return this;
    }


    public Mozabrick WeIntroduceTheCityOfSaratov(){
        $("#cityNameField").val("Саратов");
        return this;
    }



        public Mozabrick PressEnter(){
        $("#cityNameField").sendKeys(Keys.ENTER);
        return this;
    }



        public Mozabrick CheckingWhetherTheCityOfSaratovIsReallyThere(){
        $(".header__city-select-open:nth-child(4) > .header__city-select-open-value > .open-window2").shouldHave(text("Саратов"));
        return this;
    }

    public Mozabrick Sleep(){
        sleep(5000);
        return this;
    }




}
