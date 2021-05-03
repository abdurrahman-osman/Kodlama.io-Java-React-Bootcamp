package Hafta1;

public class Instructor {
    int id;
    String name;
    String info;

    public Instructor(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Instructor(String name){
        this.name=name;
    }

    public Instructor(int id, String name, String info){
        this.id = id;
        this.name = name;
        this.info = info;
    }
}
