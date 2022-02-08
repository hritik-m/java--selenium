import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

class inputverify1 {

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
    // java -jar selenium-server-4.1.2.jar hub
    //http://localhost:4444/ui/index.html#/
//        System.setProperty("webdriver.chrome.driver", "/Users/hritikmishra/Desktop/browserstack/driver/java/driver/chromedriver");
//        WebDriver driver = new ChromeDriver();
@Test
public void test() throws Exception {
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
}

    @AfterTest
    public void teardown() throws Exception {
        driver.quit();
    }
    }
