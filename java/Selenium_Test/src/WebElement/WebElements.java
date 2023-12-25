package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElements {

    public static void main(String[] args) {

        // List function base of WebElement
        /*
        * element.clear() -> Clear value input . Phuong thuc nay khong tham so va khong tra ve gi
        *
        * senKeys: nhap vao 1 phan tu va co the thay doi gia tri cua no
        *
        * element.click();
        *
        * bool WebElement.isDisplayed() :=> Method nay xacs dinh xem một phần tử hiện đang được hiển thị hay không . trả về giá trị boolean
        *
        * bool WebElement.isEnabled() => Method nay cac dinh xem phan tu co duoc bat hay khong -> gia tri tra ve la boolean
        *
        * isSelected() => Method này xác định xem phần tử có được chọn hay không ( Radio, Check Bõx ) Gía trị trả về là boolean
        * */
        // 1.
        WebDriver driver = null;
        WebElement element = driver.findElement(By.id("UserName"));
        element.clear();
        //Hoặc có thể viết
        driver.findElement(By.id("UserName")).clear();

        //2.
        WebElement element1 = driver.findElement(By.id("name"));
        element1.sendKeys("Hainv add sendKey");

        //3.
        WebElement element2 = driver.findElement(By.linkText("Dashboard"));
        element2.click();

        //4.
        WebElement element3 = driver.findElement(By.id("scroll"));
        // trả về kiểu dữ liệu boolen
        boolean status = element3.isDisplayed();

        //5.
        WebElement element4 = driver.findElement(By.id("tab_1"));
        boolean status_2 = element4.isEnabled();
        if (status_2) {
            element4.sendKeys("DOne");
        }

        //6.
        WebElement element5 = driver.findElement(By.id("isGender"));
        boolean gender = element5.isSelected();
        if (gender) {
            System.out.printf("Hainv");
        }

        //7. submit()
        WebElement element6 = driver.findElement(By.id("form-contact"));
        element6.submit();

        //8. getText() => Lấy value đc hiển thị . Kiểu dữ liệu trả về string

        WebElement element7 = driver.findElement(By.id("name_user"));
        String name = element7.getText();

    }

    

}
