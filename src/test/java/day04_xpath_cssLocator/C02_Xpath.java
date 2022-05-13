package day04_xpath_cssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Xpath {
    //2- Add Element butonuna basin




    public static void main(String[] args) throws InterruptedException {
        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");



        //2- Add Element butonuna basin
       // driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();  //Bu web elementi bir daha kullanmayacagimiz icin asiign sart degil
       // driver.findElement(By.xpath("//button[text()='Add Element']")).click();   ->> text varsa attribute yazmaya gerek yok
        driver.findElement(By.xpath("//*[text()='Add Element']")).click();   //--> tag onemli degilse tag yerine * konabilir

        //3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonu=driver.findElement(By.xpath("//button[@class='added-manually']"));
        if(deleteButonu.isDisplayed()){
            System.out.println("delete buttonu testi PASSED");
        }else{
            System.out.println("delete butttonu test FAILED");
        }

        //4- Delete tusuna basin
        Thread.sleep(3000);
        deleteButonu.click();

        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement yazi =driver.findElement(By.xpath("//h3"));
        if(yazi.isDisplayed()){
                System.out.println( "Add/Remove Elements yazisi testi PASSED");
            }else{
                System.out.println("Add/Remove Elements yazisi testi FAILED");
            }
Thread.sleep(3000);
      driver.close();
        }

    }




