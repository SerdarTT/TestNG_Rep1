package Tests;

import Driver.Web;
import Pages.Invalid;
import org.testng.Assert;
import org.testng.annotations.Test;

public class invalidLogin extends Web {

    @Test(description = "User should not be able to sign in")
    public void invalidTest(){
        Invalid ipage = new Invalid();

        ipage.login("steterbas@gmail.com", "Ilyas");

        Assert.assertTrue(ipage.isErrorDisplay(), "Error is not displayed");

    }


}
