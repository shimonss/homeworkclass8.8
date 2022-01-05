
import org.testng.Assert;
import org.testng.annotations.Test;

public class answer5 {
    private answer2.ChromeDriver chromeDriver;
    private Global amazon;

    @Test
    public void test05_amazon(){
    chromeDriver.get("https://www.amazon.com/");
    String amazonTitle=amazon.com;
        Assert.assertEquals(chromeDriver.getTitle(), amazonTitle);

        chromeDriver.findElement(By.id("twotabsearchtextbox")).sendKeys("leather shoes");



    }

    private class Global {
        public String com;
    }
}
