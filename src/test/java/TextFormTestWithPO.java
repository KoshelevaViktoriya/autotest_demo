import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import pages.RegistrationPage;

import java.io.File;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TextFormTestWithPO {
    static Logger log = LoggerFactory.getLogger(TextFormTestWithPO.class);
    RegistrationPage registrationPage = new RegistrationPage();

    @BeforeAll
    static void beforeAll() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920*1080";
        Configuration.baseUrl = "https://demoqa.com/";
    }


    @Test
    void fillInputTest() {
        open("automation-practice-form");
        registrationPage.typeFirstName("Viktoriya");
        registrationPage.typeLastName("Kosheleva");
        registrationPage.typeEmail("email@com");
        executeJavaScript("window.scrollBy(0, 500);");

        $(byText("Female")).click();

        registrationPage.typeUserNumber("+79992345678");


        //выбор даты рождения
        $("#dateOfBirthInput").click();     //календарь
        $(byClassName("react-datepicker__month-select")).click();   //список месяцев
        $(byClassName("react-datepicker__month-select")).selectOptionByValue("10");
        $(byClassName("react-datepicker__year-select")).click();    //список с годом
        $(byClassName("react-datepicker__year-select")).selectOptionByValue("1995");
        $(byClassName("react-datepicker__day--019")).click();   //выбор дня
        registrationPage.typeSubjectInput("Chemistry");

        $("[for='hobbies-checkbox-3']").click();
        $("#uploadPicture").uploadFile(new File("src/test/resources/cat.JPG"));
        //$("[for='uploadPicture']").uploadFile(new File("src/test/resources/cat.JPG"));

        registrationPage.typeCurrentAddress("CurrentAddress");
        registrationPage.typeStateInput();
        registrationPage.typeCityInput();
        registrationPage.clickSubmitButton();


//        @AfterEach
//        static void closeBrowser() {
//            closeWebDriver();
//        }
    }


}
