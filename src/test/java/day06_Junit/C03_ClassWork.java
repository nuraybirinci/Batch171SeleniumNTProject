package day06_Junit;


import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_ClassWork {
    WebDriver driver;

    @BeforeClass
    public static void beforeClass() throws Exception {
        System.out.println("TESTLER ÇALIŞMAYA BAŞLADI");
    }

    @Before
    public void setUp() throws Exception {
        //WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @After
    public void tearDown() throws Exception {
        driver.close();
    }

    @Test
    public void test01() {
        driver.get("https://amazon.com");
    }

    @Test
    public void test02() {
        driver.get("https://facebook.com");
    }

    @Test
    public void test03() {
        System.out.println("https://techproeducation.com");
    }
}
