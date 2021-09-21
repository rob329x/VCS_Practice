import logintest.TheNewPage;
import org.junit.jupiter.api.Test;
import logintest.Login_Test;
import logintest.FoodieLoginPage;
import org.openqa.selenium.WebDriver;

import java.util.Scanner;

public class FoodieTest {

  @Test
  public void canLogin() {
    Login_Test first_login = new Login_Test();

    Scanner myScanner = new Scanner(System.in);
    String email = first_login.getEmail(myScanner);
    String password = first_login.getPassword(myScanner);

    WebDriver foodieDriver = first_login.createDriver();

    FoodieLoginPage newLogin = new FoodieLoginPage(foodieDriver);
    newLogin.login(email,password);

  }

  @Test
  public void viewProfile(){
    Scanner myScanner = new Scanner(System.in);
    Login_Test first_login = new Login_Test();

    String email = first_login.getEmail(myScanner);
    String password = first_login.getPassword(myScanner);

    WebDriver foodieDriver = first_login.createDriver();

    FoodieLoginPage newLogin = new FoodieLoginPage(foodieDriver);
    TheNewPage profile = newLogin.login(email,password);

    profile.clickOnProfile();

  }
}
