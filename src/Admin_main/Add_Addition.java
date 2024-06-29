package Admin_main;

import java.util.Scanner;

public class Add_Addition {
    public String name;
    public int price;
    public void print() {
        System.out.println("New Addition: ");
        System.out.println("Enter name: ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("New price: ");
        price = sc.nextInt();
        System.out.println("Confirm:Y/N ");
        Scanner sc2 = new Scanner(System.in);
        char ch = sc2.next().charAt(0);
        if (ch == 'Y') {
            Addition addition = new Addition(name, price);
            DataBase.addAddition(addition);
        }
        else if (ch == 'N') {
        }
        else {
            System.out.println("Invalid input");
        }
    }
}
