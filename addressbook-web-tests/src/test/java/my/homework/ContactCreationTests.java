package my.homework;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBaseContact {

    @Test
    public void testContactCreation() {

        initContactCreation();
        fillContactForm(new ContactData("Gulnara", "Rafikova", "Russia, Kazan", "89179153709"));
        submitContactCreation();
        returnToHomePage();
    }

}
