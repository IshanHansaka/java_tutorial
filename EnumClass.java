public class EnumClass {
    public static void main(String[] args) { 
        for (Laptop lap: Laptop.values()) {
            System.out.println(lap + " => " + lap.getPrice() + "$");
        }
    }
}

enum Laptop {
    Macbook(1500), Vivobook(1350), Thinkpad, Surface(1200);

    private int price;

    private Laptop() {
        this.price = 1000;
    }

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
