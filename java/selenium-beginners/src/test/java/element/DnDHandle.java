package element;

import driver.DriverFactory;
import element.ElementController;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;

public class DnDHandle {
    public static void main(String[] args) throws AWTException {
        WebDriver driver = DriverFactory.getChromeDriver();
        try {
            driver.get("https://the-internet.herokuapp.com/drag_and_drop");

            By leftColumnSelector = By.id("column-a");
            By rightColumnSelector = By.id("column-b");

            WebElement leftColumnElem = driver.findElement(leftColumnSelector);
            WebElement rightColumnElem = driver.findElement(rightColumnSelector);

            ElementController.dnd(leftColumnElem, rightColumnElem);

            Thread.sleep(2000);

            ElementController.dnd(rightColumnElem,leftColumnElem);

        }catch (Exception e) {
            e.printStackTrace();
        }

//        driver.quit();
    }
}
