package newProject.step_definitions;

import io.cucumber.java.en.When;
import newProject.page.LogInPage;
import newProject.utilies.ConfigurationReader;
import newProject.utilies.Driver;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LogIn_StepDefinitions {

    LogInPage logInPage = new LogInPage();
    WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(),10);
//    String username = "actumdigital";
//    String password = "123456";

    @When("user clicks on log in button")
    public void user_clicks_on_log_in_button() {
        logInPage.getLogin().click();
    }
    @When("user clicks on username inputbox and enters the username")
    public void user_clicks_on_username_inputbox_and_enters_the_username() {
        logInPage.getUsername().sendKeys(ConfigurationReader.getProperty("username"));
    }
    @When("user clicks on password inputbox and enters the password")
    public void user_clicks_on_password_inputbox_and_enters_the_password() {
        logInPage.getPassword().sendKeys(ConfigurationReader.getProperty("password"));
    }
    @When("user clicks login button and verifies that logged in successfully")
    public void user_clicks_login_button_and_verifies_that_logged_in_successfully() throws InterruptedException {
        logInPage.getLogInButton().click();
        webDriverWait.until(ExpectedConditions.visibilityOf(logInPage.getNameOfUser()));
//        Driver.getDriver().manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
        //  Thread.sleep(2000);
        String actualResult = logInPage.getNameOfUser().getText();
        System.out.println(actualResult);
       Assert.assertTrue(actualResult.contains(ConfigurationReader.getProperty("username")));



    }
}
