import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public abstract class answer8 {
    private static chromedriver driver;

    @BeforeClass
    public static void runOnceBeforeClass() {
        System.setProperty("webdriver.chrome.driver", "c:\\users\\shsa7\\downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new chromedriver();
        driver.get("https//www.facebook.com/");
    }
    @Test
            chromedriver.findElement(By.id("username")).sendKeys("admin");
            chromedriver.findElement(By.id("password")).sendKeys("admin");


     {

    }

    private static class chromedriver {
        public void get(String s) {
        }
    }
}


