package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage extends BasePage {

    private WebDriver driver;

    private By username = By.id("user-name");

    private By password = By.id("password");

    private By loginButton = By.cssSelector(".btn_action");

    public void launchBrowser() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
    }

    public void open()  {
        driver.get("https://www.saucedemo.com/");
    }

    private WebElement getUsername() {
        return driver.findElement(username);
    }

    private WebElement getPassword() {
        return driver.findElement(password);
    }

    private WebElement getLoginButton() {
        return driver.findElement(loginButton);
    }

    public void fillLogin(String login) {
        getUsername().sendKeys(login);
    }

    public void fillPassword(String password) {
        getPassword().sendKeys(password);
    }

    public void clickLoginButton() {
        getLoginButton().click();
    }

    public String getPageURL() {
        return driver.getCurrentUrl();
    }

    public void tearDown() {
        driver.quit();
    }
}
