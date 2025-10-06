package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class WebAutomationPage {

    WebDriver driver;
    @FindBy (id="inventory-title")
    WebElement webAutomationPageTitle_id;

    @FindBy(id = "deviceType")
    WebElement selectDeviceTypeDropdown_id;

    @FindBy(id="brand")
    WebElement selectBrandDropdown_id;

    @FindBy(id="storage-128GB")
    WebElement clickStorageOption_id;

    @FindBy(id="quantity")
    WebElement enterQuantity_id;

    @FindBy(id="address")
    WebElement enterAddress_id;

    @FindBy(id="inventory-next-btn")
    WebElement clickNextButton_id;



    public WebAutomationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyWebAutomationPageIsDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(webAutomationPageTitle_id));
        webAutomationPageTitle_id.isDisplayed();
    }


    public void validateSelectDeviceType( String deviceType){
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(selectBrandDropdown_id));
       Select select = new Select(selectDeviceTypeDropdown_id);
         select.selectByValue(deviceType);


    }

    public void validateSelectBrand(String brand){
        Select select1 = new Select(selectBrandDropdown_id);
        select1.selectByValue(brand);
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(selectBrandDropdown_id));

    }
    public void validateSelectStorageOption(){
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(clickStorageOption_id));
        clickStorageOption_id.click();
    }

    public void validateEnterQuantity(String quantity){
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(enterQuantity_id));
        enterQuantity_id.clear();
        enterQuantity_id.sendKeys(quantity);

    }

    public void validateEnterAddress(String address){
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(enterAddress_id));
        enterAddress_id.sendKeys(address);

    }


    public void validateClickNextButton(){
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(clickNextButton_id));
        clickNextButton_id.click();
    }





}
