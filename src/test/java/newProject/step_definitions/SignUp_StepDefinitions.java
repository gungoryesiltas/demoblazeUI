package newProject.step_definitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import newProject.page.SignUpPage;
import newProject.utilies.ConfigurationReader;
import newProject.utilies.Driver;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.concurrent.TimeUnit;

public class SignUp_StepDefinitions {

    SignUpPage signUpPage =new SignUpPage();
    Faker faker = new Faker();
    WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(),10);
    String username = faker.name().username();
    String password = faker.numerify("####?????");


    @When("user goes to demoblaze page")
    public void user_goes_to_demoblaze_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "STORE";
        Assert.assertEquals(expectedTitle,actualTitle);
    }
    @When("user clicks on sign up button")
    public void user_clicks_on_sign_up_button() {
        signUpPage.getSignUpbutton().click();
    }
    @When("user clicks on username input box and enters the username")
    public void user_clicks_on_username_input_box_and_enters_the_username() {
        signUpPage.getSignUpUsername().sendKeys(username);
    }
    @When("user clicks on password input box and enters the password")
    public void user_clicks_on_password_input_box_and_enters_the_password() {
        signUpPage.getSignUpPassword().sendKeys(password);
    }
    @Then("user clicks on sign up button and verifies that signed up successfully")
    public void user_clicks_on_sign_up_button_and_verifies_that_signed_up_successfully() throws InterruptedException {
        signUpPage.getSignUpClick().click();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(2000);
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();
        Assert.assertTrue(signUpPage.getLoginButton().isEnabled());
        Driver.closeDriver();

    }

}
