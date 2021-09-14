package logintest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TheNewPage {

  private final WebDriver driver;

  public TheNewPage(WebDriver driver) {
    this.driver = driver;
  }

  public void clickOnProfile() {
    WebDriverWait block = new WebDriverWait(driver,
        10); //Wait for next page to load and navigate ot the profile section
    block.until(ExpectedConditions.visibilityOfElementLocated(By.id("ember112")));

    WebElement profile = driver.findElement(By.id("ember112"));
    profile.click();
  }
}
