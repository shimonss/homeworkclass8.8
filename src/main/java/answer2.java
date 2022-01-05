import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class answer2 {
    private static ChromeDriver driver;
    @BeforeClass
    public static void runOnceBeforeClass() {
        System.setProperty("webdriver.chrome.driver", "c:\\users\\shsa7\\downloads\\chromedriver.exe");
        driver = new ChromeDriver();
    
        driver.get("https://www.translate.google.com/");
    
    }

    private static void Driver() {
    }

    @Test
    public void test01_findById() {
        System.out.println(id("div"));
    }

    private String id(String div) {
        return null;
    }

    @Test
     public void test02_findBytagName(){
        System.out.println(tagName("script"));


    }

    private String tagName(String script) {
        return null;
    }

    public static class ChromeDriver {
        public void get(String s) {
        }

        public void getClass(String s) {
        }



    }
}
