package day32_arrays_split;

public class ShoppingItems {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 11 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        System.out.println("---------- Find The First Index Of 'Gloves' in items array");
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("Gloves")) {
                System.out.println("Gloves found at index: " + i);
                break;
            }
        }
        System.out.println("----------- Set boolean to true if first 'iPad' is found");
        boolean iPadExists=false;
        for (String item:items){
            if (item.equals("iPad")){
                iPadExists=true;
                break;
            }
        }
        System.out.println("iPad Exists = "+iPadExists);
        if (iPadExists) {
            System.out.println("we bought the ipad");
        }else {
            System.out.println("we forgot the ipad");
        }
        System.out.println("-------print a report of each shopping item-------");
        for (int i=0;i<items.length;i++){
            System.out.println(items[i]+" - $"+prices[i]+"  id is "+itemIDs[i]);
        }
        System.out.println("--------Look for 'Jacket' in items and print all details");
        for (int i =0;i<items.length;i++){
            if (items[i].equals("Jacket")){
                System.out.println(items[i]+"- $"+prices[i]+"-#"+itemIDs[i]);
            }



            }
        }

        }



