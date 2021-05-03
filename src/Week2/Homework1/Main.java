package Week2.Homework1;



import Week2.Homework1.Managers.InstructorsManager;
import Week2.Homework1.Managers.StudentManager;
import Week2.Homework1.Models.Instructor;
import Week2.Homework1.Models.Student;

public class Main {
    public static void main(String[] args) {
        Instructor instructor = new Instructor(1,"ahmet","ahmet@mail.com","Abc123456",4000,2,100,4.5);
        Student student = new Student(2,"mehmet","mehmet@mail.com","Mop1233","1112",2);

        StudentManager studentManager = new StudentManager();
        InstructorsManager instructorManager = new InstructorsManager();

        instructorManager.register(instructor);
        instructorManager.login(instructor);
        instructorManager.postCourse(instructor);
        instructorManager.checkPayment(instructor);
        instructorManager.update(instructor);
        instructorManager.delete(instructor);

        studentManager.register(student);
        studentManager.login(student);
        studentManager.enrollCourse(student);
        studentManager.pay(student);
        studentManager.rate(student);
        studentManager.delete(student);



    }
}

