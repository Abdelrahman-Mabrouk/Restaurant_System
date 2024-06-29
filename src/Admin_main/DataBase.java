package Admin_main;

import User_main.*;

import java.util.ArrayList;
import java.util.Scanner;

public class DataBase {
    public static ArrayList<Addition> additionList;
    public static ArrayList<sandwich> sandwichList;
    static {
        additionList = new ArrayList<>();
        additionList.add(new Addition("Cheese", 1));
        additionList.add(new Addition("Bacon", 2));

        sandwichList = new ArrayList<>();
        sandwichList.add(new sandwich("Chicken Sandwich", 5));
        sandwichList.add(new sandwich("Beef Sandwich", 7));
    }

    public static void addSandwich(sandwich sandwich) {
        sandwichList.add(sandwich);
    }

    public static void addAddition(Addition addition) {additionList.add(addition);}
//    public void display_items(ArrayList <T> list) {
//        for (int i = 1; i <+ list.size(); i++) {
//            System.out.println(i+"- "+list.get(i-1).getname());
//        }
//    }
//    public void delete_item() {
//        boolean found = false;
//        System.out.println("Enter name Sandwich you want to delete: ");
//        Scanner sc = new Scanner(System.in);
//        String Name = sc.nextLine();
//        for (sandwich sandwich : sandwichList) {
//            if(Name.equals(sandwich.name)){
//                sandwichList.remove(sandwich);
//                found=true;
//                break;
//            }
//        }
//        if (!found) {
//            for (Addition addition : additionList) {
//                    if(Name.equals(addition)){
//                    additionList.remove(addition);
//                    found=true;
//                    break;
//                }
//            }
//        }
//        if (!found) {
//            System.out.println("not found!");
//        }
//    }
}
