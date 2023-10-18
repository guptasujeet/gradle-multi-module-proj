import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class MainTest {

    @Test
    public void myTest() {
        System.out.println("This is my test");
    }

    @Test
    public void slowTest() {
        System.out.println("This is one the slow test");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Slow test finished");
    }

    @Test
    @Ignore("Ignoring this test intentionally")
    public void failedTest(){
        Assert.fail("Marking test failed intentionally");
    }

}
