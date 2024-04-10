import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WikiSelenideTest {
//    Разработайте следующий автотест:
//
//  - Откройте страницу Selenide в Github
//
// - Перейдите в раздел Wiki проекта
//
// - Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
//
// - Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void searchPage() {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-pages-filter").setValue("SoftAssertions");
        $(".filterable-active").shouldHave(text("SoftAssertions"));
        $(byText("SoftAssertions")).click();
        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class:"));
    }
    }

