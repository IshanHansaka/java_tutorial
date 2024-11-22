public class UpCastingAndDownCasting {
    public static void main(String[] args) {
        // Upcasting: Creating an object of subclass B and storing it in a superclass A reference
        A obj1 = new B(); // Upcasting happens here
        obj1.show1(); // Only methods available in superclass A can be accessed

        // Downcasting: Converting the superclass reference (obj1) back to subclass B reference
        B obj2 = (B) obj1; // Explicit downcasting
        obj2.show2();
        obj2.show1(); // Now, methods of subclass B can be accessed
    }
}

class A {
    public void show1() {
        System.out.println("In A - show1()");
    }
}

class B extends A {
    public void show2() {
        System.out.println("In B - show2()");
    }
}