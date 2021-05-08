package day41_arraylist;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {
        List<String> myCars = new ArrayList<>();
        myCars.add("toyota");
        myCars.add("mazda");
        myCars.add("ford");
        myCars.add("moskvich");
        myCars.add("tesla");
        myCars.add(0, "jeep");
        myCars.add(1, "lada");
        myCars.add(2, "yugo");

        System.out.println(myCars.toString());
        String allCarsIn1St = myCars.toString();
        System.out.println("allCarsIn1St = " + allCarsIn1St);

        myCars.set(0, "Lamborghini");
        System.out.println("After Set = " + myCars.toString());

        // change 4 to honda
        myCars.set(4, "honda");
        System.out.println("After set honda = " + myCars.toString());

        // find the index number of "ford"
        System.out.println("index of ford = " + myCars.indexOf("ford"));

        int moskvichIndex = myCars.indexOf("moskvich");
        System.out.println("moksvichIndex = " + moskvichIndex);

        myCars.set(moskvichIndex, "jiguli");
        System.out.println("After set to jiguli = " + myCars);

        myCars.set(myCars.indexOf("ford"), "trabant");
        System.out.println("Afetr set to trabant = " + myCars);

        for (int i = 0; i < myCars.size(); i++) {
            if (myCars.get(i).equalsIgnoreCase("lamborghini")) {
                myCars.set(i, "prius");
            } else if (myCars.get(i).equalsIgnoreCase("trabant")) {
                myCars.set(i, "audi");
            } else if (myCars.get(i).equalsIgnoreCase("lada")) {
                myCars.set(i, "lexus");
                System.out.println("myCars = " + myCars);
            }
        }
    }
}






