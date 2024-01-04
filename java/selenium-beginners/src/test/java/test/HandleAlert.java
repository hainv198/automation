package test;

import driver.DriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HandleAlert {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();

        try {
            driver.get("https://the-internet.herokuapp.com/javascript_alerts");
            final By jsAlertBtnSelect = By.cssSelector("[onclick=\"jsAlert()\"]");
            final By jsConfirmBtnSelect = By.cssSelector("[onclick=\"jsConfirm()\"]");
            final By jsPromptBtnSelect = By.cssSelector("[onclick=\"jsPrompt()\"]");
            final By result = By.id("result");

            driver.findElement(jsAlertBtnSelect).click();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            System.out.printf("Alert content :" + alert.getText());
            alert.accept();
//            driver.findElement(result).getText();
            System.out.printf(driver.findElement(result).getText());


            // get alert confirm
            driver.findElement(jsConfirmBtnSelect).click();
            alert = wait.until(ExpectedConditions.alertIsPresent());
            System.out.printf("Alert confirm :" + alert.getText());

            alert.dismiss();
            System.out.printf(driver.findElement(result).getText());

            // play with prompt js
            driver.findElement(jsPromptBtnSelect).click();
            alert = wait.until(ExpectedConditions.alertIsPresent());
            System.out.printf("Alert prompt" + alert.getText());
            alert.sendKeys("Hainv");
            alert.accept();
            System.out.printf(driver.findElement(result).getText());


            // debug only
            Thread.sleep(2000);
        }catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
