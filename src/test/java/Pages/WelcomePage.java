package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class WelcomePage {
    WebDriver driver;
    @FindBy(id="practice-heading")
    WebElement welcomepageTitle_id;

    @FindBy(id="tab-btn-web")
    WebElement clickWebAutomationTab_id;


    public WelcomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyWelcomePageIsDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(welcomepageTitle_id));
        welcomepageTitle_id.isDisplayed();
    }

    public void clickWebAutomationButton(){
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(welcomepageTitle_id));
        clickWebAutomationTab_id.click();
    }




}
