package grupDay01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println(driver.getWindowHandle());//CDwindow-9470CCF517D685C71C7B0BA7F3DA3D36
        //her run ettigimizd yeni bir pencere acildigi icin
        //her pencerenin kendine ait hashcode'u buundugu bulunur
        //ilerleyen zamanalrda detayli olarak kullanacagiz
        driver.close();
    }
}
