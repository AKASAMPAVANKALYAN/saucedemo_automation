package stepdefinitions;

import io.cucumber.java.en.*;
import pages.*;

public class CheckoutSteps {

    LoginPage loginPage = new LoginPage();
    ProductPage productPage = new ProductPage();
    CheckoutPage checkoutPage = new CheckoutPage();

    @Given("User launches the browser and opens SauceDemo site")
    public void user_launches_browser() {
        // Already handled in BasePage via Hooks
    }

    @When("User logs in with valid credentials")
    public void user_logs_in() {
        loginPage.login("standard_user", "secret_sauce");
    }

    @When("User selects product number {string}")
    public void user_selects_product(String number) throws InterruptedException {
        int productNumber = Integer.parseInt(number);
        productPage.selectProduct(productNumber);
    }

    @When("User fills in checkout details from Excel")
    public void user_enters_checkout_info() throws Exception {
        checkoutPage.checkoutFromExcel("./src/test/resources/seleniumtestdata.xlsx");
    }

    @Then("User should see the thank you message and logout")
    public void user_should_see_thank_you() throws InterruptedException {
        checkoutPage.logout();
    }
}
