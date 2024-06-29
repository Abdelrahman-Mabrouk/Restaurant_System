package User_main;
import Admin_main.*;

import java.util.Scanner;

public class Receipt {
 public static void printReceipt() {
  int total = 0;
  System.out.println("Receipt:");
  System.out.println("-----------------------------");
  System.out.print("1 ");
  System.out.println(Order.sandwich.getname()+ "    "+Order.sandwich.getprice());
  total = Order.sandwich.getprice();
  if(Order.additions != null) {
   for (int i = 0; i < Order.additions.size(); i++) {
    System.out.println("1 " + Order.additions.get(i).getName() + "    " + Order.additions.get(i).getPrice());
    total += Order.additions.get(i).getPrice();
   }
  }
  System.out.println("Total price is "+total);
  System.out.println("-----------------------------");
  System.out.println("1- Back to menu");
  System.out.println("2- Exit");
  Scanner scan = new Scanner(System.in);
  int choice = scan.nextInt();
  switch (choice) {
   case 1:
    Order.additions.clear();
    Restaurant_System.run();
   case 2:


  }

 }
}
