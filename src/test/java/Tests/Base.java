package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.WebAutomationPage;
import Pages.WelcomePage;
import Utils.BrowserFactory;
import Utils.TakesScreenshots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("chrome", "https://www.ndosiautomation.co.za/");
    HomePage homePage= PageFactory.initElements(driver,HomePage.class);
    LoginPage loginPage= PageFactory.initElements(driver, LoginPage.class);
    WelcomePage welcomePage= PageFactory.initElements(driver, WelcomePage.class);
    WebAutomationPage webAutomationPage=PageFactory.initElements(driver, WebAutomationPage.class);

    TakesScreenshots takesScreenshots = new TakesScreenshots();
}
