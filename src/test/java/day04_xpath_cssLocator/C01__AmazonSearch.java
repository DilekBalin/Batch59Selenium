package day04_xpath_cssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01__AmazonSearch {
    //1. Main method oluşturun ve aşağıdaki görevi tamamlayın.
    //  a. web sayfasına gidin. https://www.amazon.com/

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com/");

        //  b. Search(ara) “city bike”   --  arama cubugu -> incele -> id'yi controlc,controlf yapip yeni obje (aramaKutusu) olusturduk
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));

        //city bike icin arama yapmak istiyorsak
        aramaKutusu.sendKeys("city bike"+ Keys.ENTER);  //aramaKutusuna aramaki istedigimiz kelimyei yolladik sonra Keys.ENTER ile enter yaptik


        //  c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement> istenenElementListesi = driver.findElements(By.className("sg-col-inner"));
        WebElement sonucYazisiElementi=istenenElementListesi.get(0);
        System.out.println(sonucYazisiElementi.getText());

        //  d-Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        List<WebElement> urunResimleriList=driver.findElements(By.className("s-image"));
        WebElement ilkUrunResmi= urunResimleriList.get(0);
        ilkUrunResmi.click();


    }


}
