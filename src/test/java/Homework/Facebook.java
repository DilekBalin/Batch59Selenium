package Homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
    public static void main(String[] args) throws InterruptedException {
        //ChromeDriver kullanarak,facebook sayfasina gidin ve sayfa basliginin "facebook"
        //oldugunu dogrulayin, degilse dogru basligi yazdirin

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://facebook.com");
        String facebookTitle=driver.getTitle();
        String expectTitle="facebook";
        if(facebookTitle.equals(expectTitle)){
            System.out.println("Test PASSED,title is->> "+ facebookTitle);

        }else{
            System.out.println("Test is failed,title is--> "+ facebookTitle);
        }

        //Sayfa URL'nin facebook kelimesi icerdigini dogrulayin, icermiyorsa "actual" URLyi yazdirin
        String facebookUrl=driver.getCurrentUrl();
        String expectUrl="facebook";
        if(facebookUrl.contains(expectUrl)){
            System.out.println("Test PASSED,title is->> "+ facebookUrl);

        }else{
            System.out.println("Test is failed,url is--> "+ facebookUrl);
        }

        //https:www.walmart.com/ sayfasina gidin
        driver.navigate().to("https:www.walmart.com/");


        //sayfa basliginin "Walmart.com" icerdigini dogrulayin
      String actualTitleWalmart = driver.getTitle();
      String expectTitleWalmart= "Walmart.com";
      if(actualTitleWalmart.contains(expectTitleWalmart)){
          System.out.println("Title contains "+  expectTitleWalmart+ " so  Test PASSED");

      }else{
          System.out.println(" Title doesn't contains "+ expectTitleWalmart +" so Test FILED,true url is---> "+actualTitleWalmart );
      }
        //tekrar facebook sayfasina geri donun
        driver.navigate().back();
      Thread.sleep(3000);
        //sayfayi yineleyin
        driver.navigate().refresh();
        Thread.sleep(3000);

        //sayfayi maximize yapin
        driver.manage().window().maximize();

        //browseri kapatin



        driver.close();
    }
}
