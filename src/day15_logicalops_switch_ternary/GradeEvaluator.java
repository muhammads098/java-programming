package day15_logicalops_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {
        char grade='B';
        if (grade=='A'||grade=='B'||grade=='C'){
            System.out.println("You passed with grade- "+grade);
        }else if(grade=='D'){
            System.out.println("qualify for a retake. Grade- "+grade);
        }else if(grade=='E'){
            System.out.println("Fail. Grade-"+grade);
        }else{
            System.out.println("Invalid Grade. "+grade);
        }


        }

    }

