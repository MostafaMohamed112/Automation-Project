package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PlaceOrder {
    WebDriver driver;
    public PlaceOrder(WebDriver driver) {
        this.driver=driver;
    }
//Locators
    //private By requestOrder= By.xpath("//button[@type='button' and contains(@class, 'btn-success')]");
    private By Name=By.id("name");
    private By Country=By.id("country");
    private By City=By.id("city");
    private By crediCard=By.id("card");
    private By Month=By.id("month");
    private By Year=By.id("year");
    private By purchaseButton=By.xpath("//button[@type='button' and @class='btn btn-primary' and @onclick='purchaseOrder()']");
    private By validtion=By.xpath("//h2[text()='Thank you for your purchase!']");
    private By OkButton=By.xpath("//button[contains(text(), 'OK') and contains(@class, 'confirm')]");

    //Action
    public void enterName(String name) {
        driver.findElement(Name).sendKeys(name);
    }
    public void enterCountry(String country) {
        driver.findElement(Country).sendKeys(country);
    }
    public void enterCity(String city) {
        driver.findElement(City).sendKeys(city);
    }
    public void enterCard(String card) {
        driver.findElement(crediCard).sendKeys(card);
    }
    public void enterMonth(String month) {
        driver.findElement(Month).sendKeys(month);
    }
    public void enterYear(String year) {
        driver.findElement(Year).sendKeys(year);
    }
    public void enterPurchaseButton(){
        driver.findElement(purchaseButton).click();
    }
    public String getvalidtionMessage(){
        String text =driver.findElement(validtion).getText();
        return text;
    }
    public void clickOkButton(){
        driver.findElement(OkButton).click();
    }
}
