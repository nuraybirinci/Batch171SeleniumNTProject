package day02_DriverMethods;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethodsTest {
    public static void main(String[] args) {
        //WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        String amazonURL = "https://amazon.com";
        String techproURL = "https://techproeducation.com";

        //Amazon sayfasına gidelim
        driver.get(amazonURL);

        //Sayfa başlığını konsola yazdıralım
        String actualTitle = driver.getTitle();  // => getTitle() methodu gidilen sayfanın başlığını verir.
        System.out.println("Amazon Sayfası Başlığı :"+actualTitle);

        //Sayfa URL'sini konsola yazdıralım
        String actualURL = driver.getCurrentUrl();  // => getCurrentUrl() methodu gidilen sayfanın Url'ini verir.
        System.out.println("Amazon Sayfası Url'i : "+actualURL);

        //Techproeducation sayfasına gidelim
        driver.get(techproURL);

        //Sayfa başlığını konsola yazdıralım
        String techProactualTitle = driver.getTitle();
        System.out.println("Techpro Sayfası Başlığı :"+techProactualTitle);

        //Sayfanın Url'ini konsola yazdırınız
        String techProactualURL = driver.getCurrentUrl();
        System.out.println("Techpro Sayfası Url'i : "+techProactualURL);
    }
}
