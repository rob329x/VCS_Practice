package logintest;

import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_Test {
    public static WebDriver createDriver() {
        System.setProperty("webdriver.chrome.driver", "/Users/robertbolt/Desktop/Useful Tools/chromedriver");
        WebDriver driver = new ChromeDriver();

        return driver;
    }

    public static String getEmail(Scanner myScanner){
        System.out.println("Enter email");
        String email = myScanner.nextLine();  // Read user email
        System.out.println("Email is: " + email);  // Output user email

        return email;
    }

    public static String getPassword(Scanner myScanner){
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

        WebDriverWait block = new WebDriverWait(driver,
            10); //Wait for next page to load and navigate ot the profile section
        block.until(ExpectedConditions.visibilityOfElementLocated(By.id("ember112")));

        WebElement profile = driver.findElement(By.id("ember112"));
        profile.click();

        driver.quit();
    }
}