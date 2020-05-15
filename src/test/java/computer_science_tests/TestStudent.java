package computer_science_tests;
import computer_science.Student;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestStudent {

    @Test
    public void testFirstName() {
        String fName = "David";
        Student testS = new Student(fName, "", 1, 1);
        assertEquals(testS.getFirstName(), fName);
    }

    @Test
    public void testSurName() {
        String sName = "Noone";
        Student testS = new Student("", "Noone", 1, 1);
        assertEquals(testS.getSurName(), sName);
    }
}
