import java.util.Scanner;
import logintest.DataInitializer;
import logintest.FoodieLoginPage;
import org.junit.jupiter.api.Test;

public class FoodieTest extends TestBase {

  @Test
  public void canLogin() {
    DataInitializer dataInit = new DataInitializer();

    Scanner myScanner = new Scanner(System.in);
    String email = dataInit.getEmail(myScanner);
    String password = dataInit.getPassword(myScanner);

    FoodieLoginPage newLogin = new FoodieLoginPage(getWebDriver());
    newLogin.login(email, password);
  }

  @Test
  public void viewProfile() {
    Scanner myScanner = new Scanner(System.in);
    DataInitializer first_login = new DataInitializer();

    String email = first_login.getEmail(myScanner);
    String password = first_login.getPassword(myScanner);

    FoodieLoginPage foodiePage = new FoodieLoginPage(getWebDriver());
    foodiePage.go()
        .login(email, password)
        .clickOnProfile();
  }
}
