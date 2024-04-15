package test.textFormTest;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import test.TestBase;

import static com.codeborne.selenide.Selenide.executeJavaScript;
import static com.codeborne.selenide.Selenide.open;
import static utils.RandomUtils.getRandomEmail;
import static utils.RandomUtils.getRandomString;

public class TextFormTestWithFaker extends TestBase {
    static Logger log = LoggerFactory.getLogger(TextFormTestWithPO.class);

    @Test
    void fillInputTest() {

       Faker faker = new Faker();

        String userName = faker.name().firstName(),
                lastName = faker.name().lastName(),
                userEmail = faker.internet().emailAddress();

        open("automation-practice-form");
        registrationPage.typeFirstName(userName);
        registrationPage.typeLastName(lastName);
        registrationPage.typeEmail(userEmail);
        executeJavaScript("window.scrollBy(0, 500);");
        registrationPage.typeGenderButton();
        registrationPage.typeUserNumber("+79992345678");
        //выбор даты рождения
        registrationPage.typeDateOfBirthday();//календарь
        registrationPage.typeMonthOfBirthday("10");//список месяцев
        registrationPage.typeYearOfBirthday("1992");//список с годом
        registrationPage.typeDayOfBirthday();   //выбор дня
        registrationPage.typeSubjectInput("Chemistry");
        registrationPage.typeHobbiesButton();
        registrationPage.typeSelectPicture("src/test/resources/cat.JPG");
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
