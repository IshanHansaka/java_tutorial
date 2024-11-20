public class StringBlock {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        Phone p2 = new Phone();
    }
}

class Phone {
    int phoneId;
    String name;
    static double price;

    Phone() {
        phoneId = 0;
        name = "";
        System.out.println("in constructor");
    }

    static {
        price = 12.25;
        System.out.println("in static block");
    }
}