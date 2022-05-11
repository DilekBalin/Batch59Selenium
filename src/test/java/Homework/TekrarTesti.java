package Homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TekrarTesti {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Youtube web sayfasina gidin
        driver.get("https://www.youtube.com"); //youtube sayfasini getirdim

        //sayfa basliginin "youtube" olup olmadigini kontrol edin
        //eger degilse dogru basligi yazdirin
        String youtubeActualTitle = driver.getTitle(); //basligi string bir variable'a atadim
        String findYoutubeTitle = "youtube"; //aradigimiz basligi da string bir variable'a atadim
        Thread.sleep(3000);

        if (youtubeActualTitle.equals(findYoutubeTitle)) {
            System.out.println(findYoutubeTitle + " ---> is equal with actual title so this test PASSED");

        } else {
            System.out.println(findYoutubeTitle + "---->  is not equal actual title so this test FAILED");
            System.out.println("The correct tile is >>>" + youtubeActualTitle);



          //sayfa url'sinin  "yotube" icerip icermedigini dogrulayin
            //icermiyorsa dogrusunu yazdirin
           String youtubeActualUrl= driver.getCurrentUrl();
           String youtubeFindUrl="youtube";
           if(youtubeActualUrl.contains(youtubeFindUrl)){
               System.out.println(youtubeFindUrl+" ----> is inside the url ");
           }else{
               System.out.println(youtubeFindUrl+"----> is not inside the url ,the correct url is---> "+youtubeFindUrl );
           }
        }

        //daha sonra Amazon sayfasina gidin
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(3000);

         //youtube sayfasina geri donun
        driver.navigate().back();
        Thread.sleep(3000);

        //sayfayi yenileyin
        driver.navigate().refresh();
        Thread.sleep(3000);


        //Amazon sayfasina donun
        driver.navigate().forward();
        Thread.sleep(3000);

        //Sayfayi tam sayfa yapin
        driver.manage().window().fullscreen();

 //sayfa basliginin "Amazon" icerip icermesigini kontrol edin
        //icermiyorsa dogrunu yazin
        String titleAmazon =driver.getTitle();
         String a="Amazon";

         if(titleAmazon.contains("a")){
             System.out.println("Test  passed");

         }else{
             System.out.println("Test failed");

         }

         //Sayfa url'sinin https://www.amazon.com/ olup olmadigini kontrol edin degilse dogrusunu yazin

        String urlAmazon =driver.getCurrentUrl();
        String b="https://www.amazon.com ";

        if(titleAmazon.contains("b")){
            System.out.println("Test  passed");

        }else{
            System.out.println("Test failed the correct answer: -->" + urlAmazon);

        }
        driver.close();
        }



    }




