package newProject.page;

import newProject.utilies.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;
import java.util.Random;

public class CategoriesPage {

    public CategoriesPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//a[.='Laptops']")
    private WebElement laptops;

    @FindBy (xpath = "//a[.='MacBook Pro']")
    private WebElement product;

    @FindBy (xpath ="//a[.='Add to cart']")
    private WebElement addToCart;

    @FindBy (id="cartur")
    private WebElement cart;

    @FindBy (xpath = "(//td)[2]")
    private WebElement cartProduct;

    @FindBy (xpath = "//a[.='Delete']")
    private WebElement deleteButton;

    public WebElement getLaptops() {
        return laptops;
    }

    public WebElement getProduct() {
        return product;
    }

    public WebElement getAddToCart() {
        return addToCart;
    }

    public WebElement getCart() {
        return cart;
    }

    public WebElement getCartProduct() {
        return cartProduct;
    }

    public WebElement getDeleteButton() {
        return deleteButton;
    }

    String productName = "";

        public void clickRandomItem() throws IOException {
        Random randomizer = new Random();
        List<WebElement> elements = Driver.getDriver().findElements(By.xpath("//a[@class='hrefch']"));
        WebElement randomProduct = elements.get(randomizer.nextInt(elements.size()));
        productName = randomProduct.getText();
        randomProduct.click();

    }


    public void assertion() {
        getCart().click();
        String actualResult = getCartProduct().getText();
        String expectedResult = productName;
        Assert.assertEquals(expectedResult,actualResult);
    }
}
