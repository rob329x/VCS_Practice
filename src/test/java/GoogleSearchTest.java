import logintest.GooglePage;
import org.junit.jupiter.api.Test;

public class GoogleSearchTest extends TestBase {

  @Test
  public void canSearchGoogle() {
    GooglePage googlePage = new GooglePage(getWebDriver());
    googlePage.go();

    googlePage.enterText("robert");
  }
}
