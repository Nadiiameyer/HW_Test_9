import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;




public class GitHubTest extends BaseTest {
protected Logger logger;
    @Test
    public void verifyThatLogioOnTheLoginPageIsDisplayed() {
        Logger logger = LogManager.getLogger();
        logger.info("verifyThatLogioOnTheLoginPageIsDisplayed is starting");
        HomePage homePage = new HomePage(driver);
        Assertions.assertTrue(homePage.goToLoginPage().getLogo().isDisplayed());
    }
    @Test
    public void verifyLoginIsseccessful() {
        Logger logger = LogManager.getLogger();
        logger.info("verifyLoginIsseccessful is starting");
        HomePage homePage = new HomePage(driver);
        Assertions.assertTrue(homePage.goToLoginPage().loginSuccessful("nadia.suworowa@hotmail.com",
                        "Cologne123!!!")
                .getLogoOnTheMainPage().isDisplayed());
    }
    @Disabled
    @Test
    public void verifyFailedLogin() {
        Logger logger = LogManager.getLogger();
        logger.info("verifyFailedLogin is starting");
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage().negativeLogin("uhdfurbj", "sedjvodkfb")
                .validateErrorMessage("Incorrect username or password.");
    }
}
