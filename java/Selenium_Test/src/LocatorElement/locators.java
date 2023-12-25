package LocatorElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class locators {
    public static void main(String[] args) {
        WebDriver driver = null;
        // get by id
        driver.findElement(By.id("location_2"));
        //get by class name
        driver.findElement(By.className("location_2"));
        //get by name
        driver.findElement(By.name("Hainv"));
        // get by tag name
        driver.findElement(By.tagName("a"));
        //get by link text
        driver.findElement(By.linkText("https://hoaumo.shop"));
        // Demo
        WebElement onValue = driver.findElement(By.id("login-username"));

        driver.findElement(By.cssSelector("input#email"));

        // tìm nhiều element chung kiểu
        List<WebElement> anchors = driver.findElements(By.tagName("a"));

        // Search element in element #
        WebElement div = driver.findElement(By.tagName("div"))
                .findElement(By.tagName("a"));
    }
}
