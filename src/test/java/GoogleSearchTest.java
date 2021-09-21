import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GoogleSearchTest extends TestBase {

  @Test
  public void canSearchGoogle() {
    getWebDriver().get("https://www.google.com/");

    // action under test
    WebElement name = getWebDriver().findElement(By.name("q"));
    name.click();
    name.sendKeys("Robert");

    // cleanup
    getWebDriver().quit();
  }
}
