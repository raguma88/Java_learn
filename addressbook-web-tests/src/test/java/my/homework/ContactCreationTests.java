package my.homework;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.TestBase;

public class ContactCreationTests extends TestBase{

  @Test
  public void testContactCreation() {

    initContactCreation();
    fillContactForm(new ContactData("Gulnara", "Rafikova", "Russia, Kazan", "89179153709"));
    submitContactCreation();
    returnToHomePage();
  }

}