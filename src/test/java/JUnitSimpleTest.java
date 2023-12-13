import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class JUnitSimpleTest {



    @CsvSource({
            "Allure testops, https://qameta.io",
            "Selenide, https://selenide.org"
    })
    @ParameterizedTest(name = "Адрес {1} должен быть в выдаче гугла по запосу{0}")
    void productSiteUrlShouldBePresentInResultsOfSearchInGoogleByProductNameQery(
            String productName,
            String productUrl
    ) {
        open("https://google.com");
$("[name=q]").setValue(productName).pressEnter();
$("[id=search]").shouldHave(text(productUrl));
    }
}