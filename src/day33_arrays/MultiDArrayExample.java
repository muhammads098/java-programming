package day33_arrays;
import java.util.*;
public class MultiDArrayExample {
    public static void main(String[] args) {
        String[][] users = new String[3][2];
        users[0][0] = "Teodora Tsvetanov";
        users[0][1] = "TeodorasPWD12";
        users[1][0] = "Anna Ziyaeva";
        users[1][1] = "AnnaAlmaty123";
        users[2][0] = "Parvin Altae";
        users[2][1] = "ParvinVienna321";

        System.out.println(users[0][0]);
        System.out.println(users[1][0]);
        System.out.println(users[2][0]);

        System.out.println(users[0][1]);
        System.out.println(users[1][1]);
        System.out.println(users[2][1]);

        System.out.println(Arrays.deepToString(users));


    }
}
