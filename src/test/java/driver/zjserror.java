package driver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogType;

import java.util.Set;

public class zjserror {

    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.chrome.driver", "/Users/hritikmishra/Desktop/browserstack/driver/java/driver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/javascriptrror");
        LogEntries jserror =  driver.manage().logs().get(LogType.BROWSER);
        System.out.println(jserror.getAll());
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("console.warn('xyz')");

        Set<String> logs = driver.manage().logs().getAvailableLogTypes();
        System.out.println(logs);



        Thread.sleep(4500);

        driver.quit();
    }
}
