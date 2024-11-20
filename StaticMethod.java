public class StaticMethod {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.id = 1;
        p1.price = 1500;
        p1.phone = "Mobile Phone";
        p1.display();

        Phone p2 = new Phone();
        p2.id = 1;
        p2.price = 1500;
        p2.phone = " Phone";

        p1.display();
        p2.display();

        Phone.show();
    }
}

class Phone {
    int id;
    double price;
    static String phone;

    public void display() {
        System.out.println(id + " " + price + " " + phone);
    }

    public static void show() {
        System.out.println("This si a static method");
        System.out.println(phone); //only use static variables
    }
}
