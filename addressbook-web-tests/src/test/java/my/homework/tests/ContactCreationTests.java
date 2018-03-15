package my.homework.tests;

import my.homework.model.ContactData;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.tests.TestBase;

public class ContactCreationTests extends TestBase{

  @Test
  public void testContactCreation() {

    app.initContactCreation();
    app.fillContactForm(new ContactData("Gulnara", "Rafikova", "Russia, Kazan", "89179153709"));
    app.submitContactCreation();
    app.returnToHomePage();
  }

}