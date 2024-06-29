import Admin_main.*;
import User_main.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Are you Admin Y/N");
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        if (choice.equals("Y")) {
            System.out.println("Enter 1 to Add item.");
            System.out.println("Enter 2 to Add addition.");
            Scanner sc1 = new Scanner(System.in);
            int a = sc1.nextInt();
            if (a == 1) {
                Add_Item add_item = new Add_Item();
                add_item.print();
            }
            else if (a == 2) {
                Add_Addition add_addition = new Add_Addition();
                add_addition.print();

            }
        }
        else if (choice.equals("N")) {
            Restaurant_System.run();
        }
    }
}