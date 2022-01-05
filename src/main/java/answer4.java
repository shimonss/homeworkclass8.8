import 
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class answer4 {
    private static webdriver driver;

    private static class webdriver {
        private Object searchElement;

        @BeforeClass
        public static void runOnceBeforeClass() {
            System.setProperty("webdriver.gecko.driver", "c:\\users\\shsa7\\downloads\\gecodriver_win64\\gecodriver.exe");
            driver = new geckodriver();
            driver.getClass("https://www.seleniumhq.org/");
        }

        private void getClass(String s) {
        }

        @Test
        public void test02_seleniumhq(){
            driver.findElemnt(By.name("search")).click();}
            System.out.println(geckodriver.findElement(By.name("search")));
        }

        private void getClass(String s) {
        }

        private static class geckodriver extends webdriver {
        }
    }
}
