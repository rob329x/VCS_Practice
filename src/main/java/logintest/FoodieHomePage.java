package logintest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FoodieHomePage extends BasePage{

  private static final By MY_PROFILE = By.className("rd-ui-base-item__text");
  private static final By EDIT_ORDER = By.xpath("//*[@class='ember-view rd-ui-button rd-ui-button_primary rd-ui-button--text']");
  private static final By LOGOUT_BUTTON = By.xpath("//*[@class='rd-ui-button rd-ui-button_primary rd-ui-button_small rd-ui-button--text']");


  public FoodieHomePage(WebDriver driver) {
    super(driver);
  }

  public FoodieProfilePage clickOnProfile() {
    waitToClick(MY_PROFILE);
    return new FoodieProfilePage(getWebDriver());
  }

  public void clickEditOrder(){
    waitToClick(EDIT_ORDER);
  }

  public void clickLogout(){
    waitToClick(LOGOUT_BUTTON);
  }
}
