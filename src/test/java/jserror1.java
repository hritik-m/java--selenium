
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class jserror1 {

    public RemoteWebDriver driver;

    public static final String AUTOMATE_USERNAME = "hritikmishra_Mb75Nr";
    public static final String AUTOMATE_ACCESS_KEY = "HtqCHwsiwHKpUycpLKbv";
    public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
    @BeforeTest
    public void main() throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("os_version", "10");
        caps.setCapability("resolution", "1920x1080");
        caps.setCapability("browser", "Chrome");
        caps.setCapability("browser_version", "latest");
        caps.setCapability("os", "Windows");
        caps.setCapability("name", "Sample Test");
        caps.setCapability("build", "BStack test");
        try {
            driver = new RemoteWebDriver(new URL(URL), caps);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
//        System.setProperty("webdriver.chrome.driver", "/Users/hritikmishra/Desktop/browserstack/driver/java/driver/chromedriver");
//        WebDriver driver = new ChromeDriver();
@Test
public void test() throws Exception {
        driver.get("https://www.amazon.com/javascriptrror");
        LogEntries jserror =  driver.manage().logs().get(LogType.BROWSER);
        System.out.println(jserror.getAll());
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("console.warn('xyz')");
        
        Set<String> logs = driver.manage().logs().getAvailableLogTypes();
        System.out.println(logs);

    
    
          Thread.sleep(4500);

}

    @AfterTest
    public void teardown() throws Exception {
        driver.quit();
    }
}

