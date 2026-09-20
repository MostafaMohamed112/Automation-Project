package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EightPage {
    WebDriver driver;
    public EightPage(WebDriver driver) {
        this.driver=driver;
    }
    private final By addToCartButton=By.xpath("//a[contains(@class, 'btn-success') and text()='Add to cart']");

    public void clickAddToCartButton(){
        driver.findElement(addToCartButton).click();
    }
    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }
}