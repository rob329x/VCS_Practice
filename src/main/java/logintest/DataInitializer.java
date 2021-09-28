package logintest;

import static logintest.ConfigManager.getLoadedProperties;

import java.util.Scanner;

public class DataInitializer {

  private static final String EMAIL = "EMAIL";
  private static final String PASSWORD = "PASSWORD";

  public static String getEmail() {
    return getLoadedProperties().getProperty(EMAIL);
  }

  public static String getPassword() {
    return getLoadedProperties().getProperty(PASSWORD);
  }

  /**
   * @deprecated
   * this method sucks and we did a better thing.  Use `getEmail()` instead!
   *
   * This is a method that gets email from the console.
   * @param myScanner
   * @return
   */
  @Deprecated
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
}