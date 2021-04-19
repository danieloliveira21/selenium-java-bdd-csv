package commons;

import bean.interfaces.WebApplication;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected static WebDriver webDriver;
    protected static WebDriverWait wait;


    protected void initializeWebApplication(WebApplication webApplication) {
        webDriver = webApplication.getDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        wait = new WebDriverWait(webDriver, 15);
    }

    protected static void closeWeb() {
        webDriver.quit();
    }

}
