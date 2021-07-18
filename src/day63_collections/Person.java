package day63_collections;

public class Person {
    String person;
    int age;

    public Person(String person, int age) {
        this.person = person;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "person='" + person + '\'' +
                ", age=" + age +
                '}';


    }
}

