import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public abstract class answer7 {
    private static answer3.chromeDriver driver;

    @BeforeClass
    public static void runOnceBeforeClass() {
        System.setProperty("webdriver.chromedriver", "c:\\users\\shsa7\\downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new answer3.chromeDriver();
        driver.get("https://www.youtube.com/");
    @Test
    chromeDriver.get("https://www.youtube.com");
chromeDriver.findElement(By.id("search")).sendKeys("Memories");
chromeDriver.findElement(By.id("search-icon-gsf")).click();



    }


}

