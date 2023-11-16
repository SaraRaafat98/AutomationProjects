package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PlaceOrderPage {
    private final WebDriver driver;
    private final By name= By.id("name");
    private final By country= By.id("country");
    private final By city= By.id("city");
    private final By CreditCard= By.id("card");
    private final By month= By.id("month");
    private final By year= By.id("year");
    private final By PurchaseButton=By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]");
    public PlaceOrderPage(WebDriver driver) {
        this.driver = driver;
    }
    public void AddName(String Name){
        name.findElement(driver).sendKeys(Name);
    }


    public void AddCountry(String Country){

        country.findElement(driver).sendKeys(Country);
    }

    public void AddCity(String City){
        city.findElement(driver).sendKeys(City);
    }

    public void AddCreditCard(String creditcard){
        CreditCard.findElement(driver).sendKeys(creditcard);
    }

    public void AddMonth(String Month){
        month.findElement(driver).sendKeys(Month);
    }

    public void AddYear(String Year){
        year.findElement(driver).sendKeys(Year);
    }
   public void ClickOnPurchase(){
        driver.findElement(PurchaseButton).click();

   }
}
