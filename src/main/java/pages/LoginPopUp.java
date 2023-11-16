package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPopUp {
    private final WebDriver driver;
    private final By usernameField=By.id("loginusername");
    private final By passwordField=By.id("loginpassword");
    private final By Loginbutton=By.xpath("//button[@onclick='logIn()']");

    public LoginPopUp(WebDriver driver) {
        this.driver = driver;
    }

    public void Setusername(String name){

      driver.findElement(usernameField).sendKeys(name);

    }

    public void Setpassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public void ClickonLogin() {
        driver.findElement(Loginbutton).click();
    }
}
