package Week2.Models;




public class Instructor extends User {
    private int salary;
    private int courseNumber;
    private int studentCount;
    private double rating;

    public Instructor(int id, String name, String email, String password, int salary, int courseNumber, int studentCount, double rating) {
        super(id, name, email, password);
        this.salary = salary;
        this.courseNumber = courseNumber;
        this.studentCount = studentCount;
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }


}

