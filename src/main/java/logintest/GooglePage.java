package logintest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GooglePage extends BasePage {
  private static final By SEARCH_FIELD = By.name("q");

  public GooglePage(WebDriver driver) {
    super(driver);
  }

  public void go() {
    getWebDriver().get("https://www.google.com/");
  }

  public void enterText (String text) {
    enterText(SEARCH_FIELD, text);
  }
}
