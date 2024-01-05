package test;
import driver.DriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class ContextMenu {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();
        try {
            driver.get("https://the-internet.herokuapp.com/context_menu");
            By rightClickPlace = By.id("hot-spot");
            Actions actions = new Actions(driver);
            WebElement rightClickPlaceElement = driver.findElement(rightClickPlace);
            actions.contextClick(rightClickPlaceElement).perform();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            System.out.printf(alert.getText());
            alert.accept();

            // this is to refresh the page remove the triggered context menu
            driver.navigate().refresh();
        }catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
