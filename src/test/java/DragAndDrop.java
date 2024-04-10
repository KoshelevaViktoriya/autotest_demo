import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.DragAndDropOptions;
import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DragAndDrop {

    //    Запрограммируйте Drag&Drop с помощью Selenide.actions()
//
// - Откройте https://the-internet.herokuapp.com/drag_and_drop
//- Перенесите прямоугольник А на место В
// - Проверьте, что прямоугольники действительно поменялись
// - В Selenide есть команда $(element).dragAndDrop($(to-element)),
// проверьте работает ли тест, если использовать её вместо actions()
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void moveTheSquare() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDrop(DragAndDropOptions.to($("#column-b")));


    }
}



