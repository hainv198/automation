package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {
    public static void main(String[] args) {
        System.out.printf("Hainv");

        WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "C:\\java\\setup java\\chromedriver.exe");
        driver = new ChromeDriver();

//        driver.get("https://hoaumo.shop");

        // các phương thức khác để thực thi kịch bản ở trên
        // 1. Maximize browser của mình
        driver.manage().window().maximize();

        // 2. go to url
        driver.navigate().to("https://hoaumo.shop");

        try {
            Thread.sleep(2000);
        }catch (InterruptedException e) {
            System.out.printf("Err" + e);
        }

        // 3. get value print in console
        System.out.printf(driver.getTitle());

        // 4. Exit Browser
        driver.quit();

    }
}
