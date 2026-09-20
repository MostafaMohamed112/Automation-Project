package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Products {
    WebDriver driver;
    public Products (WebDriver driver) {
    this.driver=driver;
    }
    //Locators
   private By getTextProductName1= By.xpath("//td[contains(text(), 'Sony vaio i5')]");
    private By getTextProductName2= By.xpath("//td[contains(text(), 'Samsung galaxy s6')]");
    private By TotalAmount=By.id("totalp");
    //place order
    private By placeOrderButton=By.xpath("//button[@data-toggle='modal' and text()='Place Order']");

    //Action
   public String getProductNameLab(){
        return driver.findElement(getTextProductName1).getText();
    }
    public String getProductNamePhone (){
       return driver.findElement(getTextProductName2).getText();
    }
    public String getTotalAmount() {
       return driver.findElement(TotalAmount).getText();
    }
    public PlaceOrder clickPlaceOrder() {
        driver.findElement(placeOrderButton).click();
        return new PlaceOrder(driver);
    }
}
