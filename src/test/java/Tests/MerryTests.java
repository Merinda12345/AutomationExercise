package Tests;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;


public class MerryTests extends Base {
    @Test
    public void verifyHomePageIsDisplayedTests() {
        homePage.verifyHomePageIsDisplayed();
        takesScreenshots.takesSnapShot(driver, "Home Page");
    }

@Test(dependsOnMethods = "verifyHomePageIsDisplayedTests")
    public void clickLearningMaterialTests() {

        homePage.clickLearningMaterialButton();
        takesScreenshots.takesSnapShot(driver," Learning Material Page");
    }

@Test(dependsOnMethods = "clickLearningMaterialTests")
    public void verifyLoginPageIsDisplayedTests() {

        loginPage.verifyLoginPageIsDisplayed();
        takesScreenshots.takesSnapShot(driver," Login Page");
    }
//    @Test(dependsOnMethods = "verifyLoginPageIsDisplayedTests")
//    public void clickSignUpButtonTests() {
//        loginPage.clickSignUpButton();
//
//    }
//    @Test(dependsOnMethods = "clickSignUpButtonTests")
//    public void verifyRegisterPageIsDisplayedTests() {
//        registerPage.verifyRegistrationPageIsDisplayed();
//        takesScreenshots.takesSnapShot(driver," Register Page");
//    }
//    @Test(dependsOnMethods = "verifyRegisterPageIsDisplayedTests")
//    public void fillRegistrationFormTests() {
//        registerPage.enterFirstName("Merry");
//        registerPage.enterLastName("Smith");
//        registerPage.enterEmail("merry@gmail.com");
//        registerPage.enterPassword("12345678");
//        registerPage.enterConfirmPassword("1234567ty");
//        System.out.println("Passwords do not match");
//        takesScreenshots.takesSnapShot(driver," Entered Registration Details");
//        registerPage.clickRegisterButton();
//    }

//@Test(dependsOnMethods = "verifyLoginPageIsDisplayedTests")
//public void testInvalidCredentials() {
//    loginPage.enterUserName("testuser");
//    loginPage.enterPassword("wrongpass");
//    loginPage.clickLoginButton();
//    Assert.assertTrue(loginPage.areTabsVisible(), "Tabs should be visible after login");
//    // Simulate tab switch by refreshing or navigating away and back
//    driver.navigate().to("https://www.ndosiautomation.co.za/#another");
//    driver.navigate().back();
//    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//    Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//    Assert.assertTrue(driver.getCurrentUrl().contains("login"), "Should be redirected to login after tab switch");
//    takesScreenshots.takesSnapShot(driver, "Invalid LogIn");
//}

    @Test(dependsOnMethods = "verifyLoginPageIsDisplayedTests")
    public void loginWithSpaces() {

        loginPage.enterUserName("  Merinda@gmail.com");
        loginPage.enterPassword("   12345678   ");
        loginPage.clickLoginButton();
        System.out.println("Credentials with spaces logged in");
        takesScreenshots.takesSnapShot(driver, "Entered Spaces in Login Details");
    }
    @Test(dependsOnMethods = "loginWithSpaces")
    public void clickLogoutButtonTests() {
        logoutPage.clickLogoutButton();
        takesScreenshots.takesSnapShot(driver, "Logged Out");
    }
   @Test(dependsOnMethods = "clickLogoutButtonTests")
    public void verifyLoginPageIsDisplayedAfterLogoutTests() {

        loginPage.verifyLoginPageIsDisplayed();
        takesScreenshots.takesSnapShot(driver," Login Page After Logout");
    }



@Test(dependsOnMethods = "clickLogoutButtonTests")
    public void LoginDetails() {

        loginPage.enterUserName("Merinda@gmail.com");
        loginPage.enterPassword("12345678");
        takesScreenshots.takesSnapShot(driver," Entered Login Details");

    }

    @Test(dependsOnMethods = "LoginDetails")
    public void clickLoginButtonTests() {
        loginPage.clickLoginButton();

    }

    @Test(dependsOnMethods = "clickLoginButtonTests")
    public void verifyWelcomePageTests() {
        welcomePage.verifyWelcomePageIsDisplayed();
        takesScreenshots.takesSnapShot(driver," Welcome Page");

    }
    @Test(dependsOnMethods = "verifyWelcomePageTests")
    public void clickWebAutomationButtonTests() {
        welcomePage.clickWebAutomationButton();
        takesScreenshots.takesSnapShot(driver," Web Automation Page");

    }
    @Test(dependsOnMethods = "clickWebAutomationButtonTests")
    public void wrongQuantity() {
        webAutomationPage.validateSelectDeviceType("phone");
        webAutomationPage.validateSelectBrand("apple");
        webAutomationPage.validateSelectStorageOption();
        webAutomationPage.validateEnterQuantity("0");
        System.out.println("Quantity must be >0");
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        webAutomationPage.validateEnterAddress("1234 Fake Street, Springfield");
        webAutomationPage.validateClickNextButton();
        takesScreenshots.takesSnapShot(driver, "Quantity 0 value");
        webAutomationPage.validateEnterQuantity("11");
        System.out.println("Quantity must be <10");
        webAutomationPage.validateEnterAddress("1234 Fake Street, Springfield");
        webAutomationPage.validateClickNextButton();
        takesScreenshots.takesSnapShot(driver, " Quantity 11 value");

    }



    @Test(dependsOnMethods = "wrongQuantity")
    public void fillFormTests() {
        webAutomationPage.validateSelectDeviceType("phone");
        webAutomationPage.validateSelectBrand("apple");
        webAutomationPage.validateSelectStorageOption();
        webAutomationPage.validateEnterQuantity("2");
        webAutomationPage.validateEnterAddress("1234 Fake Street, Springfield");
        webAutomationPage.validateClickNextButton();
        takesScreenshots.takesSnapShot(driver, " Pricing Panel Page");
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
        takesScreenshots.takesSnapShot(driver, " Updated Pricing Panel with Extras");
    }

    @Test(dependsOnMethods = "ExtrasPricingPanelTests")
    public void wrongDiscountValue() {
        pricingPanelPage.ShippingMethod();
        pricingPanelPage.WarrantyOption();
        pricingPanelPage.DiscountCode("wedd");

        pricingPanelPage.ApplyDiscountButton();
        System.out.println("Invalid discount code");
        takesScreenshots.takesSnapShot(driver, " Invalid Discount Code");
    }

    @Test(dependsOnMethods = "wrongDiscountValue")
    public void clickAddToCartButtonTests() {
        pricingPanelPage.clickAddToCartButton();
    }
    @Test(dependsOnMethods = "clickAddToCartButtonTests")
    public void verifyCartSummaryTests(){
        pricingPanelPage.verifyCartSummaryIsDisplayed();
        takesScreenshots.takesSnapShot(driver,"cart summary");
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
        takesScreenshots.takesSnapShot(driver, "add another devise");

    }
    @Test(dependsOnMethods = "AddDifferentDeviceTests")
    public void RemoveItemFromCartTests(){
        pricingPanelPage.clickRemoveButton();
        pricingPanelPage.verifyCartSummaryIsDisplayed();
        takesScreenshots.takesSnapShot(driver, "Remove item from cart");
    }
    @Test(dependsOnMethods = "RemoveItemFromCartTests")
    public void ReviewCartTests(){
        pricingPanelPage.clickReviewCartButton();
        takesScreenshots.takesSnapShot(driver," review cart after removing");
    }
    @Test(dependsOnMethods = "ReviewCartTests")
    public void CancelOrderTests(){
        pricingPanelPage.clickCancelOrderButton();
        takesScreenshots.takesSnapShot(driver,"cancel button");

    }
    @Test(dependsOnMethods = "CancelOrderTests")
    public void clickReviewCartAgainTests(){
        pricingPanelPage.clickReviewCartAgain();
    }

   @Test(dependsOnMethods = "clickReviewCartAgainTests")
    public void clickPlaceOrderButtonTests(){
        pricingPanelPage.clickPlaceOrderButton();
        takesScreenshots.takesSnapShot(driver,"place order");
    }

    @Test(dependsOnMethods = "clickPlaceOrderButtonTests")
    public void verifyOrderSuccessMessageTests(){
        pricingPanelPage.verifyOrderSuccessMessageIsDisplayed();
        takesScreenshots.takesSnapShot(driver,"success message after ordering");
    }
    @Test(dependsOnMethods = "verifyOrderSuccessMessageTests")
    public void clickViewInvoiceButtonTests(){
        pricingPanelPage.clickViewInvoiceButton();
        takesScreenshots.takesSnapShot(driver,"view invoice after ordering ");
    }
    @Test(dependsOnMethods = "clickViewInvoiceButtonTests")
    public void clickDownloadInvoiceButtonTests(){
        invoiceSavePage.clickDownloadInvoiceButton();
        takesScreenshots.takesSnapShot(driver,"download invoice after ordering ");
    }


    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}