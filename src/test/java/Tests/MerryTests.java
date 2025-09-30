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
    public void verifyWebAutomationPageTests() {
        webAutomationPage.verifyWebAutomationPageIsDisplayed();

    }

    @Test(dependsOnMethods = "verifyWebAutomationPageTests")
    public void selectDeviceTypeTests() {
        webAutomationPage.validateSelectDeviceType("phone");

    }
    @Test(dependsOnMethods = "selectDeviceTypeTests")
    public void selectBrandTests() {
        webAutomationPage.validateSelectBrand("apple");
    }
@Test(dependsOnMethods = "selectBrandTests")
    public void selectStorageOptionTests() {
        webAutomationPage.validateSelectStorageOption();
    }
    @Test(dependsOnMethods = "selectStorageOptionTests")
    public void enterQuantityTests() {
        webAutomationPage.validateEnterQuantity("2");
    }
    @Test(dependsOnMethods = "enterQuantityTests")
    public void enterAddressTests() {
        webAutomationPage.validateEnterAddress("123 Main St, City, Country");
    }

    @Test(dependsOnMethods = "enterAddressTests")
    public void clickNextButtonTests() {
        webAutomationPage.validateClickNextButton();
    }





    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}