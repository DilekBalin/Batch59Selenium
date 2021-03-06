package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //Amazon'a gidip nutella aratin
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");

        //findElement(By....locator)---> istedigimiz web elemnetini bize dondurur
        //biz de o web elementini kullanmak icin bir objeye assign ederiz

      WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));  //aram kutusunu bulduk ve locate edip bir web elemnte atadik

        /*
        //  WebElement aramaKutusu= driver.findElement(By.className("nav-search-field "));
        Bu locator calismadi
        locator alirken gozumuzden kacan detaylar olabilir
        aldigimiz bir locator calismazsa alternatfi lokatorlar denemeliyiz
         */

        //herhnagi bir webelementine istedigimiz yaziyi yollamak istersek:
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

    }
}
