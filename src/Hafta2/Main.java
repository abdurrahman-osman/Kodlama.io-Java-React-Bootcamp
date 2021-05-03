package Hafta2;



import Hafta2.Models.*;
import Hafta2.Managers.*;

public class Main {
    public static void main(String[] args) {
        Instructor instructor = new Instructor(1,"ahmet","ahmet@mail.com","Abc123456",4000,2,100,4.5);
        Student student = new Student(2,"mehmet","mehmet@mail.com","Mop1233","1112",2);

        StudentManager studentManager = new StudentManager();
        InstractorManager instructorManager = new InstractorManager();

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

