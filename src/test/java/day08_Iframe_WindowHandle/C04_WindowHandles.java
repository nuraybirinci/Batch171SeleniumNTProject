package day08_Iframe_WindowHandle;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.util.Set;

public class C04_WindowHandles extends TestBase {
    @Test
    public void test01() {
        //  https://the-internet.herokuapp.com/windows adresine gidin.
        driver.get("https://the-internet.herokuapp.com/windows");

        //  ilk sayfasının Handle degerini alın yazdırın
        String ilkSayfaHandle = driver.getWindowHandle();

        //  ilk sayfadaki textin "Opening a new window" olduğunu test edin.
        String text = driver.findElement(By.xpath("//h3")).getText();
        Assert.assertEquals("Opening a new window",text);

        //  ilk sayfa Title'ının "The Internet" olduğunu test edin.
        Assert.assertEquals("The Internet",driver.getTitle());

        //  "Click Here" butonuna tıklayın.
        driver.findElement(By.xpath("(//a)[2]"));

        Set<String> pencereler = driver.getWindowHandles();
        for (String w:pencereler){
            if (!w.equals(ilkSayfaHandle)){
                driver.switchTo().window(w);
            }
        }

        //  ikinci sayfa Title'ının "New Window" olduğunu test edin.
        //  ilk sayfaya dönün ve Title'ının "The Internet" olduğunu test edin.
        //  ikinci sayfaya tekrar geçin.
        //  ilk sayfaya tekrar dönün.










    }
}
