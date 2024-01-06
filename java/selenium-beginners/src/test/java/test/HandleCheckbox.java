package test;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class HandleCheckbox {
    @Test
    public static void testSelectCheckboxes() {
        // init webdriver
        WebDriver driver = DriverFactory.getChromeDriver();
        try {
            //open target page
            driver.get("https://the-internet.herokuapp.com/checkboxes");
            // Find a list of checkbox elements
            // vì checkbox nó nhiều box nên cần lựu vào list dưới dạng danh sách
            List<WebElement> ElementCheckbox = driver.findElements(By.cssSelector("input[type='checkbox']"));

            WebElement Checkbox1 = ElementCheckbox.get(0);
            WebElement Checkbox2 = ElementCheckbox.get(1);
            // Select option 01 then select option 02
            Checkbox1.click();
            Checkbox2.click();


            // Select all
            for (WebElement ItemCheckbox : ElementCheckbox) {
                System.out.println(ItemCheckbox.isSelected());
                if (!ItemCheckbox.isSelected()) {
                    ItemCheckbox.click();
                }
            }

            // debug purpose only
            Thread.sleep(2000);

        }catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
