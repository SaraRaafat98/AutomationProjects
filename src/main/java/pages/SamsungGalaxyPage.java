package pages;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.lang.model.element.Element;

public class SamsungGalaxyPage {
    private final WebDriver driver;
    private final By AddToCart = By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a");
    private final By Cart = By.id("cartur");


    public SamsungGalaxyPage(WebDriver driver) {
        this.driver = driver;
    }

    public void ClickOnAddToCart(WebDriver driver) {
            driver.findElement(AddToCart).click();
    }
    public CartPage ClickCart(WebDriver driver) {
            driver.findElement(Cart).click();
        return new CartPage(driver);
        }
}
