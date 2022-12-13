package newProject.page;

import newProject.utilies.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {

    public SignUpPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "signin2")
    private WebElement signUpbutton;

    @FindBy (id = "sign-username")
    private WebElement signUpUsername;

    @FindBy (id = "sign-password")
    private WebElement signUpPassword;

    @FindBy (xpath = "//button[.='Sign up']")
    private WebElement signUpClick;

    @FindBy (id = "login2")
    private WebElement loginButton;



    public WebElement getSignUpbutton() {
        return signUpbutton;
    }

    public WebElement getSignUpUsername() {
        return signUpUsername;
    }

    public WebElement getSignUpPassword() {
        return signUpPassword;
    }

    public WebElement getSignUpClick() {
        return signUpClick;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }
}
