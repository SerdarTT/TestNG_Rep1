package Driver;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import java.util.concurrent.TimeUnit;

public class Web {
    private static WebDriver driver = null;
    public void initDriver(){
        System.setProperty("webdriver.chrome.driver", "./driverExecFile/chromedriver");
        driver.get("https://edube.org/login");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void quitDriver(){
        driver.quit();
    }
    public static WebDriver getDriver(){ return driver; }

}
