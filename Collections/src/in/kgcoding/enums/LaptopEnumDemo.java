package in.kgcoding.enums;

enum Laptop{
    Macbook(2000),
    DellInspiron(1200),
    ThinkPad(1500),
    IdeaPad(1000),
    Aspire;

    private int price;
    Laptop() {
        price = 500;
    }

    private Laptop(int price) {     //Private constructor is used in the same class
        this.price = price;
        System.out.println("In laptop "+ this.name());
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class LaptopEnumDemo {
    public static void main(String[] args) {
        System.out.println("=============================");
        for(Laptop lap : Laptop.values()){
            System.out.println("\n[ "+lap + " : " + lap.getPrice()+" ]") ;
        }
    }
}
