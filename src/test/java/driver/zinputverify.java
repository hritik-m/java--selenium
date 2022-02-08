package driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class zinputverify {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/hritikmishra/Desktop/browserstack/driver/java/driver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/login");
        WebElement username = driver.findElement(new By.ById("username"));
        username.sendKeys("hritik mishra");
        String input = username.getAttribute("value");

        WebElement password = driver.findElement(new By.ById("password"));
        password.sendKeys("abcdef");
        String attribute = password.getAttribute("value");
        if(attribute.contains("abcdef") && (input.contains("hritik mishra")))
        {
            System.out.println(input);
            System.out.println(attribute);
        }
        else
        {
            System.out.println("wrong answer");
        }
        driver.close();
    }
}
