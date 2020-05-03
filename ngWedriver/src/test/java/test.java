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
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class test {

    WebDriver driver;

    @BeforeMethod
    public void check(){

        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
         driver.manage().window().maximize();
    }

    @Test
    public void kiran() throws InterruptedException {

        NgWebDriver ngWebDriver = new NgWebDriver((JavascriptExecutor) driver);
        driver.navigate().to("https://t2.devero.com/?site=qaautomation1");
        driver.findElement(By.name("username")).sendKeys("sa");
        driver.findElement(By.name("password")).sendKeys("testing123");
        driver.findElement(By.name("submitButton")).click();
    }

    @AfterMethod
    public void last(){

        driver.quit();
    }
}
