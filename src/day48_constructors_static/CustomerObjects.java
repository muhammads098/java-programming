package day48_constructors_static;

import java.util.ArrayList;
import java.util.List;

public class CustomerObjects {
    public static void main(String[] args) {
        Customer cs1=new Customer();
        System.out.println(cs1.toString());//print with default values that are set in no-args constructor
        cs1.setId(1234);
        cs1.setName("Bob");
        System.out.println(cs1);

        Customer cs2=new Customer("Mike ",3412);//create object and assign values in same statement
        Customer cs3=new Customer("John Ward ", 4873);
        System.out.println(cs2);
        System.out.println(cs3);

        //array of customers
        Customer[] todaysCustomers={cs1,cs2,cs3,new Customer("Bashir ",4498) };

        //arrayList of Customer Objects
        List<Customer>customerList=new ArrayList<>();
        customerList.add(cs1);
        customerList.add(cs2);
        customerList.add(cs3);
        customerList.add(new Customer("Bashir ",4498));
        customerList.add(new Customer("Suleyman ",9763));
        customerList.add(new Customer("Shoaib ",777));

        //Print info of first customer object in array and arrayList.
        System.out.println(todaysCustomers[0]);
        System.out.println(customerList.get(5));
        System.out.println(customerList);

        System.out.println("-------For Loop-------");

        for (int i = 0; i < customerList.size(); i++) {
            System.out.println(customerList.get(i));
        }
        System.out.println("---------For Each Loop-------");

        for (Customer eachCustomer:customerList){
            System.out.println(eachCustomer);
        }
        //print only names of Customers in the list
        System.out.println("-----Name of customers----");
        for (Customer each:customerList){
            System.out.println(each.getName());
        }


    }
}
