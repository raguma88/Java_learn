package my.homework.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.tests.TestBase;

public class ContactDelitionTests extends TestBase {

    @Test
    public void testContactDelition() {
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteContact();
        app.getContactHelper().closeModalWindow();
    }

}