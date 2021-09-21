package logintest;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataInitializer {

  private static WebDriver createDriver() {
//    System.setProperty("webdriver.chrome.driver",
//        "/Users/robertbolt/Desktop/Useful Tools/chromedriver");
    WebDriver driver = new ChromeDriver();

    return driver;
  }

  public static String getEmail(Scanner myScanner) {
    System.out.println("Enter email");
    String email = myScanner.nextLine();  // Read user email
    System.out.println("Email is: " + email);  // Output user email

    return email;
  }

  public static String getPassword(Scanner myScanner) {
    System.out.println("Enter password");
    String password = myScanner.nextLine(); // Read user password
    System.out.println("Password is: " + password);  // Output user password

    return password;
  }

  public static void main(String[] args) throws InterruptedException {

    Scanner myScanner = new Scanner(System.in);  // Create a Scanner object
    String email = getEmail(myScanner);
    String password = getPassword(myScanner);

    WebDriver driver = createDriver();

    FoodieLoginPage foodiePage = new FoodieLoginPage(driver);
    TheNewPage theNewPage = foodiePage.login(email, password);
    theNewPage.clickOnProfile();

    driver.quit();
  }
}