package Tests;

import Driver.Web;
import Pages.LoginPage;
import Pages.WelcomePage;
import Utils.Helper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPTest extends Web {
    @Test(description = "User is able to login:")
    public void userCanLogin(){

        LoginPage lpage = new LoginPage();
        WelcomePage wpage = new WelcomePage();


        lpage.login("steterbas@gmail.com", "ILyas532?");
        Helper.doPrintScreen("login");
        Assert.assertTrue(wpage.isMyAccountDisplayed(), "My account link is not displayed");
    }


}
