import static logintest.DataInitializer.getEmail;
import static logintest.DataInitializer.getPassword;

import logintest.FoodieLoginPage;
import logintest.FoodieHomePage;
import org.junit.jupiter.api.Test;

public class FoodieTest extends TestBase {

  @Test
  public void canLogin() {
    new FoodieLoginPage(getWebDriver()).go().login(getEmail(), getPassword());
  }

  @Test
  public void viewProfile() {
    new FoodieLoginPage(getWebDriver()).go()
        .login(getEmail(), getPassword())
        .clickOnProfile();
  }

  @Test
  public void canLogout() {
    new FoodieLoginPage(getWebDriver()).go()
            .login(getEmail(), getPassword())
            .clickLogout();
  }

  @Test
  public void editOrder() {
    new FoodieLoginPage(getWebDriver()).go()
            .login(getEmail(), getPassword())
            .clickEditOrder();
  }

  @Test
  public void addAllergy() {
    FoodieHomePage tester = new FoodieLoginPage(getWebDriver()).go()
            .login(getEmail(), getPassword());
    tester.clickOnProfile().clickAddAllergy();
  }
}
