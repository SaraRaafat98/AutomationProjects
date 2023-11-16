package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {
    private final  WebDriver driver;
    private final By SamsungGalaxy= By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPopUp clickLogin()
    {
       driver.findElement(By.id("login2")).click();
       return new LoginPopUp(driver);
    }
    public void ClickOnSamsungGalaxy(){
        driver.findElement(SamsungGalaxy).click();
    }

}
