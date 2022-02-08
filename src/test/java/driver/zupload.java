package driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zupload {

    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.chrome.driver", "/Users/hritikmishra/Desktop/browserstack/driver/java/driver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/upload");

        WebElement upload= driver.findElement(By.id("file-upload"));
        upload.sendKeys("/Users/hritikmishra/Desktop/my website/pic/browserstackpic.png");

        WebElement done = driver.findElement(By.id("file-submit"));
        done.click();
        Thread.sleep(4000);
        driver.close();

    }
}
