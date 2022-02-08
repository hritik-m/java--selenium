package driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zcheckradio {


    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.chrome.driver", "/Users/hritikmishra/Desktop/browserstack/driver/java/driver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.guru99.com/test/radio.html");

        WebElement Radiobox= driver.findElement(By.xpath("/html/body/div[4]/input[1]"));
        Radiobox.click();
        WebElement Radiobox1= driver.findElement(By.xpath("/html/body/div[4]/input[2]"));
        Radiobox1.click();
        WebElement checkbox= driver.findElement(By.xpath("/html/body/div[4]/input[4]"));
        checkbox.click();
        WebElement checkbox1= driver.findElement(By.xpath("/html/body/div[4]/input[6]"));
        checkbox1.click();
        Thread.sleep(1000);

        driver.close();



    }
}

