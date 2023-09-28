import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

    public class LoginPage extends BasePage {

        private By loginFieldLocator = By.id("login_field");
        private By passwordFieldLocator = By.id("password");
        private By submitLoginButtonLocator = By.xpath("//input[@value=\"Sign in\"]");
        private By logoLocator = By.className("header-logo");
        private By errorTextLocator = By.xpath("//div[contains(text(), 'Incorrect username or password.')]");

        private final static String TITLE = "LoginPage";
        public LoginPage(WebDriver driver,TITLE) {

            super(driver);
        }

        public WebElement getLogo() {

            return driver.findElement(logoLocator);
        }

        public MainPage loginSuccessful(String login, String password) {
            log.info("loginSuccessful is starting");
            driver.findElement(loginFieldLocator).sendKeys(login);
            driver.findElement(passwordFieldLocator).sendKeys(password);
            driver.findElement(submitLoginButtonLocator).click();
            log.info("Login is successful");
            return new MainPage(driver);
        }

        public LoginPage negativeLogin(String login, String password) {
            driver.findElement(loginFieldLocator).sendKeys(login);
            driver.findElement(passwordFieldLocator).sendKeys(password);
            driver.findElement(submitLoginButtonLocator).click();
            return this;
        }
        public LoginPage validateErrorMessage(String expectedMessage){
            Assertions.assertEquals(expectedMessage, driver.findElement(errorTextLocator).getText(),
                    "Actual error text doesn't equal to expected message");
            return this;
        }
        public LoginPage validateAuthFieldsAreDisplayed(){
            Assertions.assertTrue(driver.findElement(loginFieldLocator).isDisplayed());
            Assertions.assertTrue(driver.findElement(loginFieldLocator).isDisplayed());
            Assertions.assertTrue(driver.findElement(loginFieldLocator).isDisplayed());
            return this;
        }
    }

