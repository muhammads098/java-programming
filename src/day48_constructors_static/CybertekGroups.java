package day48_constructors_static;

import java.util.ArrayList;
import java.util.Arrays;

public class CybertekGroups {
    public static void main(String[] args) {
        //dependency injection. group object depends on string name
        Group group1=new Group("Cyberbugs");
        //print size of members
        System.out.println(group1.getMembers().size());
        group1.addMember("Berk");
        group1.addMember("Pavel");
        group1.addMember("Elvin");
        group1.addMember("Ali");
        group1.addMember("Parvin");
        group1.addMember("Rasim");
        group1.addMember("Maria");

        System.out.println(group1.getMembers().size());
        System.out.println(group1);

        Group group2=new Group("CyberCats");
        group2.setMembers(Arrays.asList("Stephen "," Akrem ","Bulent "," Andrea ","Andrey"));

        //print all members
        System.out.println("group 2 members "+group2.getMembers());

        //Use if statement to check if Akrem is in group 2
        if (group2.getMembers().contains("Akrem")){
            System.out.println("Akrem is member of group 2 ");
        }else{
            System.out.println("AKrem is not a member of group 2 ");
        }
    }
}
