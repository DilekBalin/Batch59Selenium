package grupDay01;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07_manageMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
       // driver.manage().window().maximize();

        System.out.println(driver.manage().window().getSize());
        System.out.println(driver.manage().window().getPosition());

        /*
        mevcut pencere boyutu:(945,1012);
        mevcut pencere position: (10,10)

         */

        driver.manage().window().setSize(new Dimension(900,600));
        driver.manage().window().setPosition(new Point(15,15));


        System.out.println("degisen: "+ driver.manage().window().getSize());
        System.out.println("degisen: " +driver.manage().window().getPosition());


    }
}
