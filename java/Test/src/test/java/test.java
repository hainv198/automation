import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    public static void main(String[] args) {
        System.out.printf("Hainv");

        WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "C:\\automation\\java\\Test\\src\\test\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2. go to url
        driver.navigate().to("https://hoaumo.shop");
        driver.quit();
    }
}
