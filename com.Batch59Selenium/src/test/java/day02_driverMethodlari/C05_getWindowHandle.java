package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_getWindowHandle {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        System.out.println(driver.getWindowHandle());
   //CDwindow-5677852C9C9220F9B6BD0CE4174B9839  benzersiz olarak acilan window'a ait hashcode'unu verir









    }
}
