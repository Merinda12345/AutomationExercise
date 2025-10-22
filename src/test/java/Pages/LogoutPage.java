package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class LogoutPage {

    WebDriver driver;

    @FindBy(id="logout-button")
    WebElement clickLogoutButton_id;

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyWelcomePageIsDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(clickLogoutButton_id));
        clickLogoutButton_id.isDisplayed();
    }

    public void clickLogoutButton(){
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(clickLogoutButton_id));
        clickLogoutButton_id.click();

    }


}
