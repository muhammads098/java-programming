package day30_arrays;

 class StudentArray {
    public static void main(String[] args) {
        String student [] = new  String[5];
        student [0] = "DD232";
        student [1] = "Muhammad";
        student [2] = "Shoaib";
        student [3] = "B22";
        student [4] = "718-1234-2345";

        System.out.println("Student ID: " +student[0]);
        System.out.println("Student first name: " + student[1]);
        System.out.println("Student last name: " + student[2]);
        System.out.println("Student batch number: " + student[3]);
        System.out.println("Student phone number: " + student[4]);

        String[] student1 = new String[5];
        student1[0] = "AD1234";
        student1[1] = "Adam";
        student1[2] = "Smith";
        student1[3] = "B22";
        student1[4] = "202-543-1234";

        System.out.println("student1 id = " + student1[0]);
        System.out.println("student1 firstname = " + student1[1]);
        System.out.println("student1 lastName = " + student1[2] );
        System.out.println("student1 batch num = " + student1[3]);
        System.out.println("student1 mobile num = " + student1[4]);

        System.out.println("student data length: " + student1.length);

        if (student.length==5){
            System.out.println("Pass: data array has 5 length");
        }else{
            System.out.println("Fail: data length is not correct");
        }

        if (student.length== student.length){
            System.out.println("Pass: data array length match");
        }else{
            System.out.println("Fail: data length doesnt match");
        }

        System.out.println(student1[1].toUpperCase() + " "+student1[2].toUpperCase());
    }
}
