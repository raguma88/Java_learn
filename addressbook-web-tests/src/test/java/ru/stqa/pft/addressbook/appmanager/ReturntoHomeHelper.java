package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReturntoHomeHelper extends HelperBase {

  public ReturntoHomeHelper(WebDriver wd) {
    super(wd);
  }

  public void returnToHomePage() {

    click(By.linkText("home page"));
  }
}
