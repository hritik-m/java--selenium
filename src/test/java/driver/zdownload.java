package driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class zdownload {

    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "/Users/hritikmishra/Desktop/browserstack/driver/java/driver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/download");

        WebElement download = driver.findElement(By.xpath("/html/body/div[2]/div/div/a[2]"));
        download.click();

        Thread.sleep(4000);

        driver.quit();

    }
}

