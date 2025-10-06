package Tests;

import Pages.*;
import Utils.BrowserFactory;
import Utils.TakesScreenshots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("chrome", "https://www.ndosiautomation.co.za/");
    HomePage homePage= PageFactory.initElements(driver,HomePage.class);
    RegisterPage registerPage= PageFactory.initElements(driver, RegisterPage.class);
    LoginPage loginPage= PageFactory.initElements(driver, LoginPage.class);
    WelcomePage welcomePage= PageFactory.initElements(driver, WelcomePage.class);
    WebAutomationPage webAutomationPage=PageFactory.initElements(driver, WebAutomationPage.class);
    PricingPanelPage pricingPanelPage=PageFactory.initElements(driver, PricingPanelPage.class);
    InvoiceSavePage invoiceSavePage=PageFactory.initElements(driver, InvoiceSavePage.class);
    LogoutPage logoutPage=PageFactory.initElements(driver, LogoutPage.class);
    TakesScreenshots takesScreenshots = new TakesScreenshots();
}
