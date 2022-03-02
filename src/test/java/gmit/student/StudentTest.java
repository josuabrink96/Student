package gmit.student;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    @Test
    void testName()
    {
        String expectedName = "Name";
        Student s = new Student("Name", "emailaddress@email.com");
        assertEquals(expectedName, s.getName());
    }

    @Test
    void testEmailAddress()
    {
        String expectedEmail = "emailaddress@email.com";
        Student s = new Student("Name", "emailaddress@email.com");
        assertEquals(expectedEmail, s.getEmail());
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
