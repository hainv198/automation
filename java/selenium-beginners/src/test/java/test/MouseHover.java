package test;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.List;

public class MouseHover {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();
        try {
            driver.get("https://the-internet.herokuapp.com/hovers");
            By avatarSelect = By.cssSelector(".figure");
            By usernameSelector = By.cssSelector(".figcaption h5");
            By usernameHyperlink = By.cssSelector(".figcaption a");

            final int USER_1_INDEX = 0;
            final int USER_2_INDEX = 1;
            final int USER_3_INDEX = 2;

            List<WebElement> userAvatarEle = driver.findElements(avatarSelect);
            List<WebElement> username = driver.findElements(usernameSelector);
            List<WebElement> usernamePath = driver.findElements(usernameHyperlink);

            //Move mouse on the first user
            Actions actions = new Actions(driver);
            actions.moveToElement(userAvatarEle.get(USER_1_INDEX)).perform();
            System.out.printf(username.get(USER_1_INDEX).getText());
            System.out.printf(usernamePath.get(USER_1_INDEX).getAttribute("href"));

            //Move mouse on the user2
            actions.moveToElement(userAvatarEle.get(USER_2_INDEX)).perform();
            System.out.printf(username.get(USER_2_INDEX).getText());
            System.out.printf(usernamePath.get(USER_2_INDEX).getAttribute("href"));

            //move mouse on the user3
            actions.moveToElement(userAvatarEle.get(USER_3_INDEX)).perform();
            System.out.printf(username.get(USER_3_INDEX).getText());
            System.out.printf(usernamePath.get(USER_3_INDEX).getAttribute("href"));

            //Debug only
            Thread.sleep(2000);

        }catch (Exception e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
