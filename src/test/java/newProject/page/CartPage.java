package newProject.page;

import newProject.utilies.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    public CartPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@class='btn btn-success']")
    private WebElement placeOrderButton;

    @FindBy(id = "name")
    private WebElement name;

    @FindBy(id = "country")
    private WebElement country;

    @FindBy(id = "city")
    private WebElement city;

    @FindBy(id = "card")
    private WebElement creditCard;

    @FindBy(id = "month")
    private WebElement month;

    @FindBy(id = "year")
    private WebElement year;

    @FindBy(xpath = "//button[.='Purchase']")
    private WebElement purchaseButton;

    @FindBy(xpath = "//h2[.='Thank you for your purchase!']")
    private WebElement confirmationMessage;

    @FindBy(xpath = "//button[.='OK']")
    private WebElement OkButton;

    public WebElement getPlaceOrderButton() {
        return placeOrderButton;
    }

    public WebElement getName() {
        return name;
    }

    public WebElement getCountry() {
        return country;
    }

    public WebElement getCity() {
        return city;
    }

    public WebElement getCreditCard() {
        return creditCard;
    }

    public WebElement getMonth() {
        return month;
    }

    public WebElement getYear() {
        return year;
    }

    public WebElement getPurchaseButton() {
        return purchaseButton;
    }

    public WebElement getConfirmationMessage() {
        return confirmationMessage;
    }

    public WebElement getOkButton() {
        return OkButton;
    }
}
