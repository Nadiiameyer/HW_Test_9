import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class GitHubTest extends BaseTest {

    @Test
    public void verifyThatLogioOnTheLoginPageIsDisplayed() {
        HomePage homePage = new HomePage(driver);
        Assertions.assertTrue(homePage.goToLoginPage().getLogo().isDisplayed());
    }

    @Test
    public void verifyLoginIsseccessful() {
        HomePage homePage = new HomePage(driver);
        Assertions.assertTrue(homePage.goToLoginPage().loginSuccessful("nadia.suworowa@hotmail.com",
                        "Cologne123!!!")
                .getLogoOnTheMainPage().isDisplayed());
    }

    @Disabled
    @Test
    public void verifyFailedLogin() {
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage().negativeLogin("uhdfurbj", "sedjvodkfb")
                .validateErrorMessage("Incorrect username or password.");
    }

    @Test
    public void testCreateNewIssue() {
        IssuesPage issuesPage = new IssuesPage(driver);
        issuesPage.clickNewIssueButton();
        issuesPage.fillOutIssueForm("Test task", "This is a test description of the task");
        issuesPage.submitIssue();
    }
}
