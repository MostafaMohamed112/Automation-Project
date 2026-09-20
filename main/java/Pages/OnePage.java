package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OnePage {
    WebDriver driver;
    public OnePage(WebDriver driver) {
        this.driver=driver;
    }
    private final By AddToCartSubmit = By.xpath("//a[contains(@onclick, 'addToCart(1)') and text()='Add to cart']");
    private By returnHomeButton=By.xpath("//a[@class='nav-link' and @href='index.html']");

    public void clickAddToCartSubmit() {
        driver.findElement(AddToCartSubmit).click();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
    public HomePage returnHomePage(){
        driver.findElement(returnHomeButton).click();
        return new HomePage(driver);
    }

}
