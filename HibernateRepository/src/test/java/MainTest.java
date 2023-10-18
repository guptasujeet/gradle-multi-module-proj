import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

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
    @Disabled("Ignoring this test intentionally")
    public void failedTest() {
        fail("Marking test failed intentionally");
    }

}
