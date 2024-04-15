package test.textFormTest;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTest {



    //https://demoqa.com/text-box
    @Test
    void fillFormTest() {
        open("text-box");
        $("[id=userName]").setValue("Ivan Ivanov"); //id=#
        $("#userEmail").setValue("eee@mail.com");
        $("#currentAddress").setValue("Pushkina street 7");
        $("#permanentAddress").setValue("Lesnaya 10");
        $("#submit").click();

        $("#output").shouldHave(text("Ivan Ivanov"), text("eee@mail.com"), text("Pushkina street 7"), text("Lesnaya 10"));
    }
}
