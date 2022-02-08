package driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ziframe {

    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.chrome.driver", "/Users/hritikmishra/Desktop/browserstack/driver/java/driver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/nested_frames");

        driver.switchTo().frame("frame-left");

        WebElement left = driver.findElement(By.xpath("/html/frameset/frame[1]"));
        left.click();

        driver.switchTo().frame("frame-right");

        WebElement right = driver.findElement(By.xpath("/html/frameset/frame[3]"));
        right.click();

        Thread.sleep(3000);
        driver.close();
    }
}
