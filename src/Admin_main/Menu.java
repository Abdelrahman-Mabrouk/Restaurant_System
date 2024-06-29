package Admin_main;

public class Menu {
    public static void display_menu(){
        System.out.println("Menu: ");
        for(int i=1;i<=DataBase.sandwichList.size();i++){
            System.out.println(i+"- "+DataBase.sandwichList.get(i-1).getname());
        }
    }
    public static void print_addition() {
        System.out.println("Addition: ");
        for(int i=1;i<=DataBase.additionList.size();i++){
            System.out.println(i+"- "+DataBase.additionList.get(i-1).name_addition);
        }
    }
}

