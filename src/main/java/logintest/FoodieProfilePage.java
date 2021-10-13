package logintest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class FoodieProfilePage {

    private final WebDriver driver;

    public FoodieProfilePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAddAllergy() {
        WebDriverWait block = new WebDriverWait(driver,
                10); //Wait for next page to load and navigate ot the profile section
        block.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='rd-ui-button rd-ui-button_primary rd-ui-button_small rd-planning-eater-profile-display-value__edit-button text']")));
        WebElement allergy = driver.findElement(By.xpath("//*[@class='rd-ui-button rd-ui-button_primary rd-ui-button_small rd-planning-eater-profile-display-value__edit-button text']"));
        allergy.click();
    }

    public void clickProfileLogout(){
        WebDriverWait block = new WebDriverWait(driver,
                10); //Wait for next page to load and navigate ot the profile section
        block.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='rd-ui-button rd-ui-button_primary rd-ui-button_small rd-planning-eater-profile-display-value__edit-button text']")));
        WebElement logout = driver.findElement(By.xpath("//*[@class='rd-ui-button rd-ui-button_primary rd-ui-button_small rd-planning-eater-profile-display-value__edit-button text']"));
        logout.click();
    }




}
