package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Contacts;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.model.Groups;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContactDeletionFromGroup extends TestBase {

  @BeforeMethod
  public void ensurePreconditions() {
    if (app.db().groups().size() == 0) {   //если кол-во групп в БД = 0
      app.goTo().groupPage();
      app.group().create(new GroupData().withName("test1"));
      app.goTo().homePage();
    }

    if (app.db().contacts().size() == 0) {  //если кол-во контактов в БД = 0
      app.goTo().homePage();
      Groups groups = app.db().groups();
      app.contact().create(new ContactData().withName("Gulnara").withLastname("Rafikova")
              .withAddress("Kazan").inGroup(groups.iterator().next()),true);
    }
  }


      @Test
  public void testContactDeletionFromGroup() {
    Contacts contacts = app.db().contacts();
    Groups groups = app.db().groups();
    GroupData group = app.contact().groupWithContact(contacts, groups); //получаем любую группу, в которой есть контакт
    ContactData contact = app.contact().contactInGroup(contacts, group);  //получаем любой контакт, который входит в группу
    ContactData before = app.db().contact(contact.getId());
    app.goTo().homePage();
    app.contact().deleteContactFromGroup(contact, group);
    ContactData after = app.db().contact(contact.getId());
    assertThat(before.getGroups(), equalTo(after.getGroups().withAdded(group)));
  }
}
