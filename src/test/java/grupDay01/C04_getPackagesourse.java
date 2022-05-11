package grupDay01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_getPackagesourse {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        String sayfaninKaynaklari = driver.getPageSource();
        String arananKelime = "spend less";
        if (sayfaninKaynaklari.contains(arananKelime)) {
            System.out.println("test PASSED");
        } else System.out.println("aranam kelime " + arananKelime + " icermiyor");
        driver.close();
    }
}
