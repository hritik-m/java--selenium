package driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class zdropdown {

    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.chrome.driver", "/Users/hritikmishra/Desktop/browserstack/driver/java/driver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/dropdown");

        // WebElement drop = driver.findElement(By.id("dropdown"));
        // drop.click();
        // WebElement option = driver.findElement(By.xpath("/html/body/div[2]/div/div/select/option[2]"));
        // option.click();

        Select dropoption = new Select(driver.findElement(By.id("dropdown")));
        dropoption.selectByValue("1");
        Thread.sleep(7000);
        driver.close();



    }
}
