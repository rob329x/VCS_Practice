package logintest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Test {

    public static WebDriver createDriver() {
        System.setProperty("webdriver.chrome.driver", "/Users/robertbolt/Desktop/Useful Tools/chromedriver");
        WebDriver driver = new ChromeDriver();

        return driver;
    }

    public static void main(String[] args) {
        WebDriver driver = createDriver();

        driver.get("https://www.google.com/");

        WebElement name = driver.findElement(By.name("q"));
        name.click();
        name.sendKeys("Robert");
        driver.quit();
    }
}