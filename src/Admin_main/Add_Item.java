package Admin_main;
import java.util.Scanner;

public class Add_Item {
    String name;
    int price;
    public void print() {
        System.out.println("New Sandwich: ");
        System.out.println("Enter name: ");
        Scanner sc = new Scanner(System.in);
         name = sc.nextLine();
        System.out.println("New price: ");
        price = sc.nextInt();
        System.out.println("Confirm:Y/N ");
        Scanner sc2 = new Scanner(System.in);
        char ch = sc2.next().charAt(0);
        if (ch == 'Y') {
            sandwich sandwiches = new sandwich(name, price);
            DataBase.addSandwich(sandwiches);
        }
        else if (ch == 'N') {
        }
        else {
            System.out.println("Invalid input");
        }
    }
}
