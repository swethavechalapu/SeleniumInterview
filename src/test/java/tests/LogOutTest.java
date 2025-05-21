package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pageobjects.LoginPage;
import pageobjects.LogoutPage;

public class LogOutTest {


    @Test
    public void validateLogout() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.navigateToURl("https://practicetestautomation.com/practice-test-login/");
        loginPage.enterUserName("student");
        loginPage.enterPassword("Password123");
        loginPage.submit();
        LogoutPage logoutPage = new LogoutPage(driver);
        Thread.sleep(3000);
        logoutPage.clickOnLogout();
        Thread.sleep(3000);
        driver.quit();

    }

}
