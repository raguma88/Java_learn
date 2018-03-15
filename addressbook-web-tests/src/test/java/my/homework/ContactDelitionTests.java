package my.homework;

import org.testng.annotations.Test;

public class ContactDelitionTests extends TestBaseContact {

    @Test
    public void testContactDelition() {

        selectContact();
        deleteSelectedGroups();
        closeModalWindow();
    }

}
