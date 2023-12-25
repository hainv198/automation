import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class main {
    public static void main(String[] args) throws InterruptedException {

        System.out.printf("Hainv");
        WebDriver driver = null;

        System.setProperty("webdriver.chome.driver", "C:\\java\\setup java\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://hoaumo.shop");

        Thread.sleep(2000);

    }
}
