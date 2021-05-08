package day14_multi_branch_if_statements;

public class ChooseLanguage {
    public static void main(String[] args) {
        System.out.println("Choose your language ");
        int selection = 1;
        if (selection == 1) {
            System.out.println("hello, thank you for your call");
        } else if (selection == 2) {
            System.out.println("merhaba,aradinginiz icin tesekkur");
        } else if (selection == 3) {
            System.out.println("Zdravstvuyte, spasibo za vash zvonok");
        }else if (selection==4){
            System.out.println("System.out.printlnMerci, pour votre appel");
        }else {
            System.out.println("lets talk english,hello");
        }

    }
}
