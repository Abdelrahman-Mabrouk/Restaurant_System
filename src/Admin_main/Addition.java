package Admin_main;

public class Addition {
   public String name_addition;
   public int price;
   public Addition(String name, int price) {
       this.name_addition = name;
       this.price = price;
   }
   public String getName() {
       return name_addition;
   }
   public int getPrice() {
       return price;
   }
}
