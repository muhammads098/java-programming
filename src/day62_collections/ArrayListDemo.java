package day62_collections;
import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer>nums=new ArrayList<>();
        List<String>cities=new ArrayList<>();
        Collection<String>schools=new ArrayList<>();


        cities.add("McLean");
        cities.add("Vienna");
        cities.add("New York");

        System.out.println("cities = " + cities);
        System.out.println(cities.get(0));


    }

}
