package day14_multi_branch_if_statements;

public class YesOrNO {
    public static void main(String[] args) {
        System.out.println("Are you sure you want to delete this file?");
        char selection = 'y';
        boolean answer ;
        answer = true;
        if (selection == 'y') {

            System.out.println("your file will be deleted");
            answer = true;
        } else {
            System.out.println("file deletion is cancelled");
            answer = false;
        }
        System.out.println("did file get deleted?" + answer);


    }
}
