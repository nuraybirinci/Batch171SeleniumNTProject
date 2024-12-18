package day03_WebElements;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locators {
    public static void main(String[] args) {
        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //Amazon sayfasına gidiniz.
        driver.get("https://amazon.com");
        driver.navigate().refresh();
        driver.navigate().refresh();

        //Arama kutusunu locate ediniz ve iphone yazdırıp aratınız.

        /*
        <input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off"
         placeholder="Search Amazon" class="nav-input nav-progressive-attribute" dir="auto" tabindex="0"
         aria-label="Search Amazon" spellcheck="false">
         */

        //Eğer bir webelementin locate'ini birden fazla kullanacaksak bir webelemente aşağıdaki gibi assing edebiliriz

        WebElement aramakutusuWebElementi = driver.findElement(By.id("twotabsearchtextbox"));
        aramakutusuWebElementi.sendKeys("iphone", Keys.ENTER);
        //aramakutusuWebElementi.submit(); //-->ENTER TUŞUNA BASAR

        //Eğer bir locate'i tek bir kere kullanacaksak:
        //driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone",Keys.ENTER);

        /*
          Bir sayfada herhangi bir webElementi locate etmek için sayfa üzerinde veya locate etmek istediğimiz webelement
        üzerinde sağ klik yapıp incele deriz. Locate almak istediğimiz element, id attribute'üne sahip ise id locator'ı
        ile id attribute değerini kullanarak yukardaki örnekteki gibi locate edebiliriz.
          Locate ettiğimiz webelementi <input> tag'ına sahip ise o webelemente sendKeys() methodu ile istediğimiz text'i
        gönderebiliriz.
          Eğer bir arama kutusunu locate edip bir text gönderirsek 2 şekilde enter tuşuna bastırabiliriz:
        1. si submit()
        2. si tanımlanmış bir değer kümesi olan (enum) Keys.ENTER
         */

        //sayfayı kapatınız
        driver.close();

    }
}
