package test;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MouseHover {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();
        try {
            driver.get("https://the-internet.herokuapp.com/mouse-hover");
            By avatarSelect = By.cssSelector(".figure");
            By usernameSelector = By.cssSelector(".figcaption h5");
            By usernameHyperlink = By.cssSelector(".figcaption a");

            final  int USER_1_INDEX = 0;
            final int USER_2_INDEX = 1;
            final int USER_3_INDEX = 2;

            driver.findElement(By.cssSelector("cssSelectorValue"));
            List<WebElement> userAvatarEle = driver.findElements(avatarSelect);
            List<WebElement> username = driver.findElements(avatarSelect);
            List<WebElement> userAvatarEle = driver.findElements(avatarSelect);

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
