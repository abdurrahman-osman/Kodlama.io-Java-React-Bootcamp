package Week2.Homework1.Managers;


import Week2.Homework1.Models.Instructor;

public class InstructorsManager extends Week2.Managers.UserManager {
    public void postCourse(Instructor instructor){
        System.out.println(instructor.getName() + " posted a new course");
    }
    public void checkPayment(Instructor instructor){
        System.out.println(instructor.getName() + " checked payment");
    }
}
