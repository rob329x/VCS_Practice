package logintest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class FoodieProfilePage extends BasePage{

    private static final By ALLERGY = By.xpath("//*[@class='rd-ui-button rd-ui-button_primary rd-ui-button_small rd-planning-eater-profile-display-value__edit-button text']");
    private static final By PROFILE_LOGOUT = By.xpath("//*[@class='rd-ui-button rd-ui-button_primary rd-ui-button_small rd-planning-eater-profile-display-value__edit-button text']");


    public FoodieProfilePage(WebDriver driver) {
        super(driver);
    }

    public void clickAddAllergy() {
        waitToClick(ALLERGY);
    }

    public void clickProfileLogout(){
        waitToClick(PROFILE_LOGOUT);
    }




}
