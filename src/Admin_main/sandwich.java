package Admin_main;
public class sandwich {
    private String name_sandwich;
    private int price;
    public sandwich(String name, int price) {
        this.name_sandwich = name;
        this.price = price;
    }
    public String getname(){
        return name_sandwich;
    };
    public int getprice(){
        return price;
    };
}

