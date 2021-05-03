package Week2.Homework1.Models;





public class Student extends User{
    private String studentNumber;
    private int courseCount;

    public Student(int id, String name, String email, String password, String studentNumber, int courseCount) {
        super(id, name, email, password);
        this.studentNumber = studentNumber;
        this.courseCount = courseCount;
    }
    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getCourseCount() {
        return courseCount;
    }

    public void setCourseCount(int courseCount) {
        this.courseCount = courseCount;
    }

}

