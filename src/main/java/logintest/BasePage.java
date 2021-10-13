package logintest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

  public void waitToClick(By locator){
    WebDriverWait block = new WebDriverWait(driver,
            10); //Wait for next page to load and navigate ot the profile section
    block.until(ExpectedConditions.visibilityOfElementLocated(locator));
    WebElement element = driver.findElement(locator);
    element.click();
  }
}
