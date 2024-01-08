package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverFactory {
    public static WebDriver getChromeDriver() {
        String currentProjectLocation = System.getProperty("user.dir");

        String chromeDriverRelativePath = "\\src\\test\\resources\\drivers\\chromedriver.exe";
        String chromeDriverLocation = currentProjectLocation.concat(chromeDriverRelativePath);
        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        return driver;
    }
}
