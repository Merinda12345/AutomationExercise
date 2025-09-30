package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class HomePage {
    WebDriver driver;

    //Locating the element using @FindBy annotation
    @FindBy(id="overview-section")
    WebElement homePageTitle_id;

    @FindBy(id="nav-btn-practice")
    WebElement clickLearningMaterialButton_id;

    @FindBy(id="login-heading")
    WebElement learningPageTitle_id;

    //Constructor to initialize the WebDriver
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyHomePageIsDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(homePageTitle_id));
        homePageTitle_id.isDisplayed();
    }

    public void clickLearningMaterialButton(){
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(clickLearningMaterialButton_id));
        clickLearningMaterialButton_id.click();
    }







}
