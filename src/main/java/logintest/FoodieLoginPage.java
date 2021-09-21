package logintest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FoodieLoginPage {

  private WebDriver driver;

  public FoodieLoginPage(WebDriver driver) {
    this.driver = driver;
  }

  public TheNewPage login(String email, String password) {
    /* Login on Foodee.com */
    driver.get("https://app.food.ee/login");

    WebElement emailInput = driver.findElement(By.id("ember11"));
    emailInput.click();
    emailInput.sendKeys(email);

    WebElement passwordInput = driver.findElement(By.id("ember14"));
    passwordInput.click();
    passwordInput.sendKeys(password);

    WebElement Login = driver.findElement(By.className("fde-floating-box_submit"));
    Login.click();
    return new TheNewPage(driver);
  }
}
