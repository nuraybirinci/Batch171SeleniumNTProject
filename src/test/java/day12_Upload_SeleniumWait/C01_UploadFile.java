package day12_Upload_SeleniumWait;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C01_UploadFile extends TestBase {

    @Test
    public void test01() {
        //https://the-internet.herokuapp.com/upload adresine gidelim
        driver.get("https://the-internet.herokuapp.com/upload");

        //chooseFile butonuna basalim
        WebElement dosyaSecWE = driver.findElement(By.id("file-upload"));
        //dosyaSecWE.click();

        //Yuklemek istediginiz dosyayi secelim.
        //"C:\Users\nuray\Desktop\batch171.txt"
        String dosyaYolu = "C:\\Users\\nuray\\Desktop\\batch171.txt";
        dosyaSecWE.sendKeys(dosyaYolu);

        //Upload butonuna basalim.
        driver.findElement(By.id("file-submit")).click();
        bekle(2);

        //"File Uploaded!" textinin goruntulendigini test edelim.
        String fileUploadWE = driver.findElement(By.xpath("//h3")).getText();
        Assert.assertEquals("File Uploaded!",fileUploadWE);

    }

    @Test
    public void test02() {
        driver.get("https://www.ilovepdf.com/compress_pdf");
        driver.findElement(By.xpath("//*[.='Select PDF files']")).click();
        bekle(3);
        String dosyaYolu = "C:\\Users\\Lenovo\\OneDrive\\Masaüstü\\testng.pdf";
        uploadFilePath(dosyaYolu);

        /*
            Upload file yaparken sendKeys() methodunun işlemediği durumlarda TestBase class'ında oluşturduğumuz
         uploadFilePath() methodu ile dosyayı çok rahat yükleyebiliriz. Bu methodu kullanırken manuel olarak
         mause ve klavyeyi test esnasında hiçbir şekilde kullanmamamız gerekir. Mac kullanıcıları windows'taki
         ctrl+v tuş kombinasyonunun karşılık geldiği tuş kombinasyonunu Robot class'a belirtmesi gerekir.
         TestBase deki uploadFilePath() methodu sadece windows kullanıcıları için geçerlidir.
         */

    }
}
