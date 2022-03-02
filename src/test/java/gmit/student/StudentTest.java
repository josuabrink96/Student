package gmit.student;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    @Test
    void testNameAddress()
    {
        String expectedName = "Name";
        Student s = new Student("Name", "emailaddress@email.com");
        assertEquals(expectedName, s.getName());
    }

    @Test
    void testMissingVariable()
    {
        String expectedMessage = "Missing name or email";
        Exception ex = assertThrows(
                IllegalArgumentException.class,
                ()-> new Student("Missing Data")
        );
        assertEquals(expectedMessage, ex.getMessage());
    }
}
