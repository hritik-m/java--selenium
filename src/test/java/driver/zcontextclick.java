package driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class zcontextclick {

    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.chrome.driver", "/Users/hritikmishra/Desktop/browserstack/driver/java/driver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/context_menu");
        Thread.sleep(7000);
        WebElement context= driver.findElement(By.id("hot-spot"));

        Actions action = new Actions(driver);
        action.contextClick(context).perform();


        driver.close();

    }
}