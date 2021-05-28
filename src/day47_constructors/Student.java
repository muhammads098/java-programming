package day47_constructors;

public class Student {
    // No_args constructor
    public Student(){
        System.out.println("No-Args constructor");
    }
    // constructor overloading with param: String name
    public Student(String name){
        System.out.println("name param constructor | name = "+name);
    }
}
