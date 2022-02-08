import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.URL;

public class upload1 {
    //http://192.168.1.6:4444
    /*
    public  RemoteWebDriver driver = null;


	  @BeforeTest
	  public void setUp() throws Exception {

	      ChromeOptions options = new ChromeOptions();
	       options.setAcceptInsecureCerts(true);
	       options.setCapability(CapabilityType.BROWSER_NAME,"chrome");

	      try {
	    	   driver = new RemoteWebDriver(new URL("http://localhost:4444"), options);

	      } catch (MalformedURLException e) {
	          System.out.println("Invalid grid URL");
	      } catch (Exception e) {
	          System.out.println(e.getMessage());
	      }
     */
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
//        System.setProperty("webdriver.chrome.driver", "/Users/hritikmishra/Desktop/browserstack/driver/java/driver/chromedriver");
//        WebDriver driver = new ChromeDriver();
@Test
public void test() throws Exception {
        driver.get("https://the-internet.herokuapp.com/upload");

        WebElement upload= driver.findElement(By.id("file-upload"));
        upload.sendKeys("/Users/hritikmishra/Desktop/my website/pic/browserstackpic.png");

        WebElement done = driver.findElement(By.id("file-submit"));
        done.click();
        Thread.sleep(4000);
}

    @AfterTest
    public void teardown() throws Exception {
        driver.quit();
    }

}
