import static org.junit.Assert.*;
import org.junit.Test;

public class FooTest {

    @Test
    public void firstTest(){
        String expected = "my-test";

        Foo obj = new Foo();
        String actual = obj.lish();

        assertEquals(expected, actual);
    }

}