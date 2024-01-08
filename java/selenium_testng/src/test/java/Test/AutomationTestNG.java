package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class AutomationTestNG {
    public WebDriver driver;
    @BeforeClass
    public void beforeClass() {
        String currentProjectLocation = System.getProperty("user.dir");
        String chromeDriverRelativePath = "\\src\\test\\resources\\drivers\\chromedriver.exe";
        String chromeDriverLocation = currentProjectLocation.concat(chromeDriverRelativePath);
        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void testName() {
        driver.get("https://hoaumo.shop");
        String getTitle = driver.getTitle();
        String titleDefault = "Hoa Umo";
        Assert.assertEquals(getTitle, titleDefault);
    }

    @AfterClass
    public void afterClass() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
