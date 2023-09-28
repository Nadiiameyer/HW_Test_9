import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import
import java.time.Duration;

import java.util.logging.LogManager;
import org.apache.logging.log4j.Logger;

import static helpers.ColorPrinter.printColorMessage;
import static jdk.nashorn.internal.runtime.Context.DEBUG;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait webDriverWait;
    protected Logger log;
    protected String title;

    public  BasePage(WebDriver driver) {
        this.driver = driver;
        this.title=titel;
        this.webDriverWait = webDriverWait;
        webDriverWait = new WebDriverWait(driver, Duration.ofMillis(3));
        this.log= (Logger) LogManager.getLogger(this.title);
        printColorMessage("Page object of " + title + this.getClass().getName(), log, DEBUG);
    }}

