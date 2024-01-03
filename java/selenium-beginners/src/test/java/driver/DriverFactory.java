package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverFactory {
    public static WebDriver getChromeDriver() {
        String currentProjectLocation = System.getProperty("user.dir");

        System.out.printf("Current" + currentProjectLocation);

        String chromeDriverRelativePath = "\\src\\test\\resources\\drivers\\chromedriver.exe";
        String chromeDriverLocation = currentProjectLocation.concat(chromeDriverRelativePath);
//        System.setProperty("webdriver.chrome.driver", "C:\\automation\\java\\selenium-beginners\\src\\test\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        return driver;
    }
}
