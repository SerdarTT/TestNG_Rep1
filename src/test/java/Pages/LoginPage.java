package Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class LoginPage extends BasePage{



    By userName = By.id("email");
    By userPwd = By.id("password");
    By clickLogin = By.xpath("//button[contains(text(),'Log in')]");

    @Step("Enter userName in the username box")
    public void enterUsername(String user){ type(userName, user);}
    @Step("Enter user password")
    public void enterUserPwd(String pwd){type(userPwd, pwd);}
    @Step("Click on Login Button")
    public void clickToLogin(){clickThis(clickLogin);}
    @Step("Login OpenEDG webPage")
    public void login(String user1, String pwd1){
        enterUsername(user1);
        enterUserPwd(pwd1);
        clickToLogin();}




}
