package tests.bireyselCalisma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Q3 {

    @Test
    public void test() throws InterruptedException {

    // Navigate to http://tutorialsninja.com/demo/index.php?route=common/home
        Driver.getDriver().get("http://tutorialsninja.com/demo/index.php?route=common/home");

    // click on Phones & PDAs
    // Telefonlar ve PDA'lara tıklayın
        WebElement phonePDAs=Driver.getDriver().findElement(By.xpath("//*[text()='Phones & PDAs']"));
        phonePDAs.click();


    // get the brandName of phones
    // telefonların marka adını al
        List<WebElement> brandNameElementi=Driver.getDriver().findElements(By.xpath("//h4"));
        List<String> brandName=new ArrayList<>();

        for (WebElement each:brandNameElementi
             ) {
            System.out.println(each.getText());
            brandName.add(each.getText());
        }
        Collections.sort(brandName);


    // click on add to button for all elements
    // tüm öğeler için ekle düğmesine tıklayın
        List<WebElement> addToButton=Driver.getDriver().findElements(By.xpath("//div[@class='button-group']"));

        for (WebElement each:addToButton
        ) {
           each.click();
        }
Thread.sleep(2000);

    // click on black total added cart button
    // siyah toplam eklenen sepet düğmesine tıklayın
        WebElement blackTotalAdded=Driver.getDriver().findElement(By.xpath("//span[@id='cart-total']"));
        blackTotalAdded.click();

    // get the names of list from the cart
    // listenin isimlerini sepetten al
        List<String> cartList=new ArrayList<>();
        for (int i = 1; i <=3 ; i++) {
            System.out.println(Driver.getDriver().findElement(By.xpath("//tbody//tr[" + i + "]//td[2]")).getText());

            cartList.add(Driver.getDriver().findElement(By.xpath("//tbody//tr[" + i + "]//td[2]")).getText());
        }
        Collections.sort(cartList);

        // compare the names from displaying list and cart list
        // listeden ve sepet listesinden isimleri karşılaştırın
        System.out.println("cartList = " + cartList);
        System.out.println("brandName = " + brandName);
        Assert.assertEquals(brandName,cartList);







    }
}
