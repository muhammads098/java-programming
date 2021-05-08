package OfficeHours;

public class ArmyQualification {
    public static void main(String[] args) {
        String citizenship="USA";
        boolean resident=true;
        int age=18;
        boolean hasDiploma=true;
        if (citizenship.equalsIgnoreCase("USA")||resident){
            if (age>=18&&age<=35){
                if (hasDiploma){
                    System.out.println("you are qualified for the US army");
                }else{
                    System.out.println("you must have a high school diploma");
                }
            }else{
                System.out.println("Your age must be 18 to 35");
            }

        }else{
            System.out.println("you Must be a U.S. Citizen or a resident");
        }
    }
}
