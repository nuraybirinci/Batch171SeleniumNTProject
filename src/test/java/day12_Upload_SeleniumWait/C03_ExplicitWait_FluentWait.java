package day12_Upload_SeleniumWait;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import utilities.TestBase;

import java.time.Duration;

public class C03_ExplicitWait_FluentWait extends TestBase {
    @Test
    public void test01() {
        //https://the-internet.herokuapp.com/dynamic_loading/1
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        //Start buttonuna tıkla
        driver.findElement(By.xpath("//button")).click();

        //Hello World! Yazının sitede oldugunu test et
        WebElement helloWorldWE = driver.findElement(By.xpath("(//h4)[2]"));
        FluentWait<WebDriver> wait = new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(20)).//-->max. bekleme süresini belirtiriz
                pollingEvery(Duration.ofMillis(200)).//-->belirttiğimiz sürede aralıklar ile kontrol eder
                withMessage("WebElementi ve Süreyi Kontrol Et");//-->Hata durumunda mesaj verir
        wait.until(ExpectedConditions.visibilityOf(helloWorldWE));
        Assert.assertEquals("Hello World!",helloWorldWE.getText());



    }
}