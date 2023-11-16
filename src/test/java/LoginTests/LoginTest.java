package LoginTests;
import BaseTest.BaseTest;
import org.testng.annotations.Test;
import pages.*;



public class LoginTest extends BaseTest {


    @Test (priority = 0)
    public void TestLoginSuccessfully() throws InterruptedException {
        LoginPopUp loginPopUp =homePage.clickLogin();
        loginPopUp.Setusername("SaraRaafat");
        loginPopUp.Setpassword("123456");
        loginPopUp.ClickonLogin();

    }


}
