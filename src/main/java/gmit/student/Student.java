package gmit.student;

public class Student {
    private String name;
    private String email;

    public Student() {
        throw new IllegalArgumentException("Missing name or email");
    }

    public Student(String s) {
        throw new IllegalArgumentException("Missing name or email");
    }

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }
}
