package ru.stqa.pft.addressbook.appmanager;

import my.homework.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactHelper extends HelperBase {
  /*private FirefoxDriver wd;*/

  public ContactHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void submitContactCreation() {
    click(By.name("submit"));
  }

  public void fillContactForm(ContactData contactData) {
    type(By.name("firstname"), contactData.getName());
    type(By.name("lastname"), contactData.getLastname());
    type(By.name("address"), contactData.getAddress());
    type(By.name("mobile"), contactData.getMobile());
  }

  public void initContactCreation() {
    click(By.linkText("add new"));
  }

  public void closeModalWindow() {
      wd.switchTo().alert().accept();
  }

  public void deleteContact() { click(By.xpath("//div[@id='content']/form[2]/div[2]/input")); }

  public void selectContact() {
      click(By.name("selected[]"));
  }
}
