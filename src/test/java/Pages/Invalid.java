package Pages;

import org.openqa.selenium.By;

import static jdk.nashorn.internal.objects.NativeJava.type;

public class Invalid extends BasePage{
    By userName = By.id("email");
    By userPwd = By.id("password");
    By clickLogin = By.xpath("//button[contains(text(),'Log in')]");
    By errorMessage = By.xpath("//p[@class='error']");

    public void enterUsername(String user){ type(userName, user);}
    public void enterUserPwd(String pwd){type(userPwd, pwd);}
    public void clickToLogin(){clickThis(clickLogin);}
    public boolean isErrorDisplay(){ return isElementDisplayed(errorMessage);}

    public void login(String user1, String pwd1){
        enterUsername(user1);
        enterUserPwd(pwd1);
        clickToLogin();}

}
