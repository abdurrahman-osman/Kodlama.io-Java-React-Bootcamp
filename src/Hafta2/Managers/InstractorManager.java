package Hafta2.Managers;

import Hafta2.Models.Instructor;

public class InstractorManager extends UserManager{
    public void postCourse(Instructor instructor){
        System.out.println(instructor.getName() + " posted a new course");
    }
    public void checkPayment(Instructor instructor){
        System.out.println(instructor.getName() + " checked payment");
    }
}
