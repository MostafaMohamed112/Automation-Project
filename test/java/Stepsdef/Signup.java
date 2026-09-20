package Stepsdef;

import Pages.SignupPage1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Signup {
    WebDriver driver=Hooks.getDriver();
    SignupPage1 signupPage1=new SignupPage1 (driver);

@Given("user open pedg and click on sign up link")
    public void userOpenPedgAndClickOnSignUpLink() throws InterruptedException {
    signupPage1.clickSignUpButton();
    Thread.sleep(3000);
    }

    @When("user enter {string} and {string} and press sign up")
    public void userEnterAndAndPressSignUp(String Username, String Password) throws InterruptedException {
        signupPage1.enterUserName(Username);
        signupPage1.enterPassword(Password);
        signupPage1.clickSiubmitSignup();
        Thread.sleep(3000);
    }

    @Then("accept alert")
    public void acceptAlert() throws InterruptedException {
    Thread.sleep(3000);
    signupPage1.acceptAlert();
    Thread.sleep(3000);
    }

}
