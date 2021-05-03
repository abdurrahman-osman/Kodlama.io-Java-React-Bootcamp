package Hafta2.Managers;

import Hafta2.Models.User;

public class StudentManager extends UserManager{
    public void enrollCourse(User user){
        System.out.println(user.getName() + " enrolled to course");
    }
    public void rate(User user){
        System.out.println(user.getName() + " rated course");
    }
    public void pay(User user){
        System.out.println(user.getName() + " payed for new course");
    }
}
