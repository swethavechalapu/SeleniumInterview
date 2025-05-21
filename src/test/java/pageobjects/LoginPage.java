package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;

    WebElement userNameTextBox ;
    WebElement passwordTextBox;

    WebElement submitButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;

    }

    public void navigateToURl( String url) {
        driver.get(url);
    }

    public void enterUserName(String userName) {
        userNameTextBox = driver.findElement(By.xpath("//input[@name=\"username\"]"));
        userNameTextBox.sendKeys(userName);
    }

    public void enterPassword(String password) {
        passwordTextBox = driver.findElement(By.xpath("//input[@id='password']"));
        passwordTextBox.sendKeys(password);
    }

    public void submit() {
        submitButton = driver.findElement(By.xpath("//button[@id='submit']"));
        submitButton.click();
    }

}
