package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReturntoHomeHelper {
  private FirefoxDriver wd;

  public ReturntoHomeHelper(FirefoxDriver wd) {
    this.wd = wd;
  }

  public void returnToHomePage() {
    wd.findElement(By.linkText("home page")).click();
  }
}
