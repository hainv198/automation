package test;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandleDropdown {
    public static void main(String[] args) {

        WebDriver driver = DriverFactory.getChromeDriver();
        try {

            //open
            driver.get("https://the-internet.herokuapp.com/dropdown");

            // locate dropdown element
            WebElement dropdown = driver.findElement(By.id("dropdown"));
            dropdown.click();
            Thread.sleep(2000);
        }catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
