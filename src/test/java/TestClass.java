import hello.Greeter;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestClass {

    @Test
    public void testGreeting() {
        String str = "Hello there David";
        hello.Greeter g = new Greeter();
        assertEquals(g.sayHello("David"), str);
    }
}
