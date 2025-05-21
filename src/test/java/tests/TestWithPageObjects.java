package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pageobjects.LoginPage;

public class TestWithPageObjects {


    private static final Logger logger = LogManager.getLogger(TestWithPageObjects.class);

    @Test
    public void testUsingPom() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.navigateToURl("https://practicetestautomation.com/practice-test-login/");
        loginPage.enterUserName("student");
        loginPage.enterPassword("Password123");
        loginPage.submit();
        Thread.sleep(3000);
        driver.quit();

    }

    @Test
    public void invalidLoginTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.navigateToURl("https://practicetestautomation.com/practice-test-login/");
        loginPage.enterUserName("student");
        loginPage.enterPassword("Password23423423");
        loginPage.submit();


    }
}
