package test;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HandleIframe {
    public static void main(String[] args) {
        // init webdriver
        WebDriver driver = DriverFactory.getChromeDriver();
        try {
            //open target page
            driver.get("https://the-internet.herokuapp.com/iframe");
            By iframeNodeSelector = By.id("mce_0_ifr");
            By bodyIframeSelector = By.id("tinymce");
            WebElement iframeElem = driver.findElement(iframeNodeSelector);
            driver.switchTo().frame(iframeElem);

            WebElement iframeBodyElem = driver.findElement(bodyIframeSelector);
            iframeBodyElem.clear();
            iframeBodyElem.sendKeys("This is my new content !");

            //Switch Back to the main frame
            driver.switchTo().defaultContent();

            // debug purpose only
            Thread.sleep(2000);

        }catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
