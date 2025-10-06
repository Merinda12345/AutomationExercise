package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class InvoiceSavePage {

    WebDriver driver;
    @FindBy(xpath="/html/body/div/div/main/section/div[3]/div/div[2]/div/div[2]/div[1]/div[3]/button[2]")
    WebElement clickDownloadInvoice_id;



    public InvoiceSavePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickDownloadInvoiceButton(){
        clickDownloadInvoice_id.click();
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(clickDownloadInvoice_id));
    }



}
