package day37_methods_overloading;

public class DaySelector {
    public static void main(String[] args) {
        System.out.println(getDayName(1));
        System.out.println(getDayName(4));
        System.out.println(getDayName(12));

        for (int i = 0; i < 9; i++) {
            System.out.println(getDayName(i));
        }
        String today=getDayName(6);
        System.out.println("Today = "+ today);

    }

    public static String getDayName (int day) {
        switch (day) {
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
            default:
                System.out.println("Invalid Day - "+day);
                return null;

        }
    }
}