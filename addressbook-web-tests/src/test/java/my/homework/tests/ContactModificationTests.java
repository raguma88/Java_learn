package my.homework.tests;

import my.homework.model.ContactData;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.tests.TestBase;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification() {
    app.getContactHelper().selectContact();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("Gulnara", "Rafikova", "Russia, RT, Kazan", "89179151010"));
    app.getContactHelper().submitContactModification();
    app.getReturntoHomeHelper().returnToHomePage();
  }
}
