package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pageobjects.LoginPage;

public class TestWithOutPageObjects {


    private static final Logger logger = LogManager.getLogger(TestWithOutPageObjects.class);

    @Test(description = "Login test valid scenario")
    public void loginvalidtest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");

        driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("student");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        Thread.sleep(3000);
        driver.quit();
    }

    @Test(description = "Login test invalid scenario")
    public void loginInvalidTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("student");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password12asd3");
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        Thread.sleep(3000);
        driver.quit();
    }

}
