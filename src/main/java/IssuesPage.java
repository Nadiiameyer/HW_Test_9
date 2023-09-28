import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.sun.xml.internal.ws.client.ContentNegotiation.none;
import static javax.swing.text.html.HTML.Attribute.TITLE;

public class IssuesPage extends BasePage {
    private WebDriver driver;
    private final static String TITLE = "IssuesPage";

    public IssuesPage(WebDriver driver) {
        super(driver,TITLE);
    }

    public void clickNewIssueButton() {
    }

    public void fillOutIssueForm(String test_task, String s) {
    }

    public void submitIssue() {
    }
}




