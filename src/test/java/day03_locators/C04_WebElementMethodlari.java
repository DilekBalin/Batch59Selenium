package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WebElementMethodlari {
    public static void main(String[] args) {
        /*
      1- amazon.com'a gidip arama kutusunu locate edin
      2- arama kutusunun tag name'nin input oldugunu test edin
      3- arama kutusunun name attribute'nin degerinin.... oldugunu test edin
         */

        System.setProperty("wedriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

        String exceptedTagName = "input";
        String actualTagName = aramaKutusu.getTagName();
        if (exceptedTagName.equals(actualTagName)) {
            System.out.println("TagName testi PASSED");
        } else {
            System.out.println("TagName testi FAILED");
        }


        //3- arama kutusunun name attribute'nin degerinin.... oldugunu test edin
        String exceptedNameDegeri = "filed-keywords";
        String actualNameDegeri = aramaKutusu.getAttribute("name");
        if (exceptedNameDegeri.equals(actualNameDegeri)) {
            System.out.println("name attribute testi PASSED");
        } else {
            System.out.println("name attribute testi FAILED");
        }
    }
}
