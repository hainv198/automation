package test;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();
        try {
            driver.get("https://the-internet.herokuapp.com/dropdown");
            WebElement dropdownEle = driver.findElement(By.id("dropdown"));
            // 4. Init select instance
            Select select = new Select(dropdownEle);
            select.selectByVisibleText("Option 1");
            select.selectByVisibleText("Option 2");

            select.selectByValue("1");
            select.selectByValue("2");

            Thread.sleep(2000);

        }catch (Exception e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
