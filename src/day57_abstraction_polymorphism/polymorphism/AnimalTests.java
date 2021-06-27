package day57_abstraction_polymorphism.polymorphism;

import java.util.ArrayList;
import java.util.List;

public  class AnimalTests {
    public static void main(String[] args) {
        Animal a1 = new Animal(); // not polymorphic, data type and object type are the same
        a1.makeNoise();

        //Polymorphism - polymorphic way:
        Animal animal1=new Dog();
        Animal animal2=new Horse();
        Animal animal3=new Cat();

        animal1.makeNoise();
        animal2.makeNoise();
        animal3.makeNoise();

        //polymorphic list of objects. List data tyoe is parent class
        List<Animal> listOfAnimals=new ArrayList<>();
        listOfAnimals.add(new Dog());
        listOfAnimals.add(new Dog());
        listOfAnimals.add(new Cat());
        listOfAnimals.add(new Horse());
        for (Animal each : listOfAnimals) {
            each.makeNoise();

        }


    }
}
