package grupDay01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");

        String mevcutBaslik = driver.getTitle();
        String arananBaslik = "Amazon";
        if (mevcutBaslik.contains(arananBaslik)) {
            System.out.println("test passed");
        } else {
            System.out.println("Test failed");
        }


        String mevcutUrl = driver.getCurrentUrl();
        String arananUrl = "Amazon";
        if (mevcutUrl.contains(arananUrl)) {
            System.out.println("test passed");
        } else {
            System.out.println("Test failed");
        }
        driver.close();
    }


}
