package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {
    SelenideElement firstNameInput = $("#firstName");
    SelenideElement lastNameInput = $("#lastName");
    SelenideElement emailInput = $("#userEmail");
    SelenideElement genderButton = $($(byText("Female");
    SelenideElement userNumberInput = $("#userNumber");
    SelenideElement subjectInput = $("#subjectsInput");
    SelenideElement currentAddressInput = $("#currentAddress");
    SelenideElement stateInput = $("#state");
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
 public void typeGenderButton(){
        genderButton.click();
 }
    public void typeUserNumber(String value) {
        userNumberInput.val(value);
    }
    public void typeSubjectInput(String value){
        subjectInput.val(value).pressEnter();
    }
    public void typeCurrentAddress(String value){
        currentAddressInput.val(value);
    }

    public void typeStateInput() {
        stateInput.scrollIntoView(true).click();
        findByText("NCR").click();
    }

    public void typeCityInput() {
        cityInput.click();
        findByText("Delhi").click();
    }

    public SelenideElement findByText(String text) {
        return $(byText(text));
    }

    //
//    public void typeCityInput(String value) {
//        cityInput.val(value).pressEnter();
//    }


    public void clickSubmitButton() {
        submitButton.click();
    }

}
