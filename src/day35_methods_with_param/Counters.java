package day35_methods_with_param;

public class Counters {
    public static void main(String[] args) {
        counts(10);
        counts(11);
        int num2=46;
        counts(num2);

        String word="Wooden Spoon";
        counts(word.length());

        printAge(1998);

    }

    public static void counts(int num) {
        for (int i = 0; i <= num; i++) {
            System.out.print(i +" ");

        }
        System.out.println();
    }
    public static void printAge(int year){
        int age = 2021-year;
        System.out.println("Birth year: "+year + " Age: " + age);

    }
}

