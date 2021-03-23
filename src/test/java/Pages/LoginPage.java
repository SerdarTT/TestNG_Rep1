package Pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{



    By userName = By.id("email");
    By userPwd = By.id("password");
    By clickLogin = By.xpath("//button[contains(text(),'Log in')]");

    public void enterUsername(String user){ type(userName, user);}
    public void enterUserPwd(String pwd){type(userPwd, pwd);}
    public void clickToLogin(){clickThis(clickLogin);}

    public void login(String user1, String pwd1){
        enterUsername(user1);
        enterUserPwd(pwd1);
        clickToLogin();}




}
