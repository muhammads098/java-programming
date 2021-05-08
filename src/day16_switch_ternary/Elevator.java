package day16_switch_ternary;

import javax.crypto.spec.PSource;

public class Elevator {
    public static void main(String[] args) {
        int floorNum=1;
        if (floorNum==1){
            System.out.println("Floor 1 is selected. Companies: Lobby,Verizon, Starbucks");
        }else if (floorNum==2){
            System.out.println("Floor 2 is selected.Companies: Cybertek< NASA");
        }else if (floorNum==3){
            System.out.println("Floor 3 is selected. Companies: Lyft, BofA, Steak house");
        }else{
            System.out.println("Invalid Floor-" +floorNum);
        }
        floorNum=1;
        switch (floorNum){
            case 1:
                System.out.println("Floor 1 is selected. Companies: Lobby,Verizon, Starbucks");
                break;
            case 2:
                System.out.println("Floor 2 is selected.Companies: Cybertek,NASA");
                break;
            case 3:
                System.out.println("Floor 3 is selected. Companies: Lyft, BofA, Steak house");
                break;
            default:
                System.out.println("Invalid floor- "+floorNum);
                break;



        }

    }
}
