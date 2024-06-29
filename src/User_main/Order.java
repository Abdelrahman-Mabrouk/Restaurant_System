package User_main;

import Admin_main.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    public static sandwich sandwich;
    public static ArrayList<Addition> additions = new ArrayList<>();
    public int get_order_sandwich() {
        System.out.println("Please Select option:");
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        boolean valid_option = false;
        for (int i = 1; i <= DataBase.sandwichList.size(); i++) {
            if (option == i) {
                sandwich = new sandwich(DataBase.sandwichList.get(i - 1).getname(), DataBase.sandwichList.get(i - 1).getprice());
                valid_option = true;
            }
        }
        if (!valid_option) {
            System.out.println("Invalid option");
            return 0;
        }
    return 0;
    }
    public int get_order_addition() {
        Menu.print_addition();
        for (int j = 0; j < DataBase.additionList.size(); j++) {
            boolean valid_option = false;
            System.out.println("Please Select option:");
            Scanner input = new Scanner(System.in);
            int option = input.nextInt();
            for (int i = 1; i <= DataBase.additionList.size(); i++) {
                if (option == i) {
                    additions.add(new Addition(DataBase.additionList.get(i - 1).getName(), DataBase.additionList.get(i - 1).getPrice()));
                    valid_option = true;
                }
            }
            if (!valid_option) {
                System.out.println("Invalid option");
                return 0;
            }
            System.out.println("if you finish enter (Y) or Enter (N) to complete:");
            Scanner input2 = new Scanner(System.in);
            char optioon = input2.next().charAt(0);
            if (optioon == 'Y') {
                break;
            }

        }
        return 0;
    }

    public static void print_order() {
        System.out.println("Order is :");
        System.out.println(sandwich.getname());
        if (additions != null) {
            for (int i = 0; i < additions.size(); i++) {
                System.out.print(additions.get(i).getName());
                if (i != additions.size() - 1) {
                    System.out.print(" + ");
                }
            }
        }
            System.out.println("");
            System.out.println("1- Confirm");
            System.out.println("2- Back to menu");
            Scanner in = new Scanner(System.in);
            int option2 = in.nextInt();
            if (option2 == 1) {
                Receipt.printReceipt();
            } else if (option2 == 2) {
                Order.sandwich = null;
                Order.additions = null;
                Restaurant_System.run();

            }
        }
    }

