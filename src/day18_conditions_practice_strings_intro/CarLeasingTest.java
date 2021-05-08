package day18_conditions_practice_strings_intro;

public class CarLeasingTest {
    public static void main(String[] args) {
        String make = "Mercedes";
        String model = "E";
        double leasePrice = 0.0;

        if (make.equals("Mercedes")) {
            if (model.equals('E')) {
                leasePrice = 500;
            } else if (model.equals("A")) {
                leasePrice = 400.0;
            }

        } else if (model.equals("Audi")) {
            if (make.contains("A")) {
                leasePrice = 552;
            } else if (make.equals("E")) {
                leasePrice = 423;
            }
        }
    }
}