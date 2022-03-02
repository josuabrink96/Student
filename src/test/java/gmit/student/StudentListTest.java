package gmit.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentListTest {
    private StudentList l;
    private Student s;

    @BeforeEach
    void initStudentList() {
        s = new Student("Name", "Email");
        l = new StudentList();
        l.addStudent(s);
    }

    @Test
    void testAddStudent() {
        assertFalse(l.getStudentList().isEmpty());
    }

    @Test
    void testFindStudent() {
        String name = "Name";
        assertEquals(l.findStudent(name), s);
    }

    @Test
    void testStudentNotFound() {
        String name = "StudentNotFound";
        assertEquals(l.findStudent(name), null);
    }
}
