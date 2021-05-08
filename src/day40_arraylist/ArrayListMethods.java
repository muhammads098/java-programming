package day40_arraylist;
import java.util.*;
public class ArrayListMethods {
    public static void main(String[] args) {

        List<String>shoppingList=new ArrayList<>();

        System.out.println("size = "+shoppingList.size());
        System.out.println("is empty ? = "+shoppingList.isEmpty());
        if (shoppingList.isEmpty()){
            System.out.println("List is empty, keep coding java");
        }else{
            System.out.println("List is not empty, code java");
        }

        shoppingList.add("shoes");
        shoppingList.add("cheap monitor");
        shoppingList.add("masks");
        shoppingList.add("wooden spoon");
        shoppingList.add("scooter");
        shoppingList.add("java book");
        shoppingList.add("tesla");

        System.out.println("is empty ? = "+shoppingList.isEmpty());
        if (shoppingList.isEmpty()){
            System.out.println("List is empty, keep coding java");
        }else{
            System.out.println("List is not empty, code java");
        }

        int count = shoppingList.size();
        System.out.println("items to buy = "+count);

        System.out.println("is shoes in my list? "+shoppingList.contains("shoes"));

        if (shoppingList.contains("shoes")){
            System.out.println("shoes on the list");
        }else{
            System.out.println("shoes not on the list");
        }

        shoppingList.remove("shoes");
        System.out.println("list = "+shoppingList);

    }
}
