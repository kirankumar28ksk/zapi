import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;


public class TC1_Login {
    WebDriver driver;

//    @BeforeClass
//    public static void setupClass() {
//        WebDriverManager.chromedriver().setup();
//    }

    @Test
    public void kiran()  {
        System.out.println("testing driver---------");
        String path = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",path+"/src/test/resources/chromedriver");
//        System.setProperty("webdriver.chrome.whitelistedIps", "");
        DesiredCapabilities cp1 = DesiredCapabilities.chrome();
        cp1.setCapability("chrome.switches", Arrays.asList("--disable-popup-blocking"));
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox"); //Bypass OS security model
        options.addArguments("--start-maximized");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        System.out.println("Login");
        driver.navigate().to("https://t2.devero.com/?site=qaautomation1");
        driver.findElement(By.name("username")).sendKeys("sa");
        driver.findElement(By.name("password")).sendKeys("testing123");
        driver.findElement(By.name("submitButton")).click();
    }

    @AfterMethod
    public void restore()
    {
        driver.quit();
    }
}
