package day50_inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Bakyt";
        p1.age = 30;

        p1.talk();
        p1.walk();
        p1.work("SDET");

        Teacher t1 = new Teacher();
        t1.teacherID = 1234;
        t1.name = "Saim";
        t1.age = 25;
        t1.talk();

        Student student=new Student();
        student.name="ali";
        student.age=22;
        student.walk();
        student.talk();
        student.work("Java Programmer");
        student.school="Cubertek";
        student.study("java programming inheritance");



    }
}
