package newProject.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import newProject.page.CategoriesPage;
import newProject.utilies.ConfigurationReader;
import newProject.utilies.Driver;
import org.junit.Assert;
import org.openqa.selenium.Alert;

import java.io.IOException;

public class Categories_StepDefinitons {

    CategoriesPage categoriesPage = new CategoriesPage();

    @When("user clicks on Laptops button")
    public void user_clicks_on_laptops_button() {
        categoriesPage.getLaptops().click();
    }
    @When("user clicks one of the products from Laptops")
    public void user_clicks_one_of_the_products_from_laptops() throws IOException {
        categoriesPage.clickRandomItem();

    }
    @When("user clicks add to cart button and accept pop up message")
    public void user_clicks_add_to_cart_button_and_accept_pop_up_message() throws InterruptedException {
       categoriesPage.getAddToCart().click();
       Thread.sleep(2000);
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();
    }
    @When("user clicks cart button and verifies the added product")
    public void user_clicks_cart_button_and_verifies_the_added_product() {
       categoriesPage.assertion();

    }


    @Then("user deletes the product from cart")
    public void userDeletesTheProductFromCart() {
        categoriesPage.getDeleteButton().click();
        Driver.closeDriver();
    }
}
