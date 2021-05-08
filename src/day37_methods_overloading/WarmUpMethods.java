package day37_methods_overloading;

public class WarmUpMethods {
    public static void main(String[] args) {
        loginVoid("cybertekStudent","abc123");//POSITIVE TEST
        loginVoid("cybertekstudent","abc124");// NEGATIVE TEST
    }
    public static void loginVoid(String userName,String password){
        String secretUserName="cybertekStudent";
        String secretPassword="abc123";

        if (userName.equalsIgnoreCase(secretUserName)&&password.equals(secretPassword)){
            System.out.println("Login successful, welcome to Cybertek");
        }else{
            System.out.println("Incorrect username or password");
        }
    }
    public static boolean loginNonVoid (String username, String password) {
        String secretUsername = "cybertekStudent";
        String secretPassword = "abc123";
        if (username.equals(secretUsername) && password.equals(secretPassword)) {
            return true;
        } else {
            return false;
        }
    }
}
