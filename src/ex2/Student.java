package ex2;


class Student {
    private String studentId;
    private String name;

    // Constructor
    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    // Getters
    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    // toString method for easy printing
    @Override
    public String toString() {
        return "ID: " + studentId + ", Name: " + name;
    }
}

