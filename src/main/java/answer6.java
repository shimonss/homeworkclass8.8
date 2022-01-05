import jdk.internal.jimage.ImageReaderFactory;
import org.testng.annotations.Test;

public class answer6 {
    private answer2.ChromeDriver chromeDriver;

    @Test
    public void test_method_1(){
        chromeDriver.get("https://www.translate.google.com/");
       chromeDriver.findElements(By.id("source")).sendkeys("ברוכים הבאים");


    }

}
