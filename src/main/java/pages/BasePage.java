package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BasePage {

    public BasePage()
    {
    }

    protected void sleep (Integer milliSeconds) {
        long secondsLong = (long) milliSeconds;
        try {
            Thread.sleep(secondsLong);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
