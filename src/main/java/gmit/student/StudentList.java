package gmit.student;

import java.util.ArrayList;

public class StudentList {
    ArrayList<Student> studentList;

    public StudentList() {
        studentList = new ArrayList<>();
    }

    public void addStudent(Student s) {
        studentList.add(s);
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }
}
