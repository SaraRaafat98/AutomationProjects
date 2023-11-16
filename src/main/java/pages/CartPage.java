package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private final WebDriver driver ;
    private final By PlaceOrder= By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void ClickOnPlaceOrder(){
            driver.findElement(PlaceOrder).click();
    }
}
