package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage1 {
    WebDriver driver;
    public SignupPage1(WebDriver driver) {
        this.driver=driver;
    }
    //Locators
    private By signUpButton=By.id("signin2");
    private By userNamebox=By.id("sign-username");
    private By passwordbox=By.id("sign-password");
    private By Signup =By.xpath("//button[text()='Sign up']");
    // Action
    public void clickSignUpButton() {
        driver.findElement(signUpButton).click();
    }
    public void enterUserName(String username) {
        driver.findElement(userNamebox).sendKeys(username);
    }
    public void enterPassword(String password) {
        driver.findElement(passwordbox).sendKeys(password);
    }
    public void clickSiubmitSignup() {
        driver.findElement(Signup).click();
    }
    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }
}


