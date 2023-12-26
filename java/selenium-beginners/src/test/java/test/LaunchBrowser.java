package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {
        WebDriver driver;
        // get location project
        String currentProjectLocation = System.getProperty("user.dir");
        String chromeDriverRelativePath = "/src/test/resources/drivers/chromedriver.exe";
        String chromeDriverLocation = currentProjectLocation.concat(chromeDriverRelativePath);

        System.setProperty("webdriver.chrome.driver",chromeDriverLocation);
        driver = new ChromeDriver();

        driver.get("https://hoaumo.com");
        // Debug only
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e) {
            System.out.printf("Err" + e);
        }
        // thoat khoi sescion
        driver.quit();
    }
}
