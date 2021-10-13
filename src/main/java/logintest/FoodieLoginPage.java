package logintest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FoodieLoginPage extends BasePage{

  private static final By EMAIL_INPUT_FIELD = By.id("ember11");
  private static final By PASSWORD_INPUT_FIELD = By.id("ember14");
  private static final By LOGIN_BUTTON = By.className("fde-floating-box_submit");


  public FoodieLoginPage(WebDriver driver) {
    super(driver);
  }

  public FoodieLoginPage go() {
    /* Login on Foodee.com */
    getWebDriver().get("https://app.food.ee/login");
    return new FoodieLoginPage(getWebDriver());
  }

  public FoodieHomePage login(String email, String password) {
    enterText(EMAIL_INPUT_FIELD, email);
    enterText(PASSWORD_INPUT_FIELD, password);
    clickLoginButton();

    return new FoodieHomePage(getWebDriver());
  }

  public void clickLoginButton() {
    WebElement Login = getWebDriver().findElement(LOGIN_BUTTON);
    Login.click();
  }
}
