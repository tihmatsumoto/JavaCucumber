import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

import static org.junit.Assert.*;

public class StepDefinitions {

    private LoginPage loginPage = new LoginPage();

    @Before()
    public void setUp() {
        loginPage.launchBrowser();
    }

    @Given("I am in the login page of Sauce Labs WebPage")
    public void i_am_in_the_login_page_of_Sauce_Labs_WebPage() {
        loginPage.open();
    }

    @When("I enter valid {string} and {string}")
    public void i_enter_valid_credentials(String username, String password) {
        loginPage.fillLogin(username);
        loginPage.fillPassword(password);
        loginPage.clickLoginButton();
    }

    @Then("I should be taken to the Inventory page")
    public void i_should_be_taken_to_the_Inventory_page() {
        assertEquals("https://www.saucedemo.com/inventory.html", loginPage.getPageURL());
    }

    @After()
    public void tearDown() {
        loginPage.tearDown();
    }
}
