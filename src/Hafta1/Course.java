package Hafta1;



public class Course {
    int id;
    String name;
    Instructor ınstructor ;


    public Course(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Course(int id, String name, Instructor ınstructor) {
        this.id = id;
        this.name = name;
        this.ınstructor = ınstructor;
    }

}
