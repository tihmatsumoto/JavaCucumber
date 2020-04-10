package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class StepDefinitions {

    private WebDriver driver;

    @Given("I am in the login page of Sauce Labs WebPage")
    public void i_am_in_the_login_page_of_Sauce_Labs_WebPage() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @When("I enter valid credentials")
    public void i_enter_valid_credentials() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector(".btn_action")).click();
    }

    @Then("I should be taken to the Inventory page")
    public void i_should_be_taken_to_the_Inventory_page() {
        assertEquals("https://www.saucedemo.com/inventory.html", driver.getCurrentUrl());
    }
}
