import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.ByAngularExactBinding;
import com.paulhammant.ngwebdriver.NgWebDriver;
import com.sun.javafx.sg.prism.web.NGWebView;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TC1_Login {

    WebDriver driver;

    @BeforeMethod
    public void check(){

//        WebDriverManager.firefoxdriver().setup();
//         driver = new FirefoxDriver();
//         driver.manage().window().maximize();
    }

    @Test
    public void kiran()  {


        String path = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",path+"/src/test/resources/chromedriver");
//                System.setProperty("webdriver.gecko.driver",path+"/src/test/resources/geckodriver");
        driver = new ChromeDriver();
//        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//        capabilities.setCapability("marionette", true);
//        driver = new FirefoxDriver(capabilities);
//        NgWebDriver ngWebDriver = new NgWebDriver((JavascriptExecutor) driver);
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
