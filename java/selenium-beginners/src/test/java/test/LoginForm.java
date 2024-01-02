package test;
import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginForm {
    public static void main(String[] args) {

        // Steps : DRY | Don't Repeat Yourself
        /*
        * 1. init webdriver session
        *
        * 2. Open target page | login Page
        *
        * 3. Find username web element
        *
        * 4. Find password web element
        *
        * 5. Find login button web element
        *
        * 6. Input username, input password, click on button
        *
        * 7. Quit browser session
        *
        * */
        WebDriver driver = DriverFactory.getChromeDriver();
        try {
            driver.get("https://the-internet.herokuapp.com/login");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

            WebElement usernameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#username")));

            //WebElement usernameElement = driver.findElement(By.cssSelector("#usernames"));

            WebElement passwordElement = driver.findElement(By.cssSelector("#password"));

            WebElement buttonElement = driver.findElement(By.cssSelector("button[type='submit']"));

            usernameElement.sendKeys("hainv");
            passwordElement.sendKeys("12345");
            buttonElement.click();

        }catch (Exception e) {
            e.printStackTrace();
        }

        driver.quit();

    }
}
