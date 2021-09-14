import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Test {

  public static WebDriver createDriver() {
    WebDriver driver = new ChromeDriver();

    return driver;
  }


  @Test
  public void canSearchGoogle() {
    WebDriver driver = createDriver();

    driver.get("https://www.google.com/");

    WebElement name = driver.findElement(By.name("q"));
    name.click();
    name.sendKeys("Robert");
    driver.quit();
  }
}
