package day20_string_manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {
        String jobTitle="" ;
        System.out.println(jobTitle.isEmpty());
        System.out.println(jobTitle.length());
        System.out.println(jobTitle.equals(""));
        System.out.println(jobTitle.equals("java"));
        System.out.println(jobTitle.length()==0);

        if (jobTitle.isEmpty()){
            System.out.println("JobTitle is missing, please resend");
        }else{
            System.out.println("Job title looks good");
        }
        if (jobTitle.length()==0){
            System.out.println("job title is empty");
        }else{
            System.out.println("Job title is not empty");
        }
        System.out.println(jobTitle.equals(""));
        if ("".equals(jobTitle)){
            System.out.println("job title is empty");
        }else{
            System.out.println("job title is not empty");
        }

        String word=" ";
        System.out.println(word.isEmpty());
        System.out.println(word.length());

        String  veggie="carrots";
        System.out.println(veggie.isEmpty());
        if (!veggie.isEmpty()){
            System.out.println("we have "+ veggie);

        }



    }
}
