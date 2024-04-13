package pages;

import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {
    SelenideElement firstNameInput = $("#firstName");
    SelenideElement lastNameInput = $("#lastName");
    SelenideElement emailInput = $("#userEmail");
    SelenideElement genderButton = $(byText("Female"));
    SelenideElement userNumberInput = $("#userNumber");

    SelenideElement dateOfBirthdayInput = $("#dateOfBirthInput");
    SelenideElement monthOfBirthdayInput = $(byClassName("react-datepicker__month-select"));
    SelenideElement yearOfBirthdayInput = $(byClassName("react-datepicker__year-select"));
    SelenideElement dayOfBirthdayInput = $(byClassName("react-datepicker__day--019"));
    SelenideElement subjectInput = $("#subjectsInput");
    SelenideElement hobbiesButton = $("[for='hobbies-checkbox-3']");
    SelenideElement addPicture = $("#uploadPicture");
    SelenideElement currentAddressInput = $("#currentAddress");
    SelenideElement stateInput = $("#state");
    SelenideElement stateSelect = $(byText("NCR"));
    SelenideElement cityInput = $("#react-select-4-input");
    SelenideElement submitButton = $("#submit");


    //    void typeFirstName(){
//        firstNameInput.val("aaa");
//    }
    public void typeFirstName(String value) {
        firstNameInput.val(value);
    }

    public void typeLastName(String value) {
        lastNameInput.val(value);
    }

    public void typeEmail(String value) {
        emailInput.val(value);
    }

    public void typeGenderButton() {
        genderButton.click();
    }

    public void typeUserNumber(String value) {
        userNumberInput.val(value);
    }

    public void typeDateOfBirthday() {
        dateOfBirthdayInput.click();
    }

    public void typeMonthOfBirthday(String value) {
        monthOfBirthdayInput.click();
        monthOfBirthdayInput.selectOptionByValue(value);
    }

    public void typeYearOfBirthday(String value) {
        yearOfBirthdayInput.click();
        yearOfBirthdayInput.selectOptionByValue(value);
    }

    public void typeDayOfBirthday() {
        dayOfBirthdayInput.click();
    }


    public void typeSubjectInput(String value) {
        subjectInput.val(value).pressEnter();
    }
    public void typeHobbiesButton(){
        hobbiesButton.click();
    }
    public void typeSelectPicture(String value){
        addPicture.uploadFile(new File(value));
    }

    public void typeCurrentAddress(String value) {
        currentAddressInput.val(value);
    }

    public void typeStateInput() {
        stateInput.scrollIntoView(true).click();
        stateSelect.click();
    }

    public void typeCityInput() {
        cityInput.setValue("Delhi").pressEnter();
    }

    //
//    public void typeCityInput(String value) {
//        cityInput.val(value).pressEnter();
//    }


    public void clickSubmitButton() {
        submitButton.click();
    }

}
