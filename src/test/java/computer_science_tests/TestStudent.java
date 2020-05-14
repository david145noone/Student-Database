package computer_science_tests;
import computer_science.Student;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/*public class TestClass {

    @Test
    public void testGreeting() {
        String str = "Hello there David";
        hello.Greeter g = new Greeter();
        assertEquals(g.sayHello("David"), str);
    }
}*/
public class TestStudent {

    @Test
    public void testSName() {
        String sName = "David";
        Student testS = new Student(sName, "", 1, 1);
        assertEquals(testS.getFirstName(), sName);
    }
}
