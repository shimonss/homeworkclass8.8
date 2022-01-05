import org.testng.annotations.BeforeClass;

public class answer1 {
    private static chromedriver chromedriver;

    @BeforeClass
    public static void runOnceBeforeClass(chromedriver driver, FirefoxDriver firefoxDriver){
        System.setProperty("webdriver.chrome.driver", "c:\\users\\shsa7\\downloads\\chromedriver_win32\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "c:\\users\\shsa7\\downloads\\geckodriver_win64\\geckodriver.exe");
        chromedriver = new chromedriver();
        firefoxDriver = new FirefoxDriver();
        chromedriver.get("https://www.walla.co.il");
        firefoxDriver.get("https://www.ynet.co.il");
        
    }

    private static class FirefoxDriver {
        public void get(String s) {
        }
    }

    private static class chromedriver {
        public void get(String s) {
        }
    }
}
