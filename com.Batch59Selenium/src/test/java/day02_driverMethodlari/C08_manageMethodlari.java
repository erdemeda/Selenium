package day02_driverMethodlari;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C08_manageMethodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        // maximize iken boyutlari alalim
        System.out.println("maximize konum : " + driver.manage().window().getPosition());
        System.out.println("maximize boyut : " + driver.manage().window().getSize());
        driver.manage().window().fullscreen();

        // fullscreeniken boyutlari alalim
        System.out.println("fullscreen konum : " + driver.manage().window().getPosition());
        System.out.println("fullscreen boyut : " + driver.manage().window().getSize());
    }
}