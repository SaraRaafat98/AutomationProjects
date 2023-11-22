package BaseTest;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import java.time.Duration;

import pages.*;

public class BaseTest {
    public WebDriver driver;
    public HomePage homePage;


    @BeforeTest
    public void SetDriver(){
            driver = new FirefoxDriver();
            System.setProperty("webdriver.gecko.driver","resources\\geckodriver.exe");
            driver.get("https://demoblaze.com/");
            driver.manage().window().maximize();
            homePage= new HomePage(driver);
        }

        @AfterTest
    public void Teardown(){
        driver.close();
    }

    }

