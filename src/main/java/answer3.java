import jdk.jshell.Snippet;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@SuppressWarnings("MoveFieldAssignmentToInitializer")
public class answer3 {
    private static WebDriver driver;

@BeforeClass
public static void runOnceBeforeClass() {
    System.setProperty("webdriver.gecko.driver", "c:\\users\\shsa7\\downloads\\geckodriver_win64\\geckodriver.exe");
    driver = new geckodriver();
    driver.get("https://www.youtube.com/");
}
@Test
    public void test01_youtube(){
    driver.findElement(By.id("logo-icon")).click();}
    System.out.println(geckodriver.findElement(By.id("search logo-icon")));


    private static class WebDriver {
        public void get(String s) {
        }
    }

    private static class geckodriver extends WebDriver {
    }

    public static class chromeDriver {
        public void get(String s) {
        }
    }
}



