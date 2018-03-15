package my.homework.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.tests.TestBase;

public class ContactDelitionTests extends TestBase {

    @Test
    public void testContactDelition() {
        app.selectContact();
        app.deleteContact();
        app.closeModalWindow();
    }

}