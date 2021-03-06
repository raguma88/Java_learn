package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Contacts;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.model.Groups;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContactAdditionInGroupTests extends TestBase {

  @BeforeMethod
  public void ensurePreconditions() {
   // app.goTo().groupPage();
    if (app.db().groups().size() == 0) {   //если кол-во групп в БД = 0
      app.goTo().groupPage();
      app.group().create(new GroupData().withName("test1"));
    }
    //app.goTo().homePage();
    if (app.db().contacts().size() == 0) {  //если кол-во контактов в БД = 0
      app.goTo().homePage();
      app.contact().create(new ContactData().withName("Gulnara").withLastname("Rafikova")
              .withAddress("Kazan"),true);
    }
  }

  @Test
  public void testContactAdditionInGroup() {
    Contacts contacts = app.db().contacts();
    Groups groups = app.db().groups();
    ContactData editedContact = app.contact().searchContactForGroup(contacts, groups); //получаем любой контакт, который не входит хотя бы в одну грппу
    GroupData group = app.contact().groupForContact(editedContact, groups); //получаем любую группу, в которую не входит указанный контакт
    ContactData before = app.db().contact(editedContact.getId());
    app.goTo().homePage();
    app.contact().addContactInGroup(editedContact);
    ContactData after = app.db().contact(editedContact.getId());
    assertThat(before.getGroups(), equalTo(after.getGroups().without(group)));

  }
}
