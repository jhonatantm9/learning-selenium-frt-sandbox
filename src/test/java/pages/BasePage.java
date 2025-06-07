package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
    protected static WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    static {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
    }

    public static void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

    // Methods used by other pages
    private WebElement Find(String locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }

    public void navigateTo(String url) {
        driver.get(url);
    }

    public void clickElement(String locator) {
        Find(locator).click();
    }

    public String getTextFromElement(String locator) {
        return Find(locator).getText();
    }

    public void write(String locator, String keysToSend) {
        Find(locator).clear();
        Find(locator).sendKeys(keysToSend);
    }

    public void pause(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getValueFromElement(String locator) {
        return Find(locator).getDomProperty("value");
    }
}
