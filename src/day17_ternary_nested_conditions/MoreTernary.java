package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate=50;
        String result=(hourlyRate>45)? "accept":"reject";
        System.out.println("result = " + result);

        String todaysClass="softskills";
        String teacher=(todaysClass.equals("java"))? "Murodil,saim" : "Nadir";
        System.out.println("Today's Teacher = " + teacher);

        boolean isEligibleToDrive=true;
        String driving=(isEligibleToDrive)? "Have DL, CAN DRIVE":"Cannot Drive";
        System.out.println("driving = " + driving);


    }
}
