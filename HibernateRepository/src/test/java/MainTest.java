import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void myTest() {
        System.out.println("This is my test");
    }

    @Test
    public void failedTest(){
        Assert.fail("Marking test failed intentionally");
    }

}
