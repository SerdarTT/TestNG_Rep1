package Pages;

import Driver.Web;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

public class BasePage {

    //FluentWait
    public WebElement findElementUsingFluentWait(By locator){
        Wait fwait = new FluentWait(Web.getDriver())
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoAlertPresentException.class)
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .withMessage("Element is found after 30 seconds of fluent wait");
        WebElement element = (WebElement) fwait.until(new Function<WebDriver, WebElement>(){
            public WebElement apply(WebDriver driver) { return driver.findElement(locator);}
        });
        return element;
    }


    public void clickThis(By locator){ findElementUsingFluentWait(locator).click();}
    public void type(By locator, String data){ findElementUsingFluentWait(locator).sendKeys(data);}
    public boolean isElementDisplayed(By locator){ return findElementUsingFluentWait(locator).isDisplayed(); }
    public boolean isElementEnabled(By locator){return findElementUsingFluentWait(locator).isEnabled();}
    public void selectDropDown(By locator, String data){
        WebElement element = findElementUsingFluentWait(locator);
        Select dropDown = new Select(element);
        dropDown.selectByVisibleText(data);
    }
    public void actionBuilder(By locator){
        WebElement element = findElementUsingFluentWait(locator);
        Actions action = new Actions((WebDriver) element);
        action.moveToElement(element).click().perform();

    }

}
