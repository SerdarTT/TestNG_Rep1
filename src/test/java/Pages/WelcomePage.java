package Pages;

import org.openqa.selenium.By;

public class WelcomePage extends BasePage{

    By myAccountLink = By.xpath("//a[@class='button navi-link']");

    public boolean isMyAccountDisplayed(){ return isElementDisplayed(myAccountLink);}

}
