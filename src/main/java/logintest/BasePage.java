package logintest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
  private WebDriver driver;


  public BasePage(WebDriver driver) {
    this.driver = driver;
  }

  public WebDriver getWebDriver() {
    return this.driver;
  }

  public void enterText(By locator, String text) {
    WebElement emailInput = getWebDriver().findElement(locator);
    emailInput.click();
    emailInput.sendKeys(text);
  }
}
