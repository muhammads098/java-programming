package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Fairfax";
        if (city.equals("Moscow") || city.equals("Tampa")){
            System.out.println("Iam willing to relocate "+city);
        }else{
            System.out.println("Not considering - "+city);


        }
        String teacher="Murodil";
        if (teacher.equals("Saim")||teacher.equals("Murodil")){
            System.out.println("It is a Java Class with "+teacher);
        } else{
            System.out.println("SOft Skill class with "+teacher);
            teacher="Murdoil";
        }
        if (teacher.equals("Murdodil")||teacher.equals("Saim")){
            System.out.println("It is Java class with " +teacher);
        }else if (teacher.equals("Nadir")){
            System.out.println("Soft skills class with "+teacher);
        }else {
            System.out.println("Some class with " +teacher);
        }
        String company="google";
        double salary=120_000;
        if (company.equals("google")||salary>=120_000){
            System.out.println("Great i will accept the offer from "+company);
        }else{
            System.out.println("Rejecting the offer from " +company);
        }
    }
}



