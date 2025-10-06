package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class PricingPanelPage {
    WebDriver driver;
    @FindBy(id="review-section-title")
    WebElement pricingPanelTitle_id;

    @FindBy(id="shipping-option-express")
    WebElement shippingMethod_id;

    @FindBy(id="warranty-option-1yr")
    WebElement warrantyOption_id;

    @FindBy(id="discount-code")
    WebElement discountCode_id;

    @FindBy(id="apply-discount-btn")
    WebElement applyDiscountButton_id;

    @FindBy(id="add-to-cart-btn")
    WebElement AddToCartButton_id;

    @FindBy(id="cart-summary")
    WebElement cartSummary_id;

   @FindBy(xpath = "/html/body/div/div/main/section/div[3]/div/div[2]/div[2]/div[2]/button")
    WebElement removeButton_name;

   @FindBy(id="review-cart-btn")
   WebElement reviewCartButton_id;

   @FindBy(id="confirm-cart-btn")
   WebElement placeOrderButton_id;

   @FindBy(id="cancel-cart-btn")
   WebElement cancelOrderButton_id;

   @FindBy(id="purchase-success-toast")
   WebElement orderSuccessMessage_id;

   @FindBy(id="view-history-btn")
   WebElement viewInvoiceButton_id;





    public PricingPanelPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyPricingPanelIsDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(pricingPanelTitle_id));
        pricingPanelTitle_id.isDisplayed();
    }

    public void ShippingMethod(){
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(pricingPanelTitle_id));
        shippingMethod_id.click();

    }
    public void WarrantyOption(){
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(pricingPanelTitle_id));
        warrantyOption_id.click();

    }
    public void DiscountCode(String code) {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(pricingPanelTitle_id));
        discountCode_id.sendKeys(code);
    }
    public void ApplyDiscountButton(){
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(pricingPanelTitle_id));
        applyDiscountButton_id.click();

    }

    public void clickAddToCartButton(){
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(pricingPanelTitle_id));
        AddToCartButton_id.click();

    }

    public void verifyCartSummaryIsDisplayed(){
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(cartSummary_id));
        cartSummary_id.isDisplayed();
    }

    public void clickRemoveButton(){
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(cartSummary_id));
        removeButton_name.click();

    }
    public void clickReviewCartButton(){
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(cartSummary_id));
        reviewCartButton_id.click();

    }

    public void clickCancelOrderButton(){
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(cartSummary_id));
        cancelOrderButton_id.click();

    }
    public void clickReviewCartAgain(){
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(cartSummary_id));
        reviewCartButton_id.click();

    }

    public void clickPlaceOrderButton(){
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(placeOrderButton_id));
        placeOrderButton_id.click();

    }

    public void verifyOrderSuccessMessageIsDisplayed(){
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(orderSuccessMessage_id));
        orderSuccessMessage_id.isDisplayed();
    }

    public void clickViewInvoiceButton(){
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(viewInvoiceButton_id));
        viewInvoiceButton_id.click();

    }







}
