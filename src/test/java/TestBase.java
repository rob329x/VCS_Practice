import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

  private WebDriver driver;

  public static WebDriver createDriver() {
    WebDriver driver = new ChromeDriver();

    return driver;
  }

  @BeforeEach
  public void setup() {
    this.driver = createDriver();
  }

  //@AfterEach
  public void cleanup() {
    getWebDriver().quit();
  }


  public WebDriver getWebDriver() {
    return this.driver;
  }

}
