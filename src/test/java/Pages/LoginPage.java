package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class LoginPage {

    WebDriver driver;
    @FindBy(id="login-heading")
    WebElement loginPageTitle_id;

    @FindBy(id="login-email")
    WebElement enterUserName_id;

    @FindBy(id="login-password")
    WebElement enterPassword_id;

    @FindBy(id="login-submit")
    WebElement clickLoginButton_id;

    @FindBy(id="signup-toggle")
    WebElement clickSignUpButton_id;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSignUpButton(){
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(clickSignUpButton_id));
        clickSignUpButton_id.click();
    }
    public boolean areTabsVisible() {
        return loginPageTitle_id.isDisplayed() && enterUserName_id.isDisplayed() && enterPassword_id.isDisplayed() && clickLoginButton_id.isDisplayed() && clickSignUpButton_id.isDisplayed();
    }
    public void verifyLoginPageIsDisplayed() {

        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(loginPageTitle_id));
        loginPageTitle_id.isDisplayed();
    }

    public void enterUserName(String userName){
        enterUserName_id.clear();
        enterUserName_id.sendKeys(userName);
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(enterUserName_id));

    }

    public void enterPassword(String password){
        enterPassword_id.clear();
        enterPassword_id.sendKeys(password);
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(enterPassword_id));

    }

    public void clickLoginButton(){
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(clickLoginButton_id));
        clickLoginButton_id.click();
    }






}
