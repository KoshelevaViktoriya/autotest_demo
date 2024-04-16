package test.textFormTest;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import test.TestBase;

import static com.codeborne.selenide.Selenide.executeJavaScript;
import static com.codeborne.selenide.Selenide.open;
import static java.lang.Thread.sleep;

public class TextFormTestWithFaker extends TestBase {
    static Logger log = LoggerFactory.getLogger(TextFormTestWithPO.class);

    @Test
    void fillInputTest() throws InterruptedException {

        Faker faker = new Faker();

        String userName = faker.name().firstName(),
                lastName = faker.name().lastName(),
                userEmail = faker.internet().emailAddress(),
                userAddress = faker.address().fullAddress(),
                userNumber = "+7" + faker.number().numberBetween(100000, 9999999);



        open("automation-practice-form");
        registrationPage.typeFirstName(userName);
        registrationPage.typeLastName(lastName);
        registrationPage.typeEmail(userEmail);
        executeJavaScript("window.scrollBy(0, 500);");
        registrationPage.typeGenderButton();
        registrationPage.typeUserNumber(userNumber);
        //выбор даты рождения
        registrationPage.typeDateOfBirthday();//календарь
        registrationPage.typeMonthOfBirthday("10");//список месяцев
        registrationPage.typeYearOfBirthday("1992");//список с годом
        registrationPage.typeDayOfBirthday();   //выбор дня
        registrationPage.typeSubjectInput("Chemistry");
        registrationPage.typeHobbiesButton();
        registrationPage.typeSelectPicture("src/test/resources/cat.JPG");
        //$("[for='uploadPicture']").uploadFile(new File("src/test/resources/cat.JPG"));
        registrationPage.typeCurrentAddress(userAddress);
        registrationPage.typeStateInput();
        registrationPage.typeCityInput();
        registrationPage.clickSubmitButton();

        sleep(5000);


//        @AfterEach
//        static void closeBrowser() {
//            closeWebDriver();
//        }
    }


}
