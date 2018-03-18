package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReturntoHomeHelper extends HelperBase {
  private WebDriver wd;

  public ReturntoHomeHelper(WebDriver wd) {
    super(wd);
  }

  public void returnToHomePage() {

    click(By.linkText("home page"));
  }
}
