package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    //Locators
//login
    private By LogInButton=By.id("login2");
    private By UserNamebox=By.id("loginusername");
    private By Passwordbox=By.id("loginpassword");
    private By Login =By.xpath("//button[@type='button' and text()='Log in']");
//add1
    private By SamsungGalaxyS6Link = By.xpath("//a[@class='hrefch' and text()='Samsung galaxy s6']");
//add2
    private By LaptopsButton =By.xpath("//a[@onclick=\"byCat('notebook')\" and text()='Laptops']");
    private By SonyVaioi5Link =By.xpath("//a[text()='Sony vaio i5' and @href='prod.html?idp_=8']");

    //cart
    private By CartButton=By.id("cartur");

    //Action
     public void clickLogInButton() {
         driver.findElement(LogInButton).click();
     }
    public void enterUserName(String username) {
        driver.findElement(UserNamebox).sendKeys(username);
    }
    public void enterPassword(String password) {
        driver.findElement(Passwordbox).sendKeys(password);
    }
    public void clickSiubmitLogin() {
        driver.findElement(Login).click();
    }

    public OnePage clickOnSamsungGalaxyS6Link(){
        driver.findElement(SamsungGalaxyS6Link).click();
        return new OnePage(driver);
    }

    public void clickOnLaptopsLink() {
        driver.findElement(LaptopsButton).click();
    }
    public EightPage clickSonyVaioi5Link(){
            driver.findElement(SonyVaioi5Link).click();
            return new EightPage(driver);
    }
    public Products CartLink(){
         driver.findElement(CartButton).click();
         return new Products(driver);
    }
}
