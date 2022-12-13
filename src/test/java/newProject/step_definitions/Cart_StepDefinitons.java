package newProject.step_definitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import newProject.page.CartPage;
import newProject.utilies.Driver;
import org.junit.Assert;

public class Cart_StepDefinitons {

    CartPage cartPage = new CartPage();
    Faker faker = new Faker();

    @When("user clicks on place order button")
    public void user_clicks_on_place_order_button() {
        cartPage.getPlaceOrderButton().click();
    }
    @When("user clicks the nameBox and types name")
    public void user_clicks_the_name_box_and_types_name() {
        cartPage.getName().click();
        cartPage.getName().sendKeys(faker.name().fullName());
    }
    @When("user clicks the countryBox and type a country")
    public void user_clicks_the_country_box_and_type_a_country() {
        cartPage.getCountry().click();
        cartPage.getCountry().sendKeys(faker.country().countryCode2());
    }
    @When("user clicks the cityBox and type a city")
    public void user_clicks_the_city_box_and_type_a_city() {
        cartPage.getCity().sendKeys(faker.country().capital());
    }
    @When("user clicks the CreditCardBox and types credit card number")
    public void user_clicks_the_credit_card_box_and_types_credit_card_number() {
        cartPage.getCreditCard().click();
        cartPage.getCreditCard().sendKeys(faker.number().digits(16));
    }
    @When("user clicks the monthBox and type card month")
    public void user_clicks_the_month_box_and_type_card_month() {
        cartPage.getMonth().click();
        cartPage.getMonth().sendKeys(Integer.toString(faker.number().numberBetween(1,12)));
    }
    @When("user clicks on yearBox and type card year")
    public void user_clicks_on_year_box_and_type_card_year() {
        cartPage.getYear().click();
        cartPage.getYear().sendKeys(Integer.toString(faker.number().numberBetween(2023,2030)));
    }
    @When("user clicks purchase button")
    public void user_clicks_purchase_button() {
        cartPage.getPurchaseButton().click();
    }
    @Then("user verifies the purchase and clicks on Ok button")
    public void user_verifies_the_purchase_and_clicks_on_ok_button() {
        Assert.assertTrue(cartPage.getConfirmationMessage().isDisplayed());
        cartPage.getOkButton().click();
        Driver.closeDriver();
    }
}
