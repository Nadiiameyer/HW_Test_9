import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.sun.xml.internal.ws.client.ContentNegotiation.none;

public class IssuesPage extends BasePage {
    private WebDriver driver;
    private By newIssueButton = By.id("//*[@id=\"repo-content-turbo-frame\"]/div/div[2]/div[2]/a/span/span/span[1]\n");
    private By issueTitleField = By.id("issue_title");
    private By issueBodyField = By.id("issue_body");
    private By submitIssueButton = By.xpath("//button[contains(text(),'Submit new issue')]");
    private By issueList = By.xpath("//div[@id='issues-container']//span[@class='js-navigation-open']");

    public IssuesPage(WebDriver driver) {
        super(driver);
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




