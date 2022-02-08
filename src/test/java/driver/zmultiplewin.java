package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class zmultiplewin {

    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.chrome.driver", "/Users/hritikmishra/Desktop/browserstack/driver/java/driver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/windows");
        Thread.sleep(5000);
        // Thread.sleep(5000);
        // WebElement newwin = driver.findElement(By.xpath("/html/body/div[2]/div/div/a"));
        // newwin.click();
        driver.switchTo().newWindow(WindowType.TAB).get("https://the-internet.herokuapp.com/windows/new");
        //driver.get("https://the-internet.herokuapp.com/windows/new");
        Thread.sleep(3000);
        driver.close();

    }
}

