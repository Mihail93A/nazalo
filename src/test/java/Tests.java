import org.junit.jupiter.api.Order;
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
    @Order(1)
    void OpeningTheDeliveryPage() {
        mozabrick.OpenSite()
                .ClickDelivery()
                .TheDeliveryPageHasOpened();
    }

    @Test
    @Order(2)
    void CheckingAnEmptyCart() {
        mozabrick.OpenSite()
                 .ClickOnCart()
                 .StayedOnTheMainPage();
    }

    @Test
    @Order(3)
    void AddingAnItemToYourCart() {
        mozabrick.OpenSite()
                 .ClickBuyDesigner()
                 .ClickBuyOnTheFirstSet()
                 .GoToCart()
                 .MakeSureWeAreInTheCart();
    }

    @Test
    @Order(4)
    void DeletingFromTheTrash() {
        mozabrick.OpenSite()
                 .ClickBuyAConstructor()
                 .ClickOnTheFirstSetToBuy()
                 .ClickGoToCart()
                 .MakeSureThatWeAreInTheBasket()
                 .RemoveAnItemFromTheShoppingCart()
                 .MakeSureThatTheTrashIsEmpty();
    }


    @Test
    @Order(5)
    void ChangingTheCityToSaratov() {
         mozabrick.OpenSite()
                 .ClickOnTheNameOfTheCity()
                 .ClickOnTheLineSelectACity()
                 .WeIntroduceTheCityOfSaratov()
                 .Sleep()
                 .PressEnter()
                 .CheckingWhetherTheCityOfSaratovIsReallyThere();
    }

}