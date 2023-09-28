import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class HomePage extends BasePage {
    private By signInButtonLocator = By.xpath("//a[contains(text(), \"Sign in\")]");
    private By newIssueButton = By.id("//*[@id=\"repo-content-turbo-frame\"]/div/div[2]/div[2]/a/span/span/span[1]\n");
    private By issueTitleField = By.id("issue_title");
    private By issueBodyField = By.id("issue_body");
    private By submitIssueButton = By.xpath("//button[contains(text(),'Submit new issue')]");
    private By issueList = By.xpath("//div[@id='issues-container']//span[@class='js-navigation-open']");

private final static String TITLE = "Home Page";
    public HomePage(WebDriver driver) {
        super(driver,TITLE);
    }

    public LoginPage goToLoginPage() {
        webDriverWait.until(elementToBeClickable(driver.findElement(signInButtonLocator)));
        driver.findElement(signInButtonLocator).click();
        return new LoginPage(driver);
    }

    public void fillOutIssueForm(String title, String body) {
        driver.findElement(issueTitleField).sendKeys(title);
        driver.findElement(issueBodyField).sendKeys(body);
    }

    public void submitIssue() {
        driver.findElement(submitIssueButton).click();
    }

    public void clickNewIssueButton() {
        WebElement buttonElement = driver.findElement(newIssueButton);
        if (buttonElement.isDisplayed() && buttonElement.isEnabled()) {
            buttonElement.click();
        } else {
            throw new RuntimeException("New Issue button is not displayed or enabled.");
        }

    }
}

