package Stepsdef;

import Pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginScenario {
    WebDriver driver=Hooks.getDriver();
    HomePage homePage=new HomePage(driver);
    OnePage onePage=new OnePage(driver);
    EightPage eightPage=new EightPage(driver);
    Products products=new Products(driver);
    PlaceOrder placeOrder=new PlaceOrder(driver);

    @Given("user open homepage and click on login link")
    public void userOpenHomepageAndClickOnLoginLink(){
        homePage.clickLogInButton();
    }

    @When("user enters {string} and {string} and press login")
    public void userEntersAndAndPressLogin(String username, String password) throws InterruptedException {
        homePage.enterUserName(username);
        homePage.enterPassword(password);
        homePage.clickSiubmitLogin();
        Thread.sleep(3000);
    }

    @And("user select one product")
    public void userSelectOneProduct() throws InterruptedException {
        homePage.clickOnSamsungGalaxyS6Link();
        Thread.sleep(3000);
        onePage.clickAddToCartSubmit();
        Thread.sleep(2000);
        onePage.acceptAlert();
        Thread.sleep(2000);
        onePage.returnHomePage();
        Thread.sleep(2000);
    }

    @And("user select second product")
    public void userSelectSecondProduct() throws InterruptedException {
        homePage.clickOnLaptopsLink();
        Thread.sleep(2000);
        homePage.clickSonyVaioi5Link();
        Thread.sleep(2000);
        eightPage.clickAddToCartButton();
        Thread.sleep(2000);
        eightPage.acceptAlert();
        Thread.sleep(2000);
    }

    @And("check the availability of products")
    public void checkTheAvailabilityOfProducts() throws InterruptedException {
        homePage.CartLink();
        Thread.sleep(2000);
        products.getProductNameLab();
        Thread.sleep(2000);
        products.getProductNamePhone();
        products.getTotalAmount();
        products.clickPlaceOrder();
        Thread.sleep(2000);
    }


    @Then("user request order by insert {string}and{string}and{string}and{string}and{string}and{string} and appear success message")
    public void userEnterAndAndAndAndAndAndAppearSuccessMessage(String username, String country, String city, String card, String month, String year) throws InterruptedException {
        placeOrder.enterName(username);
        placeOrder.enterCountry(country);
        placeOrder.enterCity(city);
        placeOrder.enterCard(card);
        placeOrder.enterMonth(month);
        placeOrder.enterYear(year);
        placeOrder.enterPurchaseButton();
        Thread.sleep(2000);
        placeOrder.getvalidtionMessage();
        Thread.sleep(2000);
        placeOrder.clickOkButton();
        Thread.sleep(2000);
    }

}
