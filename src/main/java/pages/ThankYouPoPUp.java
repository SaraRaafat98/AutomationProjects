package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

public class ThankYouPoPUp {
    private final WebDriver driver;
    private By OK= By.xpath("/html/body/div[10]/div[7]/div/button");

    public ThankYouPoPUp(WebDriver driver) {
        this.driver = driver;
    }

    public void ClickOnOk(){
        driver.findElement(OK).click();
    }
}
