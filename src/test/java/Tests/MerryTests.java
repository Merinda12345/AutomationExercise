package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class MerryTests extends Base {
    @Test
    public void verifyHomePageIsDisplayedTests() {
        homePage.verifyHomePageIsDisplayed();
        takesScreenshots.takesSnapShot(driver, "Home Page");
    }

@Test(dependsOnMethods = "verifyHomePageIsDisplayedTests")
    public void clickLearningMaterialTests() {

        homePage.clickLearningMaterialButton();
    }

@Test(dependsOnMethods = "clickLearningMaterialTests")
    public void verifyLoginPageIsDisplayedTests() {

        loginPage.verifyLoginPageIsDisplayed();
    }

@Test(dependsOnMethods = "verifyLoginPageIsDisplayedTests")
    public void enterUserNameTests() {
        loginPage.enterUserName("Merinda@gmail.com");

    }
    @Test(dependsOnMethods = "enterUserNameTests")
    public void enterPasswordTests() {
        loginPage.enterPassword("12345678");
    }
    @Test(dependsOnMethods = "enterPasswordTests")
    public void clickLoginButtonTests() {
        loginPage.clickLoginButton();

    }

    @Test(dependsOnMethods = "clickLoginButtonTests")
    public void verifyWelcomePageTests() {
        welcomePage.verifyWelcomePageIsDisplayed();

    }
    @Test(dependsOnMethods = "verifyWelcomePageTests")
    public void clickWebAutomationButtonTests() {
        welcomePage.clickWebAutomationButton();

    }
    @Test(dependsOnMethods = "clickWebAutomationButtonTests")
    public void fillFormTests() {
        webAutomationPage.validateSelectDeviceType("phone");
        webAutomationPage.validateSelectBrand("apple");
        webAutomationPage.validateSelectStorageOption();
        webAutomationPage.validateEnterQuantity("2");
        webAutomationPage.validateEnterAddress("1234 Fake Street, Springfield");
        webAutomationPage.validateClickNextButton();
    }

    @Test(dependsOnMethods = "fillFormTests")
   public void verifyPricingPanelTests() {
        pricingPanelPage.verifyPricingPanelIsDisplayed();
    }
    @Test(dependsOnMethods = "verifyPricingPanelTests")
    public void ExtrasPricingPanelTests() {
        pricingPanelPage.ShippingMethod();
        pricingPanelPage.WarrantyOption();
        pricingPanelPage.DiscountCode("SAVE20");
        pricingPanelPage.ApplyDiscountButton();
    }
    @Test(dependsOnMethods = "ExtrasPricingPanelTests")
    public void clickAddToCartButtonTests() {
        pricingPanelPage.clickAddToCartButton();
    }
    @Test(dependsOnMethods = "clickAddToCartButtonTests")
    public void verifyCartSummaryTests(){
        pricingPanelPage.verifyCartSummaryIsDisplayed();
    }
    @Test(dependsOnMethods = "verifyCartSummaryTests")
    public void AddDifferentDeviceTests(){
        webAutomationPage.validateSelectDeviceType("laptop");
        webAutomationPage.validateSelectBrand("macbook pro");
        webAutomationPage.validateSelectStorageOption();
        webAutomationPage.validateEnterQuantity("3");
        webAutomationPage.validateEnterAddress("1234 Fake Street, Springfield");
        webAutomationPage.validateClickNextButton();
        pricingPanelPage.verifyPricingPanelIsDisplayed();
        pricingPanelPage.ShippingMethod();
        pricingPanelPage.WarrantyOption();
        pricingPanelPage.DiscountCode("");
        pricingPanelPage.ApplyDiscountButton();
        pricingPanelPage.clickAddToCartButton();
        pricingPanelPage.verifyCartSummaryIsDisplayed();

    }
    @Test(dependsOnMethods = "AddDifferentDeviceTests")
    public void RemoveItemFromCartTests(){
        pricingPanelPage.clickRemoveButton();
        pricingPanelPage.verifyCartSummaryIsDisplayed();

    }
    @Test(dependsOnMethods = "RemoveItemFromCartTests")
    public void ReviewCartTests(){
        pricingPanelPage.clickReviewCartButton();
    }
    @Test(dependsOnMethods = "ReviewCartTests")
    public void CancelOrderTests(){
        pricingPanelPage.clickCancelOrderButton();

    }
    @Test(dependsOnMethods = "CancelOrderTests")
    public void clickReviewCartAgainTests(){
        pricingPanelPage.clickReviewCartAgain();
    }

   @Test(dependsOnMethods = "clickReviewCartAgainTests")
    public void clickPlaceOrderButtonTests(){
        pricingPanelPage.clickPlaceOrderButton();
    }

    @Test(dependsOnMethods = "clickPlaceOrderButtonTests")
    public void verifyOrderSuccessMessageTests(){
        pricingPanelPage.verifyOrderSuccessMessageIsDisplayed();
    }
    @Test(dependsOnMethods = "verifyOrderSuccessMessageTests")
    public void clickViewInvoiceButtonTests(){
        pricingPanelPage.clickViewInvoiceButton();
    }


//    @AfterTest
//    public void closeBrowser() {
//        driver.quit();
//    }
}