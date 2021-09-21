package logintest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FoodieLoginPage {

  private static final By EMAIL_INPUT_FIELD = By.id("ember11");
  private static final By PASSWORD_INPUT_FIELD = By.id("ember14");
  private static final By LOGIN_BUTTON = By.className("fde-floating-box_submit");

  private WebDriver driver;

  public FoodieLoginPage(WebDriver driver) {
    this.driver = driver;
  }

  public FoodieLoginPage go() {
    /* Login on Foodee.com */
    driver.get("https://app.food.ee/login");
    return new FoodieLoginPage(driver);
  }

  public TheNewPage login(String email, String password) {
    enterText(EMAIL_INPUT_FIELD, email);
    enterText(PASSWORD_INPUT_FIELD, password);
    clickLoginButton();

    return new TheNewPage(driver);
  }

  public void enterText(By locator, String text) {
    WebElement emailInput = driver.findElement(locator);
    emailInput.click();
    emailInput.sendKeys(text);
  }

  public void clickLoginButton() {
    WebElement Login = driver.findElement(LOGIN_BUTTON);
    Login.click();
  }
}
