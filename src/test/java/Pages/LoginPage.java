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

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyLoginPageIsDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(loginPageTitle_id));
        loginPageTitle_id.isDisplayed();
    }

    public void enterUserName(String userName){
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(enterUserName_id));
        enterUserName_id.sendKeys(userName);
    }

    public void enterPassword(String password){
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(enterPassword_id));
        enterPassword_id.sendKeys(password);
    }

    public void clickLoginButton(){
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(clickLoginButton_id));
        clickLoginButton_id.click();
    }




}
