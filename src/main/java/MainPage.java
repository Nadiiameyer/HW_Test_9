import org.example.ProfilePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage {
    private By imgLocator = By.xpath("(//img[@class='avatar circle'])[1]");
    private final static String TITLE = "MainPage";

    public MainPage(WebDriver driver, TITLE) {

        super(driver);
    }

    public WebElement getLogoOnTheMainPage() {
        return driver.findElement(imgLocator);
    }
}
