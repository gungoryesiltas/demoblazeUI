package newProject.page;

import newProject.utilies.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {

    public LogInPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id="login2")
    private WebElement login;

    @FindBy (id="loginusername")
    private WebElement username;

    @FindBy (id="loginpassword")
    private WebElement password;

    @FindBy (xpath = "//button[.='Log in']")
    private WebElement logInButton;

    @FindBy (id="nameofuser")
    private WebElement nameOfUser;

    public WebElement getLogin() {
        return login;
    }

    public WebElement getUsername() {
        return username;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getLogInButton() {
        return logInButton;
    }

    public WebElement getNameOfUser() {
        return nameOfUser;
    }
}
