package Week2.Managers;

import Week2.Models.Instructor;

public class InstructorsManager extends UserManager{
    public void postCourse(Instructor instructor){
        System.out.println(instructor.getName() + " posted a new course");
    }
    public void checkPayment(Instructor instructor){
        System.out.println(instructor.getName() + " checked payment");
    }
}
