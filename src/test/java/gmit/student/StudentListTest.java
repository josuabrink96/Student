package gmit.student;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentListTest {
    @Test
    void testAddStudent() {
        Student s = new Student("Name", "Email");
        StudentList l = new StudentList();

        l.addStudent(s);
        assertFalse(l.getStudentList().isEmpty());
    }
}
