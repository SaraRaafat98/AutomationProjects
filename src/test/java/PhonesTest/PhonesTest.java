package PhonesTest;

import BaseTest.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.Test;
import pages.*;


public class PhonesTest extends BaseTest {
 private final SamsungGalaxyPage samsungGalaxyPage= new SamsungGalaxyPage(driver);

    @Test
    public void TestClickOnPhones() throws InterruptedException {
        LoginPopUp loginPopUp = homePage.clickLogin();
        loginPopUp.Setusername("SaraRaafat");
        loginPopUp.Setpassword("123456");
        Thread.sleep(2000);
        loginPopUp.ClickonLogin();
        Thread.sleep(2000);
            homePage.ClickOnSamsungGalaxy();
            Thread.sleep(2000);
            samsungGalaxyPage.ClickOnAddToCart(this.driver);
            Thread.sleep(2000);
            try {
                Alert alt = driver.switchTo().alert();
                alt.accept();
            } catch (NoAlertPresentException ignored) {
            }
            Thread.sleep(1000);
            samsungGalaxyPage.ClickCart(this.driver);
            Thread.sleep(1000);
            CartPage cartPage = new CartPage(this.driver);
            cartPage.ClickOnPlaceOrder();
            Thread.sleep(1000);

            PlaceOrderPage placeOrderPage = new PlaceOrderPage(this.driver);
            placeOrderPage.AddName("Sara");
            placeOrderPage.AddCountry("Egypt");
            placeOrderPage.AddCity("Alexandria");
            placeOrderPage.AddCreditCard("2485555555512");
            placeOrderPage.AddMonth("11");
            placeOrderPage.AddYear("2023");
            Thread.sleep(1000);
            placeOrderPage.ClickOnPurchase();
            Thread.sleep(1000);


            ThankYouPoPUp thankYouPoPUp = new ThankYouPoPUp(driver);
            thankYouPoPUp.ClickOnOk();

        }

    }

