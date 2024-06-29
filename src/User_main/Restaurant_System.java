package User_main;

import Admin_main.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Restaurant_System {
    public static int run() {
        Menu.display_menu();
        Order order = new Order();
        order.get_order_sandwich();
        System.out.println("Do you want to add any addition?");
        System.out.println("Y/N");
        Scanner sc = new Scanner(System.in);
        char choice = sc.next().charAt(0);
        if (choice == 'Y') {
            order.get_order_addition();
            order.print_order();
        }
        else if (choice == 'N') {
            order.print_order();
        }
        else {
            System.out.println("Invalid choice");
        }



    return 0;
    }

}
