import static logintest.DataInitializer.getEmail;
import static logintest.DataInitializer.getPassword;

import logintest.FoodieLoginPage;
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
}
