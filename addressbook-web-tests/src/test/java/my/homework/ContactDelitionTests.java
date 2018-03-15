package my.homework;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.TestBase;

public class ContactDelitionTests extends TestBase {

    @Test
    public void testContactDelition() {
        selectContact();
        deleteContact();
        closeModalWindow();
    }

}