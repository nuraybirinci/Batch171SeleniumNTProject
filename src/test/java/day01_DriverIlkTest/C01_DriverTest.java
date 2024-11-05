package day01_DriverIlkTest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverTest {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://techproeducation.com");

         /*
            POM.xml dosyasına driver sürücüleri için yüklediğimiz webDriverManager dependency sayesinde
        yukarıdaki örnekteki bilgisayarımızda mevcut olan başka bir browser ile driver'imizi oluşturabiliriz
        Yine bu projede ki gibi pom.xml dosyasına yüklediğimiz selenium-java dependency sayesinde get() methodu
        ile string olarak belirtmiş olduğumuz istediğimiz bir url'e gidebiliriz.
         */
    }
}
