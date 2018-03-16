package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReturntoHomeHelper extends HelperBase {
  private FirefoxDriver wd;

  public ReturntoHomeHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void returnToHomePage() {

    click(By.linkText("home page"));
  }
}
