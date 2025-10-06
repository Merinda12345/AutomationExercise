package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;


public class RegisterPage {
    WebDriver driver;
    @FindBy(id="registration-heading")
    WebElement registrationPageTitle_id;

    @FindBy(id="register-firstName")
    WebElement enterFirstName_id;

    @FindBy(id="register-lastName")
    WebElement enterLastName_id;

    @FindBy(id="register-email")
    WebElement enterEmail_id;

    @FindBy(id="register-password")
    WebElement enterPassword_id;

    @FindBy(id="register-confirmPassword")
    WebElement enterConfirmPassword_id;

    @FindBy(id="register-submit")
    WebElement clickRegisterButton_id;


    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyRegistrationPageIsDisplayed() {
       new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(registrationPageTitle_id));
        registrationPageTitle_id.isDisplayed();
    }
  public void enterFirstName(String name){
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(enterFirstName_id));
        enterFirstName_id.sendKeys(name);
    }
        public void enterLastName(String lastname){
            new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(enterLastName_id));
            enterLastName_id.sendKeys(lastname);
        }
        public void enterEmail(String email) {
            new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(enterEmail_id));
            enterEmail_id.sendKeys(email);
        }

        public void enterPassword(String password){
            new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(enterPassword_id));
            enterPassword_id.sendKeys(password);
        }
        public void enterConfirmPassword(String confirmPassword) {
            new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(enterConfirmPassword_id));
            enterConfirmPassword_id.sendKeys(confirmPassword);
        }
        public void clickRegisterButton(){
            new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(clickRegisterButton_id));
            clickRegisterButton_id.click();
        }



}
