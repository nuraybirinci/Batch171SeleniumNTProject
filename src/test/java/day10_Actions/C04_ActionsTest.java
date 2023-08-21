package day10_Actions;

import org.checkerframework.checker.units.qual.A;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C04_ActionsTest extends TestBase {
    @Test
    public void actions() {
        //https://jqueryui.com/droppable/ adresine gidelim
        driver.get("https://jqueryui.com/droppable/");

        //Drag me to my target webelementini Drop here webelementi üzerine bıkalım
        /*
        iframe çıktığı için driver'i iframe'e geçirmem gerekir
         */
        frameIndex(0);//-->TestBase'de method ile iframe'e geçiş yaptık

        WebElement drag = driver.findElement(By.xpath("//*[@id='draggable']"));
        WebElement drop = driver.findElement(By.xpath("//*[@id='droppable']"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(drag,drop).perform();//-->Drag webelementini alıp Drop webelementinin üzerine bırakır
    }
}
